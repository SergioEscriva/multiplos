package dev.sergioescriva;

public class DifSumacuadrados {
    public static void main(String[] args) {

        int end = 100;
        int sumNumbers = 0;
        int sumCuadrado = 0;

        for (int numero = 0; numero <= end; numero++) {
            sumNumbers += numero * numero;
            sumCuadrado += numero;

        }
        int cuadrado = sumCuadrado * sumCuadrado;
        int dif = cuadrado - sumNumbers;
        System.out.println("Suma Cuadrados: " + sumNumbers + " | Cuadrado de la Suma: " + sumCuadrado * sumCuadrado
                + " | Diferecina Cuadrados:  " + dif);
    }
}