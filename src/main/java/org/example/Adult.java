package org.example;

import javax.swing.*;

public class Adult {
    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        if(age >= 18){
            JOptionPane.showMessageDialog(null,"You are adult");
        }else{
            JOptionPane.showMessageDialog(null, "You aren't adult");
        }
    }
}
