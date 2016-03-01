/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;


public class Binary2hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Calc = new Scanner ( System.in);
        Scanner Word = new Scanner (System.in);    
        
        
        System.out.println("Which function would you like to choose:");
        System.out.println("1. Convert from binary to denary");
        System.out.println("2. Convert from denary to binary");
        
        int choice = Word.nextInt();
        
        if(choice == 1)
        {
        System.out.println("Please enter the binary number");
        
        String binary = Calc.nextLine();
        
        char bintoden1[];
        
        bintoden1 = binary.toCharArray();
        
        String revbinary = "";
        
        for(int revword = bintoden1.length - 1; revword >= 0; revword--)  //used to reverse the string input
        {
            revbinary = revbinary + bintoden1[revword];
        }
        
        char bintoden2[] = revbinary.toCharArray();   //new character input in reverse from the reversed string
        
        double num = 0;
        
        double sum = 0;
        
        for(int count = 0; count < bintoden2.length; count++)
        {
            String bintoden3 = String.valueOf(bintoden2[count]);
            if(bintoden3.equals("1"))
            {
              
                double power = count; 
                num = Math.pow(2, power);
                sum = sum + num;
            }
                
                num = 0;
            
            
        }
        
        System.out.println(sum);
        }
        
        else if (choice == 2)
        {
            System.out.println("Please enter the number:");
            int num1 = Calc.nextInt();
            
            
            System.out.println(Integer.toBinaryString(num1));
            
          
            }
            
         
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
        
        
        
    }
   

