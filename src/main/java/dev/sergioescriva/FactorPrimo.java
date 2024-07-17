package dev.sergioescriva;

public class FactorPrimo {
    public static void main(String[] args) {
        factores();
        otro();
    }

    public static void factores() {

        /*
         * Encontrar el factor primo más grande de 120:
         * 
         * se epieza por 2 como excepción y luego números primos impares.
         * Tenemos un número 120, que es divisible por 2, por lo que dividimos:
         * 120/2=60.
         * 60 es divisible por 2, por lo que dividimos: 60/2 = 30.
         * 30 no es divisible por 2, pasamos al siguiente primo impar que es 3: 30/3 =
         * 10
         * 10 no es divisible por 3, pasamos al siguiente primo impar que es 5: 10/5 = 2
         * 2 que ya no se puede dividir... Así que el máximo es 5
         */

        // Número a factorizar
        Long numero = 600851475143L;

        // primoImpar por el que dividir el número
        Integer primoImpar;

        // Iteramos mientras que primoImpar sea menor que los resultados de la división.
        for (primoImpar = 2; primoImpar < numero; primoImpar++) {

            // Mientras numero sea múltiplo del númeroImpar se divide por el valor de ese
            // númeroImpar.
            // en caso contrario cambiamos al siguiente numeroImpar.
            while (numero % primoImpar == 0) {
                numero /= primoImpar;
            }

        }
        System.out.println("Factor primo más grande: " + (primoImpar));
    }

    public static void otro() {
        long number = 600851475143L;
        for (int i = 3; i <= (number / 2); i++) {
            if (number % i == 0) {
                number = number / i;
            }

        }

        System.out.println(number);
    }

}
