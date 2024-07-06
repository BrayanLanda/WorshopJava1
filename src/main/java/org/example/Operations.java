package org.example;

import javax.swing.*;

public class Operations {
    public static void main(String[] args) {
        float number1 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 1: "));
        float number2 = Float.parseFloat(JOptionPane.showInputDialog("Enter number 2: "));
        float sum = number1 + number2;
        float subtract = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe subtract is: " + subtract + "" +
                "\nThe multiplication is: " + multiplication + "\nThe division is: " + division);
    }
}
