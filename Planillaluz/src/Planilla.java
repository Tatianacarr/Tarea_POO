import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Planilla {
    private String nombre;
    private double consumo;
    private double costo;

    public void registrar(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        nombre=sc.nextLine();
        System.out.println("Ingrese el consumo:");
        consumo=sc.nextDouble();
        System.out.println("Ingrese el costo:");
        costo=sc.nextDouble();
    }
    public double calcularSub(){
        return consumo * costo;
    }
    public double iva(){
        return calcularSub()*0.15;
    }
    public double total(){
        return calcularSub()+iva();
    }
    public void mostrar(){
        System.out.println("Cliente:"+nombre);
        System.out.println("Subtotal:"+calcularSub());
        System.out.println("Iva:"+iva());
        System.out.println("Total:"+total());
    }
}
