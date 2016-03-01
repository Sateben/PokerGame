/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class ClassesAndObj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Alpha = new Scanner (System.in);
        
        System.out.println("Please enter the length");
        
        int length = Alpha.nextInt();
        
        System.out.println("Please enter the breadth");
        
        int breadth = Alpha.nextInt();
        
        System.out.println("Please enter the height");
                
        int height = Alpha.nextInt();
        
        Measurements Beta = new Measurements(length,breadth,height);
        
        Beta.area();
        
        Beta.volume();
        
    }
    
    
    
}


