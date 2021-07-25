package com.company;

import java.util.Scanner;

public class ExerciseFour {
    public static boolean esPrimo(int m) {
        int d = 0;
        for (int i = 1; i <= m; i++) {
            if( m % i == 0) {
                d++;
            }
        }
        return d == 2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa n:");
        int n = scanner.nextInt();
        int d = 0;
        for (int i = 1; d < n; i++) {
            if (esPrimo(i)) {
                System.out.println(i + " es primo");
                d++;
            }
        }

    }
}
