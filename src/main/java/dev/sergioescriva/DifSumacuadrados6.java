package dev.sergioescriva;

public class DifSumacuadrados6 {
    public static void main(String[] args) {

        int end = 100;
        int sumNumbers = 0;
        int sumCuadrado = 0;

        for (int numero = 0; numero <= end; numero++) {

            // suma de los cuadrados de cada número
            sumNumbers += numero * numero;

            // suma de todos los números
            sumCuadrado += numero;

        }

        // cuadrado de la suma de todos los números
        int cuadrado = sumCuadrado * sumCuadrado;

        // diferencia de los resultados de los cuadrados.
        int dif = cuadrado - sumNumbers;

        System.out.println("De los " + end + " primeros números, la Suma de Cuadrados: " + sumNumbers
                + " | Cuadrado de la Suma: " + sumCuadrado * sumCuadrado
                + " | Diferecina Cuadrados:  " + dif);
    }
}