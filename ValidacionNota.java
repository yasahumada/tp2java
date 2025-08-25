package TP2;
import java.util.Scanner;

public class ValidacionNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
                 do {
            System.out.print("Ingrese una nota de 0 a 10: ");
            nota = sc.nextInt();

            // Si la nota no esta dentro de 0-10
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente: " + nota);

        sc.close();
    }
}
