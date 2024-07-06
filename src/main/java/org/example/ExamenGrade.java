package org.example;

import javax.swing.*;

public class ExamenGrade {
    public static void main(String[] args) {
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter grade"));
        if(grade >= 90 && grade <= 100){
            JOptionPane.showMessageDialog(null,"Grade A");
        }else if (grade >= 80 && grade < 90){
            JOptionPane.showMessageDialog(null,"Grade B");
        }else if (grade >= 70 && grade < 80){
            JOptionPane.showMessageDialog(null,"Grade C");
        }else if (grade >= 60 && grade < 70){
            JOptionPane.showMessageDialog(null,"Grade D");
        }else if (grade >= 0 && grade < 60){
            JOptionPane.showMessageDialog(null,"Grade F");
        }else {
            JOptionPane.showMessageDialog(null, "Number invalid");
        }
    }
}
