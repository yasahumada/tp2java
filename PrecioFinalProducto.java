package TP2;
import java.util.Scanner;

public class PrecioFinalProducto {

    // Método que calcula el precio final
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        // Convertir porcentajes a valores decimales
        impuesto = impuesto / 100;
        descuento = descuento / 100;

        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir datos al usuario
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = sc.nextDouble();

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = sc.nextDouble();

        // Llamar al método para calcular el precio final
        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        // Mostrar resultado
        System.out.println("El precio final del producto es: " + precioFinal);

        sc.close();
    }
}
