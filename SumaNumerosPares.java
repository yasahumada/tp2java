package TP2;
import java.util.Scanner;

public class SumaNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        // Ciclo que se repite hasta que el usuario ingrese 0
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();

            // Si el número es par y distinto de 0, lo sumamos
            if (numero != 0 && numero % 2 == 0) {
                sumaPares += numero;
            }

        } while (numero != 0); // termina cuando el usuario ingresa 0

        System.out.println("La suma de los números pares es: " + sumaPares);

        sc.close();
    }
}
