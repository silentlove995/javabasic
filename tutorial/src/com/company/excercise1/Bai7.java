package com.company.excercise1;

import java.util.Scanner;

public class Bai7 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter n: ");
        n = scanner.nextInt();

        double sum = 0;
        for (int i = 1; i <= n; i++){
            sum += (double) 1/i;
        }
        System.out.printf("Result: %8.3f", sum);
    }
}
