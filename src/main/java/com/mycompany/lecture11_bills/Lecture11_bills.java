
package com.mycompany.lecture11_bills;
import javax.swing.*;

public class Lecture11_bills {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null,"Enter the customer's name");
        double dblMinutesTalked = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the minutes talked"));
        double dblCostPerMinute = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the cost per minute"));
        
        //sends variables to constructor in the bills class
        bills b = new bills(strName, dblMinutesTalked, dblCostPerMinute);
        
        JOptionPane.showMessageDialog(null, "CUSTOMER NAME: " +
           b.getName().toUpperCase()  + "\n" + 
           "TOTAL Due: R " + b.getTotalBills());
    }
    
}
