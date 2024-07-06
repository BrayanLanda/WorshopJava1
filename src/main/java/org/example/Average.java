package org.example;

import javax.swing.*;

public class Average {
    public static void main(String[] args) {
        float grade1 = Float.parseFloat(JOptionPane.showInputDialog("Enter grade one"));
        float grade2 = Float.parseFloat(JOptionPane.showInputDialog("Enter grade two"));
        float grade3 = Float.parseFloat(JOptionPane.showInputDialog("Enter grade three"));
        float average = (grade1 + grade2 + grade3) / 3;
        if(average >= 6){
            JOptionPane.showMessageDialog(null,"Average is " + average + " and the Student won");
        }else {
            JOptionPane.showMessageDialog(null, "Average is " + average + " and the Student lost" );
        }
    }
}
