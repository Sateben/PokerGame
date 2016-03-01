/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;

public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Reader = new Scanner(System.in);
        
        String ender;
        
        System.out.println("Hello, this is a calculator program. Please choose one of the following options. Just enter the number for the function you wish to choose");
        
        do{
        System.out.println("1. Addition");
        
        System.out.println("2. Subtraction");
         
        System.out.println("3. Division");
          
        System.out.println("4. Multiplication");
        
        System.out.println("5. Exit");    
       
        System.out.println("");
        
        int reddit = Reader.nextInt();
        
        switch(reddit)
        {
            case 1: {
                System.out.println("Thank You for having chosen Addition.");
                System.out.println("What is your first input ?");
                double a1 = Reader.nextDouble();
                System.out.println("What is your second input ?");
                double a2 = Reader.nextDouble();
                
                double a3 = a1 + a2;
                
                System.out.println("The sum of those two numbers is " + a3);
                
                break;
            }
            case 2: {
                System.out.println("Thank You for having chosen Subtraction.");
                System.out.println("What is your first input ?");
                double a1 = Reader.nextDouble();
                System.out.println("What is your second input ?");
                double a2 = Reader.nextDouble();
                
                double a3 = a1 - a2;
                
                System.out.println("The difference between these two numbers is " + a3);
                
                break;
            }
            
            case 3:
            {
                System.out.println("Thank You for having chosen Division.");
                System.out.println("What is your first input ?");
                double a1 = Reader.nextDouble();
                System.out.println("What is your second input ?");
                double a2 = Reader.nextDouble();
                
                Double a3 = a1 / a2;
                
                System.out.println("The quotient of these two numbers is " + a3);
                
                break;
            }
                      
            case 4:
            {
                System.out.println("Thank You for having chosen Multiplication.");
                System.out.println("What is your first input ?");
                double a1 = Reader.nextDouble();
                System.out.println("What is your second input ?");
                double a2 = Reader.nextDouble();
                
                Double a3 = a1 * a2;
                
                System.out.println("The product of those two numbers is " + a3);
                
                break;
            }
            
            case 5:
            {
                break;
            }
        }
        
        
        
        System.out.println("Do you wish to end the program?");
        
        System.out.println("Type in Repeat to continue, type anything else to end the program");
        
        ender = Reader.next();
                
        } while (ender.equals ("Repeat"));
        
        System.out.println("Thank you!");
                
    }
    
}
