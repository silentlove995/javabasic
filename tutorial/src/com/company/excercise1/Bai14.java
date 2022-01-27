package com.company.excercise1;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
         int m,n;
         int count = 0;
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter m: ");
         m = scanner.nextInt();
         System.out.println("Enter n: ");
         n = scanner.nextInt();

         if ((m > 0 && n >= 0) || n >= 0){
             for (int i = m; i <= n; i++){
                 if (i >= 0){
                     int res = (int) Math.sqrt(i);
                     if (res*res == i){
                         count++;
                         System.out.printf("%6d", i);
                         if(count % 10 == 0){
                             System.out.println();
                         }
                     }
                 }
             }
         }
        System.out.println("\nHave: " + count + " square number satisfy.");
    }
}
