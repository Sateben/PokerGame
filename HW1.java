/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;


import java.io.*;
import java.util.*;

public class HW1 {

   
    public static void main(String[] args) {
        
        Scanner Reddit = new Scanner (System.in);
        
        System.out.println("Please enter the name of the month");
        
        String month= Reddit.nextLine();
        
        month = month.toLowerCase();
        
        switch (month)
        {
            
            case "january":
            
            case "march":
          
            case "may":
           
            case "july":
            
            case "august":
           
            case "october":
            
            case "december":
                System.out.println("This month has 31 days!");
                break;
            
            case "april":
            
            case "june":
            
            case "september":
           
            case "november":
                System.out.println("This month has 30 days!");
                break;
            
            case "february":
                System.out.println("This month either has 28 days or 29 days... depends on the year.");
                break;
                
            default:
                System.out.println("I'm sorry, could you please enter an actual month.");
             
                
               
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
