package TP2;
import java.util.Scanner;

public class CostoEnvioSimple {

    // Método para calcular el costo de envío
    public static double calcularCostoEnvio(double peso, String zona) {
        double costo = 0;

        if (zona.equals("Nacional")) {
            costo = peso * 5;
        } else if (zona.equals("Internacional")) {
            costo = peso * 10;
        } else {
            System.out.println("Zona no válida. Se considerará costo 0.");
        }

        return costo;
    }

    // Método para calcular el total de la compra
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        sc.nextLine(); // limpiar buffer
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precioProducto, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

        sc.close();
    }
}
