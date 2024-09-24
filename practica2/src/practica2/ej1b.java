package practica2;

abstract class InstrumentoDeViento implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Vientos");
	}

	public String queEs() {
		return "Instrumento de Viento";
	}
}

abstract class InstrumentoDeCuerda implements InstrumentoMusical {
	public void hacerSonar(){
		System.out.println("Sonar Cuerdas");
	}
	
	public String queEs() {
		return "Instrumento de Cuerda";
	}
}