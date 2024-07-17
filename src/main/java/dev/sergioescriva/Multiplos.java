package dev.sergioescriva;

public class Multiplos {
    public static void main(String[] args) {
        numeros();
    }

    public static void numeros() {
        int start = 1;
        int end = 999;
        int sumNumbers = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumNumbers = sumNumbers + i;

            }

        }

        System.out.println("Número Inicial: " + start + " Número Final: " + end);
        System.out.println("Suma total múltiplos 3 y 5: " + sumNumbers);
    }
}