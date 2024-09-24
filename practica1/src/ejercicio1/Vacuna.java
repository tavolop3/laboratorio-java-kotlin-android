package ejercicio1;

public class Vacuna {
	private String marca,pais_origen,enfermedad;
	private int cant_dosis;
	
	public Vacuna(String marca, String pais_origen, String enfermedad, int cant_dosis) {
		super();
		this.marca = marca;
		this.pais_origen = pais_origen;
		this.enfermedad = enfermedad;
		this.cant_dosis = cant_dosis;
	}

	@Override
	public String toString() {
		String stringBuffer = marca + pais_origen + enfermedad + cant_dosis; 
		return stringBuffer;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.toString().equals(obj.toString());
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPais_origen() {
		return pais_origen;
	}

	public void setPais_origen(String pais_origen) {
		this.pais_origen = pais_origen;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	public int getCant_dosis() {
		return cant_dosis;
	}

	public void setCant_dosis(int cant_dosis) {
		this.cant_dosis = cant_dosis;
	}
	
	
}
