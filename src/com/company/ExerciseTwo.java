package com.company;

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa n:");
        int n = scanner.nextInt();

        System.out.println("ingresa m:");
        int m = scanner.nextInt();

        int i = 0;
        while (i < n) {
            System.out.println(i * m);
            i++;
        }

    }
}
