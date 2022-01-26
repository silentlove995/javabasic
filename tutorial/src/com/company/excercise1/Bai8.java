package com.company.excercise1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                count++;
                System.out.println("Uoc so cua " + n + " la: " + i);
            }
        }
        System.out.println(n + " Co " + count + " uoc so");
    }
}
