package TP2;
import java.util.Scanner;

public class MayorDetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir los tres números
        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int num3 = sc.nextInt();

        int mayor;

        // Comparar para encontrar el mayor
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}

