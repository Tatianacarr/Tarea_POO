import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String carrera;
    private int edad;

    public void registrarDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre=sc.nextLine();
        System.out.println("Ingrese su carrera:");
        carrera=sc.nextLine();
        System.out.println("Ingrese su edad:");
        edad=sc.nextInt();

    }
    public void mostrarDatos(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Carrera:"+carrera);
        System.out.println("Edad:"+edad);

    }
}
