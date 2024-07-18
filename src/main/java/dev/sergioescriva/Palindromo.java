package dev.sergioescriva;

public class Palindromo {
    public static void main(String[] args) {

        // Guardaremos el valor más alto en cada iteración.
        int numeroGuardado = 0;
        int valor1 = 0;
        int valor2 = 0;
        String printResultado = "";

        // Iteramos la primera cifra de números de 3 cifras.
        for (valor1 = 100; valor1 <= 999; valor1++) {

            // Iteramos la segunda cifra.
            for (valor2 = valor1; valor2 <= 999; valor2++) {

                // Multiplicamos cada iteración
                int numerosMultiplicadosInt = valor1 * valor2;

                // Comprobamos si el número es igual normal e invertido y guardamos si es mayor
                // que el guardado
                if (numerosMultiplicadosInt == invertir(numerosMultiplicadosInt)
                        && numerosMultiplicadosInt > numeroGuardado) {

                    numeroGuardado = numerosMultiplicadosInt;
                    printResultado = valor1 + " * " + valor2 + " = " + numeroGuardado;
                }

            }
        }
        System.out.println(printResultado);

    }

    // Este código invierte
    public static Integer invertir(int originalNumber) {
        String stringNumber = Integer.toString(originalNumber);
        StringBuilder reversedString = new StringBuilder(stringNumber);
        reversedString.reverse();
        return Integer.parseInt(reversedString.toString());

    }
}
