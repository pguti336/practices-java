package com.company;

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa n:");
        int n = scanner.nextInt();
        int d = 0;
        for (int i = 1; i <= n; i++) {
            if( n % i == 0) {
                d++;
            }
        }
        if(d == 2) {
            System.out.println("n es primo");
        }

    }
}
