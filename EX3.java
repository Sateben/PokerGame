/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;

public class EX3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner Test = new Scanner(System.in);
        
          String s1 = "Allan Alda";
          String s2 = "John Wayne";
          String s3 = "Greogory Peck";
          
          String a = s1.substring(2, 7);
          String b = s2.substring(2, 8);
          String c = s3.substring(2,10);
          
          System.out.println (a);
          System.out.println (b);
          System.out.println (c);
        
          System.out.println("Please enter a number");
          
          float num1,num2,result;
          
          String t1 = Test.nextLine();
          
          System.out.println("Please enter a second number");
          
          String t2 = Test.nextLine();
          
          num1 = Float.valueOf(t1);
          
          num2 = Float.valueOf(t2);
          
          result = num1 + num2;
          
          System.out.println(result);
          
          
          
          
          
        
        
        
        
        
        
    }
    
}
