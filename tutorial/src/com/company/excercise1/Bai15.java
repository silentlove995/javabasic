package com.company.excercise1;

import java.util.Scanner;

public class Bai15 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter c: ");
        c = scanner.nextDouble();
        double pi = 0;
        long n = 0;
        double x = 1.0;
        while (c <= x){
            pi += Math.pow(-1, n)*x;
            n++;
            x = 1.0/(2*n+1);
        }
        pi *= 4;
        System.out.println("PI = " + pi);
    }
}
