public class Doctor extends Persona{
    private String especialidad;

    public Doctor(){
        super();
    }

    public Doctor(String nombre, int edad, String signo, String telefono, String especialidad) {
        super(nombre, edad, signo, telefono);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void examinar(){
        System.out.println("Este es el metodo examinarr");
    }
}
