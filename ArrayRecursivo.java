package TP2;
public class ArrayRecursivo {

    // Función recursiva para mostrar los precios
    public static void mostrarPrecios(double[] precios, int indice) {
        // Caso base: si el índice llega al tamaño del array, termina
        if (indice == precios.length) {
            return;
        }
        // Imprime el precio actual
        System.out.println("Precio: $" + precios[indice]);
        // Llamada recursiva con el siguiente índice
        mostrarPrecios(precios, indice + 1);
    }

    public static void main(String[] args) {
        // a. Declarar e inicializar un array con precios
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        // b. Mostrar precios originales con recursividad
        System.out.println("Precios originales:");
        mostrarPrecios(precios, 0);

        // c. Modificar el precio del tercer producto (índice 2)
        precios[2] = 129.99;

        // d. Mostrar precios modificados con recursividad
        System.out.println("\nPrecios modificados:");
        mostrarPrecios(precios, 0);
    }
}
