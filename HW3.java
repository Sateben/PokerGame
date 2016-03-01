/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.Scanner;

/**
 *
 * @author krrishdholakia
 */
public class HW3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int ender = 1;
        
        Scanner Tester = new Scanner(System.in);
        
        System.out.println("Please enter the radius of the circle. Enter 0 to exit the program.");
        
        int num = Tester.nextInt();
        
        if(num == 0)
        {
            System.out.println("Goodbye:)");
            
        }
        
        else
        {
            do 
            {
             num = (22*num*num)/7;
             
             System.out.println("The area of the circle is " + num);
             
             System.out.println("Enter 0 if you wish to end the program");
             
             ender = Tester.nextInt();
             
             if (ender == 0)
             {
                 System.out.println("Thank You!");
             }
            
             
            } while (ender != 0);
            
        }
             
    }
    
}
