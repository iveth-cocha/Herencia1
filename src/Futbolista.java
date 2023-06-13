public class Futbolista  extends Persona {
    private int horas;

    public Futbolista(){
        super();
    }

    public Futbolista(String nombre, int edad, String signo, String telefono, int horas) {
        super(nombre, edad, signo, telefono);
        this.horas=horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void correr(){
        System.out.println("Este es el metodo correr");
    }
}
