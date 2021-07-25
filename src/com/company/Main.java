package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa un número:");
        int n = scanner.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            //System.out.println("iteration" + i);
            if(i % 2 == 0) {
                System.out.println(i);
            }
          i++;
        }
        scanner.close();
    }
}
