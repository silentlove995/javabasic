package com.company.excercise1;

import java.util.Scanner;

public class Bai1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int m, n;
        do {
            System.out.print("Insert width: ");
            n = scanner.nextInt();
            System.out.print("Insert height: ");
            m = scanner.nextInt();
        }while(n <= 0 || m <= 0);
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
