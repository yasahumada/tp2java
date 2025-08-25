package TP2;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
          // Clasificar según la edad
        if (edad < 12) {
            System.out.println("Niño");
        } else if (edad >= 12 && edad <= 17) {
            System.out.println("Adolescente");
        } else if (edad >= 18 && edad <= 59) {
            System.out.println("Adulto");
        } else if (edad >= 60) {
            System.out.println("Adulto mayor");
        } else {
            System.out.println("Edad inválida");
        }

        sc.close();
    }


    
}
