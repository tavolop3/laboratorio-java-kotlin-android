import java.util.ArrayList;
import java.util.List;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Alumno a1 = new Alumno(1,18,7,"Carlos","Gardel","ISO");
        Alumno a2 = new Alumno(2,20,10,"Lio","Messi","ISO");
        Alumno a3 = new Alumno(3,23,9,"Tavo","Lop","DIST");
        Alumno a4 = new Alumno(4,38,6,"Romba","Tuki","Laboratorio de Software");
        Alumno a5 = new Alumno(5,52,2,"Pollo","Epa","Romba");
        List<Alumno> alumnos = new ArrayList<Alumno>();
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        alumnos.add(a4);
        alumnos.add(a5);
        Facultad f = new Facultad(alumnos);

        //1
        out.println("Criterio 1");
        String aluMaxNota = f.getMayorNota();
        out.println("El alumno con mayor nota es:"+ aluMaxNota);

        //2
        out.println("Criterio 2");
        f.print2Estudiantes();

        //3
        out.println("Criterio 3");
        Alumno a = f.getAluLabo();
        if(a != null)
            out.println(a);
        else
            out.println("No hay alumno que curse labo");

        //4
        out.println("Criterio 4");
        List<Alumno> alus = f.getAlusFiltrados();
        if(!alus.isEmpty())
            alus.forEach(out::println);
        else
            out.println("No hay alumnos con el criterio 4");

        //criterio del b
        out.println("Criterio del b");
        f.ordenarPorNota().forEach(out::println);


    }
}