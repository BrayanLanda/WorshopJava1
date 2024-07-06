package org.example;

import javax.swing.*;
import java.util.Scanner;

public class Tip {
    public static void main(String[] args) {
        double checkTotal = Double.parseDouble(JOptionPane.showInputDialog("Enter the total"));
        double porcentage = Double.parseDouble(JOptionPane.showInputDialog("Enter the tip ypu wish to leave"));
        double tip = checkTotal * (porcentage / 100);

        JOptionPane.showMessageDialog(null,"You tip is " + tip + "$");
    }
}
