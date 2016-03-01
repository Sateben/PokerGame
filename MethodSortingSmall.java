/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class MethodSortingSmall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num[] = new int[5];
        intro(num);
        sorter(num);
        int counter = 0;
        
        for(int count = 0; count < 4; count++)
        {
            counter++;
        }
        System.out.println(counter);
    }
    
    public static int[] intro(int num1[])
    {
        
        Scanner Sort = new Scanner(System.in);
        for(int count = 0; count < 5; count++)
        {
        System.out.println("Please enter the number");
        num1[count] = Sort.nextInt();
        }
        return num1;
    }    
        
    public static void sorter(int num2[])
    {
       for(int count = 1; count <5; count++)
       {
           if(num2[count] > num2[count-1])
           {
               num2[count] = num2[count-1];
           }
       }
       System.out.println(num2[4]);
    }
    
    
    
}
