package com.example;

import javax.swing.*;


public class Main {
    public static void main(String[] args){
  
    Calculator cac = new Calculator();
    
    String menu[] = {"Calculator", "Exit"};
    int vibor = JOptionPane.showOptionDialog(null, "","",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
    switch (vibor){
        case 0: cac.Calc();
        case 1: {JOptionPane.showMessageDialog(null, "POKA"); System.exit(0);}
        case -1: System.exit(0);
    }
        
    }
}