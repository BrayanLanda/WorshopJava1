package org.example;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number");
        int num3 = scanner.nextInt();

        int minor, medium, major;

        minor = (num1 <= num2 && num1 <= num3) ? num1 : (num2 <= num1 && num2 <= num3) ? num2 : num3;
        major = (num1 >= num2 && num1 >= num3) ? num1 : (num2 >= num1 && num2 >= num3) ? num2 : num3;
        medium = (num1 != minor && num1 != major) ? num1 : (num2 != minor && num2 != major) ? num2 : num3;

        System.out.println("The number minor is: " + minor + " The number medium is: " + medium + " The number major is: " + major);

        scanner.close();




    }
}
