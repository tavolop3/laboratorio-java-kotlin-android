import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Materia materia = new Materia("ISO");
        for (int i = 0; i < 10; i++) {
            String j = Integer.toString(i);
            materia.agregarAlumno(new Alumno(j,j,j,j));
        }
        Set<Alumno> alumnos = materia.getAlumnos();
        alumnos.forEach(a -> System.out.println(a));
    }
}