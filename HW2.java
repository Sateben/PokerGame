/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;


public class HW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner LOL = new Scanner(System.in);
        
        System.out.println("Please enter the number you wish to find the multiplication table of");
        
        int Num = LOL.nextInt();
        
        System.out.println( "Please enter the lower limit of the multiplication table");
        
        int BEGIN = LOL.nextInt();
        
        System.out.println("Please enter the upper limit of the multiplication table");
        
        int COUNT = LOL.nextInt();
        
        if (BEGIN > COUNT) {
            System.out.println("Lol");
            
        }

        else{
        for(int MULT = BEGIN; MULT <= COUNT; MULT ++)
        {
           System.out.println(BEGIN + " " + COUNT);
            
            int PRODUCT = Num * MULT;
            
            System.out.println(Num + " x " + MULT + " = " + PRODUCT);
        }
       
        }
        
    }
    
}
