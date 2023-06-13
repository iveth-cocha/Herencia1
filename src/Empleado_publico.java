public class Empleado_publico extends Persona{
    private int oficina;

    public Empleado_publico(){
        super();
    }

    public Empleado_publico(String nombre, int edad, String signo, String telefono, int oficina) {
        super(nombre, edad, signo, telefono);
        this.oficina=oficina;
    }

    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }
}
