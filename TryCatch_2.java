/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;

public class TryCatch_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner TryCatch = new Scanner(System.in);
        
        int total = 0;
        boolean check = false;
        boolean check2 = false;
        do{
        System.out.println("Please enter the total number of numbers you wish to enter ");
        
        if(TryCatch.hasNextInt())
        {
            total = TryCatch.nextInt();
            check = true;
        }
        else{
            System.out.println("Please enter a number");
            TryCatch.next();
            System.out.println();
        }
        }while(check == false);
        
        
      int num[] = new int[total];
      
      for(int count = 0; count < total; count++)
      {
          while(check2 == false)
          {
            System.out.println("Please enter the number");
            
            try{
                num[count] = TryCatch.nextInt();
                check2 = true;
            }catch(InputMismatchException ai)
            {
                System.out.println("Nice Try!");
                TryCatch.nextLine();
            }
              
          }
          check2 = false;
      }
      
      for(int count = 0; count < total; count++)
      {
          System.out.println("The number you entered is " +num[count]);
      }
      
       
        
        
        
        
    }
}
    

