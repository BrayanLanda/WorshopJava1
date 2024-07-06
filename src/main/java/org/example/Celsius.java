package org.example;

import javax.swing.*;

public class Celsius {
    public static void main(String[] args) {
        int option = Integer.parseInt(JOptionPane.showInputDialog("Enter option\n1. Celcius to Fahrenheit\n2. Fahrenheit to Celcius"));
        double temperature = 0;
        switch (option){
            case 1:
                double celsius = Double.parseDouble(JOptionPane.showInputDialog("Enter celcius"));
                temperature = celsius * 9 / 5 + 32;
                JOptionPane.showMessageDialog(null,"Degrees fahrenheit " + temperature);
                break;
            case 2:
                double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter fahrenheit"));
                temperature = (fahrenheit - 32) * 5 / 9;
                JOptionPane.showMessageDialog(null,"Degrees celsius " + temperature);
            default:
                JOptionPane.showMessageDialog(null,"Thank you for visiting us");
        }
    }
}
