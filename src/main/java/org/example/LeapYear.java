package org.example;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = scanner.nextInt();

        boolean isLeap;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    isLeap = true;
                }else {
                    isLeap = false;
                }
            }else {
                isLeap = true;
            }
        }else {
            isLeap = false;
        }

        if(isLeap){
            System.out.println("Year is Leap");
        }else {
            System.out.println("Year isn't Leap");
        }
    }
}
