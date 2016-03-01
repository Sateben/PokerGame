/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;


public class Hello_World {

    /**
     * @param args the command line arguments
     */
    
   
   
            
            
    
    public static void main(String[] args) {
       Scanner Read = new Scanner(System.in);
       
       int num[] = new int[5];
       
       for(int count=0; count <5; count++)
       {
           System.out.println("Please enter the number..");
           num[count] = Read.nextInt();
       }
       
       
       
       sort(num);
       
       for(int count = 0; count < num.length; count++)
           System.out.println(num[count]);
    }
    
  public static int[] sort(int[] a)
    {
        int[] b = new int[a.length/2];
        int[] c = new int[a.length - b.length];
        for(int i = 0; i<b.length; i++)
        {
            b[i] = a[i];
            c[i] = a[b.length+i];
        }
        c[c.length-1] = a[a.length-1];
        if(b.length>1)
            b = sort(b);
        if(c.length>1)
            c = sort(c);
        int B=0, C=0;
        for(int i = 0; i<a.length; i++)
        {
            if(B<b.length && C<c.length)
            {
                if(b[B]<c[C])
                {
                    a[i] = b[B++];
                }
                else
                {
                    a[i] = c[C++];
                }
            }
            else if(B<b.length)
                a[i] = b[B++];
            else
                a[i] = c[C++];
        }
        return a;
    }
}
