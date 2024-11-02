public class Alumno {
    private int nroAlumno, edad;
    private double notaAprobacion;
    private String nom,ape,matAprobada;

    public Alumno(int nroAlumno, int edad, double notaAprobacion, String nom, String ape, String matAprobada) {
        this.nroAlumno = nroAlumno;
        this.edad = edad;
        this.notaAprobacion = notaAprobacion;
        this.nom = nom;
        this.ape = ape;
        this.matAprobada = matAprobada;
    }

    public int getNroAlumno() {
        return nroAlumno;
    }

    public void setNroAlumno(int nroAlumno) {
        this.nroAlumno = nroAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNotaAprobacion() {
        return notaAprobacion;
    }

    public void setNotaAprobacion(double notaAprobacion) {
        this.notaAprobacion = notaAprobacion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getMatAprobada() {
        return matAprobada;
    }

    public void setMatAprobada(String matAprobada) {
        this.matAprobada = matAprobada;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nroAlumno=" + nroAlumno +
                ", edad=" + edad +
                ", notaAprobacion=" + notaAprobacion +
                ", nom='" + nom + '\'' +
                ", ape='" + ape + '\'' +
                ", matAprobada='" + matAprobada + '\'' +
                '}';
    }
}
