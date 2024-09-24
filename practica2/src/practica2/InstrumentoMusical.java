package practica2;

public interface InstrumentoMusical {
	public void hacerSonar();
	String queEs();
	default void afinar(){
		
	};
}

