/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class TRIALS1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Reader = new Scanner(System.in);
        
        System.out.println("Please input a number corresponding to the day you wish to output.\n 1 = Monday \n 2 = Tuesday \n 3 = Wednesday \n 4 = Thursday \n 5 = Friday \n 6 = Saturday \n 7 = Sunday");
        
        int d = Reader.nextInt();
        
        if (d==1)
        { System.out.println("Monday");}
        
        else if (d == 2)
        { System.out.println("Tuesday");}
        
        else if (d ==3)
        {System.out.println("Wednesday");}
        
        else if (d == 4)
        { System.out.println("Thursday");}
        
        else if (d == 5)
        { System.out.println("Friday");}
        
        else if (d==6)
        { System.out.println("Saturday");}
        
        else if (d==7)
        { System.out.println("Sunday");}
        
        else
        { System.out.println("Enter a relevant number mate");}
        
        
         
       
    }
    
}
