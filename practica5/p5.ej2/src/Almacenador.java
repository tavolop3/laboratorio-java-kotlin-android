import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Almacenador {
    public static void mapear(Object obj) {
        Class<?> c = obj.getClass();

        //tomar el nombre del archivo
        if (c.isAnnotationPresent(Archivo.class)) {
            String nom;
            Archivo archivo = c.getAnnotation(Archivo.class);
            if (!archivo.nombre().isEmpty()) {
                nom = archivo.nombre();
            } else {
                nom = c.getSimpleName()+".txt";
            }

            try (FileWriter writer = new FileWriter(nom)) {
                writer.write("<nombreClase>" + c.getSimpleName() + "</nombreClase>\n");

                // Recorrer los campos y escribir los anotados con @AlmacenarAtributo
                for (Field field : c.getDeclaredFields()) {
                    if (field.isAnnotationPresent(AlmacenarAtributo.class)) {
                        field.setAccessible(true); // Para acceder a atributos privados
                        String nombreAtributo = field.getName();
                        Object valorAtributo = field.get(obj);

                        // Escribir el nombre del atributo y su valor en el archivo
                        writer.write("<nombreAtributo>" + nombreAtributo + "</nombreAtributo>\n");
                        writer.write("<nombreValor>" + valorAtributo + "</nombreValor>\n");
                    }
                }
            } catch (IOException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Mapeado m = new Mapeado();
        mapear(m);
    }
}
