package org.example;

import javax.swing.*;

public class Imc {
    public static void main(String[] args) {
        float height = Float.parseFloat(JOptionPane.showInputDialog("Enter your height"));
        float weight = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight"));
        float IMC = weight / (height * height);
        JOptionPane.showMessageDialog(null, "You IMC is: " + IMC);
    }
}
