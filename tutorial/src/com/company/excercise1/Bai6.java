package com.company.excercise1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        if (n % 2 == 0){
            i = 2;
        }else {
            i = 1;
        }
        long sum = 0;
        for (; i <= n; i += 2){
            sum += i;
        }
        System.out.println("Result: " + sum);
    }
}
