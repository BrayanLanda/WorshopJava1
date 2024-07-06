package org.example;

import javax.swing.*;

public class RateTaxi {
    public static void main(String[] args) {
        final double BASE_RATE = 5000;
        final double KILOMETER_RATE = 1000;

        double distance = Double.parseDouble(JOptionPane.showInputDialog("Enter distance for kilometers"));

        double total = BASE_RATE + (KILOMETER_RATE * distance);

        JOptionPane.showMessageDialog(null, "Your travel price is " + total);
    }
}
