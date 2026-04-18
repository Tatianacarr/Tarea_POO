import java.util.Scanner;
public class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public void Registrar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        nombre = sc.nextLine();
        System.out.println("Ingrese el precio:");
        precio = sc.nextDouble();
        System.out.println("Ingrese la cantidad:");
        cantidad = sc.nextInt();
    }

    public void mostrar(){
        double total = precio * cantidad;
        if (total > 1000) {
            double descuento = total * 0.10;
            total = total - descuento;
        }
        System.out.println("Nombre:"+nombre);
        System.out.println("Precio:"+precio);
        System.out.println("Cantidad:"+cantidad);
        System.out.println("Total:"+total);
    }


}
