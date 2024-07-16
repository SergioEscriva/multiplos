package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        numeros();
    }

    public static void numeros() {
        int start = 1;
        int end = 999;
        int sumNumbers = 0;
        List<Integer> numberList = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sumNumbers = sumNumbers + i;
                numberList.add(i);
            }

        }

        // System.out.println(numberList);
        System.out.println("Número Inicial: " + start + " Número Final: " + end);
        System.out.println("Suma total múltiplos 3 y 5: " + sumNumbers);
    }
}