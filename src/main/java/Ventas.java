public class Ventas {

    public static double calcularTotal(double precio, int cantidad) {
        if (precio < 0 || cantidad < 0) {
            throw new IllegalArgumentException("Valores no válidos");
        }
        return Math.round(precio * cantidad * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        System.out.println("Sistema de ventas");
        System.out.println("Total: " + calcularTotal(50, 2));
    }
}