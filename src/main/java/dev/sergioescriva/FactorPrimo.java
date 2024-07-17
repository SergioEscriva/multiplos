package dev.sergioescriva;

import java.util.ArrayList;
import java.util.List;

public class FactorPrimo {
    public static void main(String[] args) {
        factores();
    }

    public static void factores() {

        int numero = 29;
        List<Integer> numberList = new ArrayList<>();
        List<Integer> numberListno = new ArrayList<>();

        /*
         * Encontrar el factor primo más grande de 120:
         * 
         * a) 120 es divisible por 2, por lo que dividimos: 120 ÷ 2 = 60.
         * b)60 es divisible por 2, por lo que dividimos: 60 ÷ 2 = 30.
         * c)30 no es divisible por 2, pasamos al siguiente primo impar: 3. 30 es
         * ...
         */

        Long end = 600851475143L;

        int multiplo = 2;

        for (int i = 0; i <= end; i++) {
            multiplo++;
            while (end % multiplo == 0) {
                end /= multiplo;

            }
        }
        System.out.println("Factor primo más grande: " + multiplo);
    }

}
