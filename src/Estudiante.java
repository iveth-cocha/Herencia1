public class Estudiante extends Persona{
    private int semestre;

    public Estudiante(){
        super();
    }

    public Estudiante(String nombre, int edad, String signo, String telefono, int semestre) {
        super(nombre, edad, signo, telefono);
        this.semestre=semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public void leer(){
        System.out.println("Este es el metodo leer");
    }
}
