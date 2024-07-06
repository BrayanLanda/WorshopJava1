package org.example;

import javax.swing.*;

public class Sorter {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a integer"));
        if(number > 0){
            JOptionPane.showMessageDialog(null, "The number is positive");
        }else if(number == 0){
            JOptionPane.showMessageDialog(null,"The number is zero");
        }else{
            JOptionPane.showMessageDialog(null, "The number is negative");
        }

        if((number%2)==0){
            JOptionPane.showMessageDialog(null,"The number is par");
        }else {
            JOptionPane.showMessageDialog(null,"The number is impar");
        }
    }
}
