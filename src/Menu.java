public class Menu {
    public static void main(String[] args) {

        Doctor persona1=new Doctor("Ana", 33,"leo", "","");
        Empleado_publico persona2=new Empleado_publico("Pablo",0,"","123456",0);
        Futbolista persona3=new Futbolista("Martina",0,"","",5);
        Estudiante persona4=new Estudiante("Melani",0,"","",3);

        System.out.println("-----Doctora------");
        System.out.println("Nombre: "+persona1.getNombre());
        System.out.println("Edad: "+persona1.getEdad());
        System.out.println("Signo: "+persona1.getSigno());
        persona1.examinar();
        System.out.println("-----empleado publico-----");
        System.out.println("Nombre: "+persona2.getNombre());
        System.out.println("Telefono: "+persona2.getTelefono());
        persona2.tramitar();
        System.out.println("-----Futbolista------");
        System.out.println("Nombre: "+persona3.getNombre());
        System.out.println("Entrena "+persona3.getHoras()+"Horas diarias");
        persona3.correr();
        System.out.println("-----Estudiante------");
        System.out.println("Nombre: "+persona4.getNombre());
        System.out.println("Semestre "+persona4.getSemestre());
        persona4.leer();

    }
}
