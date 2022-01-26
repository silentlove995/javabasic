package com.company.excercise1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();//rong
        n = scanner.nextInt();//cao
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
