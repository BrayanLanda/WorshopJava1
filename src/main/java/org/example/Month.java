package org.example;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter one month: ");
        int month = scanner.nextInt();

        int days;
        switch (month){
            case 1,3,5,7,8,10,12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                System.out.println("Data invalid");
                return;
        }
        System.out.println("The month " + month + " has " + days + " days");
        scanner.close();
    }
}
