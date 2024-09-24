package ejercicio2;

import java.io.Serializable;

public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>, Serializable{
    private static final long serialVersionUID = 1L;
	private String color;

    public FiguraGeometrica(){
    }

    public abstract void dibujar();
    public abstract int area();

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }
    
    @Override
    public int compareTo(FiguraGeometrica otraFigura) {
    	return Double.compare(this.area(), otraFigura.area());
    }
}
