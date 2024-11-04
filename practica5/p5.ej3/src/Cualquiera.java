@Servidor(direccion = "localhost", puerto = 8080, archivo = "logueo.txt")
public class Cualquiera {
    @Invocar
    public void imprimir() {
        System.out.println("Este metodo deberia correr cuando un cliente se conecta.");
    }

    @Invocar
    public void ejemplo() {
        System.out.println("Este tmbn");
    }
}
