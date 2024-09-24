package ejercicio2;

public class Rectangulo extends FiguraGeometrica{
    private int alto, ancho;

    public Rectangulo(int alto, int ancho, String color) {
        this.alto = alto;
        this.ancho = ancho;
        this.setColor(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo de alto "+ alto +", de ancho "+ ancho+" y de color "+ this.getColor());
    }

    @Override
    public int area() {
        return alto * ancho;
    }
}
