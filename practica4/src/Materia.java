import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Alumno> alumnos = new LinkedHashSet<Alumno>();

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public Set<Alumno> getAlumnos(){
        return alumnos;
    }
}
