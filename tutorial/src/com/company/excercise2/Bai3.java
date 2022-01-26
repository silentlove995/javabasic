package com.company.excercise2;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        int n, x, index = -1, min = Integer.MAX_VALUE;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao n, x: ");
        n = scanner.nextInt();
        x = scanner.nextInt();

        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if (nguyenTo(arr[i]) && currentMin < min){
                min = currentMin;
                index = i;
            }
        }

        if (index != -1){//tim thay gia tri thoa man
            System.out.println("CHi so phan tu: " +index+" , Gia tri: " + arr[index]);
        }else{
            System.out.println("Khong ton tai gia tri thoa man");
        }
    }

    public static int getMin(int a, int x){
        return Math.abs(a-x);
    }

    public static boolean nguyenTo(int n){
        if (n < 2){
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
