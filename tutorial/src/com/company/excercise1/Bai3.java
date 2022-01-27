package com.company.excercise1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("Enter height: ");
            h = scanner.nextInt();
        }
        while(h <= 0);
        int x, output;

        for (int i = 1; i <= h; i++){
            for (int j = 0; j <= 2*h; j++){
                x = Math.abs(j - h);
                output = i - x;

                if (output > 0 ){
                    System.out.printf("%3d", output);
                }else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}
