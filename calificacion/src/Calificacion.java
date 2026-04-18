import java.awt.*;
import java.util.Scanner;
public class Calificacion {
    private String nombre;
    private double nota1,nota2,nota3;

    public void registrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante:");
        nombre=sc.nextLine();
        System.out.println("Ingrese la nota 1:");
        nota1= sc.nextDouble();
        System.out.println("Ingrese la nota 2:");
        nota2=sc.nextDouble();
        System.out.println("Ingrese la nota 3:");
        nota3=sc.nextDouble();
    }
    public double promedios(){
        return (nota1+nota2+nota3)/3;
    }
    public String estado(){
        double promedio= promedios();
        if (promedio>=7){
            return "Aprobado";
        }else{
            return "Reprobado";
        }
    }
    public void mostrar(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Promedio:"+promedios());
        System.out.println("Estado:"+estado());
    }
}
