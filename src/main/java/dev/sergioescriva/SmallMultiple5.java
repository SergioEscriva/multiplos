package dev.sergioescriva;

public class SmallMultiple5 {
    public static void main(String[] args) {

    }

    public static void smallMultipleFuerzaBruta() {
        outerLoop: for (int x = 1; x >= x; x++) {
            System.out.println(x);
            for (int i = 1; x % i == 0; i++) {
                System.out.println(i);
                if (i == 20) {
                    System.out.println("Menor " + x);
                    break outerLoop;
                }
            }
        }

    }

    public static void smallMultipleFuerzaBruta2() {
        // Número a factorizar
        int divisor = 2;
        int numero = 2;
        Boolean numeroFinal = false;

        while (divisor <= 20) {
            if (numero % divisor == 0) {
                divisor++;
            } else {
                numero++;
                divisor = 2;
            }

            System.out
                    .println("Menor número" + numero);
        }
    }

}
