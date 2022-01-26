package com.company.excercise2;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, count;
        int[] arr, res;
        n = scanner.nextInt();
        arr = new int[n];
        res = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            res[i] = -1;
        }
        //dem so lan xuat hien cua cac phan tu trong mang
        for (int i = 0; i < n; i++) {
            count = 1;
            for(int j = i+1; j < n; j++){
                if (res[j] != 0 && arr[i]  == arr[j]){
                    count++;
                    res[j] = 0;
                }
            }

            if (res[i] != 0){
                res[i] = count;
            }
        }
        //tim so lan xuat hien max
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max){
                max = res[i];
            }
        }
        System.out.println("So lan xuat hien Max: " + max + ", cac phan tu: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max){
                System.out.print(arr[i]+ ", ");
            }
        }
        System.out.println("\b\b");
    }
}
