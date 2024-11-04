import com.sun.net.httpserver.*;
import java.io.*;
import java.lang.reflect.Method;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Contenedor {

    private static void registrarConexion(String archivo, String ipCliente) {
        try (FileWriter writer = new FileWriter(archivo, true)) {
            String fechaHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
            writer.write("Fecha: " + fechaHora + ", IP: " + ipCliente + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void levantarServidor(Class<?> c) throws IOException {
        if (!c.isAnnotationPresent(Servidor.class)) {
            throw new IllegalArgumentException("La clase no está anotada como @Servidor");
        }

        Servidor s = c.getAnnotation(Servidor.class);
        String dir = s.direccion();
        int pn = s.puerto();
        String arch = s.archivo();

        // Crear el servidor HTTP en la dirección y puerto especificados
        HttpServer server = HttpServer.create(new InetSocketAddress(dir, pn), 0);
        System.out.println("Servidor escuchando en " + dir + ":" + pn);

        // Configurar un contexto para manejar las peticiones entrantes
        server.createContext("/", exchange -> {
            // Ignorar solicitudes adicionales, como /favicon.ico
            String path = exchange.getRequestURI().getPath();
            if ("/favicon.ico".equals(path)) {
                exchange.sendResponseHeaders(404, -1);
                return;
            }

            String ipCliente = exchange.getRemoteAddress().getAddress().getHostAddress();
            registrarConexion(arch, ipCliente);

            // Instancia de la clase servidor
            try {
                Object instanciaServidor = c.getDeclaredConstructor().newInstance();

                // Invocar los métodos anotados con @Invocar
                for (Method metodo : c.getDeclaredMethods()) {
                    if (metodo.isAnnotationPresent(Invocar.class)) {
                        metodo.setAccessible(true);
                        metodo.invoke(instanciaServidor);
                    }
                }

                // Enviar respuesta al cliente
                String response = "Conexion manejada correctamente";
                exchange.sendResponseHeaders(200, response.getBytes().length);
                OutputStream os = exchange.getResponseBody();
                os.write(response.getBytes());
                os.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        server.start();
    }

    public static void main(String[] args) throws IOException {
        try {
            levantarServidor(Cualquiera.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
