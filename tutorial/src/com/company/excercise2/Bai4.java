package com.company.excercise2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int[] arr;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = scanner.nextInt();
        Random rand = new Random();
        arr = new int[n];
        int count = 0;
        while (count < n) {
            arr[count++] = rand.nextInt(100);
        }
        int[] brr = new int[n];
        int bSize = 0;
        boolean isExist = false;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < count; j++){
                if (arr[i] == brr[j]){
                    isExist = true;
                    break;
                }
            }
            if (!isExist){
                brr[bSize++] = arr[i];
            }
        }
        System.out.println("Array before sort: " );
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Array after sort: ");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(brr);
        System.out.println("Array contain exclusively element: ");
        System.out.println(Arrays.toString(brr));
    }
}
