import java.util.Scanner;
public class Pedido {
    private String nombre;
    private String plato;
    private double precio;
    private int cantidad;
    public void registrar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        nombre=sc.nextLine();
        System.out.println("Ingrese el plato: ");
        plato=sc.nextLine();
        System.out.println("Ingrese el precio:");
        precio=sc.nextDouble();
        System.out.println("Ingrese la cantidad:");
        cantidad=sc.nextInt();
    }
    public double calcularS(){
        return precio*cantidad;
    }
    public double descuento(){
        double subtotal= calcularS();
        if (subtotal>25){
            return subtotal*0.10;
        }else{
            return 0;
        }
    }
    public double total(){
        return calcularS() -descuento();
    }
    public void mostrar(){
        System.out.println("Cliente:"+nombre);
        System.out.println("Plato:"+plato);
        System.out.println("Precio:"+precio);
        System.out.println("Cantidad:"+cantidad);
        System.out.println("Subtotal:"+calcularS());
        System.out.println("Descuento:"+descuento());
        System.out.println("Total:"+total());

    }
}
