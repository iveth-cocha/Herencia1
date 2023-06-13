public class Menu {
    public static void main(String[] args) {

        Doctor persona1=new Doctor("Ana", 33,"leo", "","Pediatra");
        Empleado_publico persona2=new Empleado_publico("Pablo",0,"","123456",0);
        Futbolista persona3=new Futbolista("Martina",0,"","",5);
        Estudiante persona4=new Estudiante("Melani",0,"","",3);
        System.out.println(persona1.getNombre());

    }
}
