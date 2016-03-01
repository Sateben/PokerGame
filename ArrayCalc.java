/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class ArrayCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner MarkCalc = new Scanner (System.in);  
     System.out.println("How many different marks do you want to enter?");
     int max = MarkCalc.nextInt();
     double mark1[] = new double[max];
     for (int marks = 0; marks < max; marks++)
     {
         System.out.println("Please enter the marks");
         mark1[marks]= MarkCalc.nextDouble();
     }
     
     double total=0;
     double avg=0;
     for (int marks = 0; marks < max; marks++)
     {
      total = mark1[marks]+total;
      
      avg = total/max;
     }
     System.out.println("The avg is "+avg);
    }
    
}
