package ejercicio2;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(int radio, String color) {
        this.radio = radio;
        setColor(color);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un círculo de radio "+radio+" y de color "+ this.getColor());
    }

    @Override
    public int area() {
        return (int) (Math.PI * Math.pow(radio, 2));
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
