package com.company.excercise1;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int m,n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Insert width: ");
            n = scanner.nextInt();
            System.out.print("Insert height: ");
            m = scanner.nextInt();
        }while(n <= 0 || m <= 0 || (n <= 0 && m <= 0));

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i == 0 || j == 0 || i == m-1 || j == n-1){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
