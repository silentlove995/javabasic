package com.company.excercise1;

import java.util.Scanner;

public class Bai10 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i = 2;
        if (n == 1 ){
            System.out.print(n + " = " + n );
        }else{
            System.out.print(n + " = ");
            while (n != 1){
                if (n % i == 0){
                    System.out.print(i + " x ");
                    n /= i;
                }else{
                    ++i;
                }
            }
            System.out.print("\b\b\b");
        }
    }
}
