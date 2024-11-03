import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Facultad {
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    public Facultad(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public String getMayorNota() {
        Optional<Alumno> max = this.alumnos.stream().max(Comparator.comparingDouble(Alumno::getNotaAprobacion));
        if(max.isPresent()) {
            return max.get().toString();
        } else {
            return "-1";
        }

    }

    public void print2Estudiantes() {
        List<Alumno> alus = this.alumnos.stream().limit(2).toList();
        System.out.println(alus.get(0));
        System.out.println(alus.get(1));
    }

    public Alumno getAluLabo() {
        Optional<Alumno> alu = this.alumnos.stream().filter(a -> a.getMatAprobada().equalsIgnoreCase("Laboratorio de Software")).findAny();
        return alu.orElse(null);
    }

    public List<Alumno> getAlusFiltrados() {
        List<Alumno> alus = this.alumnos.stream().filter(a -> (a.getNom().startsWith("P")) && (a.getNom().length() <= 6)).toList();
        return alus;
    }

    public List<Alumno> ordenarPorNota() {
        List<Alumno> alus = this.alumnos.stream().sorted(Comparator.comparingDouble(Alumno::getNotaAprobacion).reversed()).toList();
        return alus;
    }
}
