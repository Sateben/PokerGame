/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
public class PhysicsPracCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Calculator = new Scanner (System.in);
       
       System.out.println("Please enter the total number of numbers you wish to enter");
       
       int total = Calculator.nextInt();
       
       double num[] = new double[total];
       
       double uncertain[] = new double[total];
       
       for (int count = 0; count < total; count++)
       {
           System.out.println("Please enter the number");
           num[count] = Calculator.nextDouble();
           
           System.out.println("Please enter the uncertainity");
           uncertain[count] = Calculator.nextDouble();
       }
       
       double perc[] = new double[total];
       double sum = 1;
       
       for (int count = 0; count < total; count++)
       {          
           perc[count]=(uncertain[count]*100)/num[count];
                     
           sum = num[0]/num[1];        
           
           System.out.println(perc[count]);
          
       }
       
       double finalperc=0;
       
       for (int count = 0; count < total; count++)
       {
           finalperc = perc[count] + finalperc;
       }
       
       System.out.println(finalperc);
       
       double recon = (finalperc * sum)/100;
       
       System.out.println("The final sum is "+sum+"+-" +recon);
       
       
       System.out.println("What would you like to get to be divided by this ?");
       
       double num8 = Calculator.nextDouble();
       
       System.out.println("What is the uncertainity on this number?");
       
       double num9 = Calculator.nextDouble();
       
       double perc3 = (num9*100)/num8;
       
       double finperc = perc3 + finalperc;
       
       double finnum = num8/sum;
       
       System.out.println("no. is "+finnum+" +/-" +finperc);
       
       
       
    }
    
}
