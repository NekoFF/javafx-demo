package com.example;
import java.util.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String[] operation = {"+","-","*","/"};
    
    JOptionPane.showMessageDialog(null, "Das ist Calculator");
    float z1 = 0;
    float z2 = 0;

    try{
         z1 = Float.parseFloat(JOptionPane.showInputDialog(null, "erste Zahl"));
         z2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Zweite Zahl"));
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Fehler");
    }
  
    int resultop = JOptionPane.showOptionDialog(null, "Was willst du damit machen","Some", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null, operation, operation[0]);
  
    float res = 0;
    switch(resultop){
        case 0: res = z1+z2;break;
        case 1: res = z1-z2;break;
        case 2: res = z1*z2;break;
        case 3: res = z1/z2;break;
    }
    
    JOptionPane.showMessageDialog(null, "Dein Result ist: " + res);

    sc.close();
    }
}