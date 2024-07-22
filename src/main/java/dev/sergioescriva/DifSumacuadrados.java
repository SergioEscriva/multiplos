package dev.sergioescriva;

public class DifSumacuadrados {
    public static void main(String[] args) {

        int end = 100;
        int sumNumbers = 0;
        int sumCuadrado = 0;

        for (int numero = 0; numero <= end; numero++) {

            // suma de los cuadrados
            sumNumbers += numero * numero;

            // suma de los números
            sumCuadrado += numero;

        }

        // cuadrado de la suma de los números
        int cuadrado = sumCuadrado * sumCuadrado;

        // diferencia de los resultados de los cuadrados.
        int dif = cuadrado - sumNumbers;
        System.out.println("Suma Cuadrados: " + sumNumbers + " | Cuadrado de la Suma: " + sumCuadrado * sumCuadrado
                + " | Diferecina Cuadrados:  " + dif);
    }
}