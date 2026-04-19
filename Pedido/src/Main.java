public class Main {
    public static void main(String[] args){
        Pedido p= new Pedido();
        p.registrar();
        p.calcularS();
        p.descuento();
        p.total();
        p.mostrar();
    }
}