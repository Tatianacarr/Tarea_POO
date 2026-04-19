import java.util.Scanner;
public class Empleado {
    private String nombre;
    private int horas;
    private double pagoH;

    public void registrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        nombre=sc.nextLine();
        System.out.println("Ingrese las horas trabajadas:");
        horas=sc.nextInt();
        System.out.println("Ingrese el pago por hora:");
        pagoH=sc.nextDouble();
    }
    public double calcularS(){
        return horas * pagoH;
    }
    public double bono(){
        double sueldoBase = calcularS();
        if (sueldoBase>400){
            return 20;
        }else{
            return 0;
        }
    }
    public double Final(){
        return calcularS()+bono();
    }
    public void mostrar(){
        System.out.println("Nombre:"+nombre);
        System.out.println("Sueldo base:"+calcularS());
        System.out.println("Bono:"+bono());
        System.out.println("Sueldo final:"+Final());
    }
}
