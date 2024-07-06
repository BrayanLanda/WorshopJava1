package org.example;

import javax.swing.*;

public class Converter {
    public static void main(String[] args) {
        float kilometer = Float.parseFloat(JOptionPane.showInputDialog("Enter how many kilometers you want to convert to miles"));
        float mile = kilometer * 1.60934f;
        JOptionPane.showMessageDialog(null, "You miles is: " + mile);
    }
}
