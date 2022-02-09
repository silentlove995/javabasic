package com.company.excercise1;

import java.util.Random;
import java.util.Scanner;

public class Bai5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int input;
        System.out.print("Enter random number from 0 to 99: ");
        input = scanner.nextInt();
        int count = 0;
        Random random = new Random();
        while (true){
            int randNumber = random.nextInt(100); //[0,99]
            count++;
            System.out.println("Random number: " + randNumber + ", input: " + input);
            if (randNumber == input){
                System.out.println("Total random: " + count + " times.");
                break;
            }
        }
    }
}
