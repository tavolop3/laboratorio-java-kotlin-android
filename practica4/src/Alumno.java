import java.util.Comparator;
import java.util.List;

public class Alumno implements Comparable<Alumno> {
    private String legajo,apellido,nombre,DNI;

    public Alumno(String legajo, String apellido, String nombre, String DNI) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "legajo='" + legajo + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    @Override
    public int compareTo(Alumno o) {
        return DNI.compareTo(o.getDNI());
    }
}
