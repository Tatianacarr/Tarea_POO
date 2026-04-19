import java.util.Scanner;
public class Inventario {
    private String codigo;
    private String nombre;
    private String categoria;
    private double precio;
    private int stock;
    private int stockM;

    public Inventario(String codigo, String nombre, String categoria,
                      double precio, int stock, int stockM){
        this.codigo=codigo;
        this.nombre=nombre;
        this.categoria=categoria;
        setPrecio(precio);
        setStock(stock);
        setStockM(stockM);
    }
    public void setPrecio(double precio){
        if (precio >0){
            this.precio=precio;
        }else {
            System.out.println("Precio invalido");
        }

    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("No puede ser negativo");
        }
    }
    public void setStockM(int stockM){
        if (stockM>=0){
            this.stockM=stockM;
        }else{
            System.out.println("Stock minimo invalido");
        }
    }
    public String getNombre(){
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    public double calcularIn(){
        return precio*stockM;
    }
    public String evaluar(){
        if (stock==0){
            return "Producto agotado";
        }else if(stock < stockM){
            return "Requiere reposicion";
        }else{
            return "Stock suficiente";
        }
    }
    public void mostrar(){
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
        System.out.println("Stock mínimo: " + stockM);
        System.out.println("Valor inventario: " + calcularIn());
        System.out.println("Estado: " + evaluar());
    }

}
