package org.example;

import javax.swing.*;

public class Calculator {
    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Enter option\n1.Sum\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit"));
        float number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 1"));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 2"));
        switch (option){
            case 1:
                float sum = number1 + number2;
                JOptionPane.showMessageDialog(null,"The sum is: " + sum);
                break;
            case 2:
                float subtract = number1 - number2;
                JOptionPane.showMessageDialog(null, "The subtract is " + subtract);
                break;
            case 3:
                float multiplication = number1 * number2;
                JOptionPane.showMessageDialog(null, "The multiplication is: " + multiplication);
                break;
            case 4:
                float division = number1 / number2;
                JOptionPane.showMessageDialog(null, "The division is: " + division);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Thank you for visiting us");
                break;
        }
    }
}
