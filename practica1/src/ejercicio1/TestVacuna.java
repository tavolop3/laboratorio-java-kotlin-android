package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class TestVacuna {
	private static List<Vacuna> vacunas;
	
	public static void main(String[] args) {
		vacunas = new ArrayList<Vacuna>();
		vacunas.add(new Vacuna("Pfizer","USA","Covid",10));
		vacunas.add(new Vacuna("Pfizer","USA","Covid",10));

		vacunas.add(new Vacuna("MacacoLabs","Brazil","MonkeyPox",3));
		vacunas.add(new Vacuna("ElcorrectoLabs","Suiza","Sida",6));
		vacunas.add(new Vacuna("ChachitoLabs","Argentina","Cancer",2));
		vacunas.add(new Vacuna("Golper","Holanda","Gripe",4));
		vacunas.forEach(v -> System.out.println(v));
		System.out.print(vacunas.get(0).equals(vacunas.get(1)));
	}

}
