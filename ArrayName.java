/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;


public class ArrayName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner NameLook = new Scanner(System.in);
        Scanner Total = new Scanner (System.in);
        
        System.out.println("How many names do you^ wish to enter?");
        
        int max = Total.nextInt();
        
        String name[] = new String[max];
        
        for (int namer = 0; namer < max; namer++)
        {
            System.out.println("Please enter the name");
            name[namer] = NameLook.next();          
        }
        
         String ender = "NO";
            int checker = 0;
            int namer2 = 0;
            System.out.println("Please enter the name you wish to look for: "); 
             String io = NameLook.next();
             for (int namer = 0; namer < max; namer++)
             {
             if (name[namer].equals(io))
             {
                  checker = 1;
                  namer2 = namer+1;
             }
             
             }
             
             if (checker == 1)
             {
                 System.out.println("The name of the person you are looking for is present in the " + (namer2) + " location");
             }
             
             if (checker == 0)
             {
                 System.out.println("Sorry mate it isn't there");
             }
             
             
    }          
             
    
         
   
    
}
