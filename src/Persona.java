public class Persona {
    private String nombre;
    private int edad;
    private String signo;
    private String telefono;
    public Persona(){
    }

    public Persona(String nombre, int edad, String signo, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.signo = signo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void metodo(){
        System.out.println("Este es el detalle general del metodo");
    }
}
