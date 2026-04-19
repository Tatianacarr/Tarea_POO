public class Main {
    public static void main(String[] args) {

        // Registro inicial
        Inventario p = new Inventario(
                "PRD-105",
                "Disco SSD 1TB",
                "Almacenamiento",
                89.50,
                12,
                8
        );

        p.mostrar();

        System.out.println("--- ACTUALIZACIÓN ---");
        p.setPrecio(95.00);
        p.setStock(5);
        p.mostrar();
        System.out.println("--- INTENTO INVÁLIDO ---");
        p.setStock(-3);
        p.mostrar();
    }
}