package dev.sergioescriva;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacci();
    }

    public static void fibonacci() {

        int sumaAnteriores = 0;
        int numeroActual = 0;
        int numeroAnterior = 1;
        int finalSuma = 0;

        // Iteramos sobre 4.000.000 de números
        for (int i = 0; numeroActual <= 4000000; i++) {

            // Número Fibonacci es la suma de los dos anteriores
            sumaAnteriores = numeroActual + numeroAnterior;

            // Reasignamos valores anteriores para la siguiente suma.
            numeroActual = numeroAnterior;
            numeroAnterior = sumaAnteriores;

            // Si el valor resultante es Par, se suma al total.
            if (numeroActual % 2 == 0) {
                finalSuma += numeroActual;
            }

        }

        System.out.println("Suma numeros Pares Fibonacci: " + finalSuma);

    }
}
