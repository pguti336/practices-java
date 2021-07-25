package com.company;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // retrieve first n results
        System.out.print("ingresa n: ");
        int n = scanner.nextInt();
        // which contains at least m coincidences
        System.out.print("ingresa m: ");
        int m = scanner.nextInt();
        // for digit d
        System.out.print("ingresa d: ");
        char d = scanner.next().charAt(0);

        ArrayList<String> results = new ArrayList<String>();

        for (int i = 1; results.size() < n; i++) {
            String num = Integer.toString(i);
            if(num.contains(String.valueOf(d))) {
                int count = 0;
                for (int j = 0; j < num.length(); j++) {
                    if(num.charAt(j) == d){
                        count++;
                    }
                }
                if(count >= m) {
                    results.add(num);
                    System.out.println("match "+ num);
                }
            }
        }

        System.out.println(results);
    }
}
