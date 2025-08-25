import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir precio y categoría
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        System.out.print("Ingrese la categoría (A, B o C): ");
        char categoria = sc.next().toUpperCase().charAt(0); // Convertir a mayúscula

        double descuento = 0;

        // Calcular el descuento según la categoría
        if (categoria == 'A') {
            descuento = 0.10 * precio;
        } else if (categoria == 'B') {
            descuento = 0.15 * precio;
        } else if (categoria == 'C') {
            descuento = 0.20 * precio;
        } else {
            System.out.println("Categoría inválida");
            sc.close();
            return; // Termina el programa si la categoría no es válida
        }

        double precioFinal = precio - descuento;

        // Mostrar resultados
        System.out.println("Precio original: $" + precio);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);

        sc.close();
    }
}
