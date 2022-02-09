package com.company.excercise1;

import java.util.Scanner;

public class Bai9 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        System.out.print("Enter n: ");
        n = scanner.nextInt();

        int sum = 0;
        int x;
        while (n > 0){
            x = n % 10;
            n /= 10;
            sum += x;
        }
        System.out.println("SUM: " + sum);
    }
}
