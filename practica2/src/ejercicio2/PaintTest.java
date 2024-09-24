package ejercicio2;

import java.util.Arrays;
import java.util.Collection;

public class PaintTest {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.init();
        
        FiguraGeometrica[] figuras = paint.getPaleta();
        Arrays.sort(figuras);

        HashSetAgregados<FiguraGeometrica> hs = new HashSetAgregados<FiguraGeometrica>();
        hs.addAll(Arrays.asList(figuras));
        System.out.println("Cantidad de agregados al hs: "+hs.getCantidadAgregados());
        
        for (FiguraGeometrica figura : figuras) {        	
            figura.dibujar();
            System.out.println("Área: " + figura.area());

            if (figura instanceof Circulo) {
                Circulo c = (Circulo) figura;
                System.out.println("Radio: " + c.getRadio());
            }
        }

        
    }
}
