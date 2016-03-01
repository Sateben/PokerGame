/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;


public class Trial {
    
    
    public static void main(String[] args) {
       
        int store1[] = new int[5];
        char store2[] = new char [5];
        
        ArrayList<Character> store = new<Character> ArrayList();
        
        for(int count = 0; count < 5; count++)
        {
            store1[count] = count;
        }
        for(int count = 0; count < 5; count++)
        {
            store2[count] = (char) count;
        }
       
        for(int count = 0; count < store2.length;count++)
        store.add(store2[count]);
        
        int[] a = {1,2,3};
        int[] b = {4,5,6};
        int[][] c = {a,b};
        int [] [] d = c;
        for(int count = 0; count < d.length; count++)
        {
            for(int count2 = 0; count2 < d[count].length; count2++)
            System.out.println(d[count][count2]);
        }
        
        ArrayList<Character>t1 = new<Character>ArrayList();
        
        t1.add('3');
        t1.add('1');
        t1.add('9');
        
        Collections.sort(t1);
        
        for(int counter = 0; counter <t1.size(); counter++)
        {
            System.out.println(t1.get(counter));
            
        }
        
        ArrayList<Character>t2 = t1;
        
        for(int count = 0; count < t2.size(); count++)
        {
            System.out.println(t2.get(count));
        }
        
        int total1[] = new int[4];
        int total2[] = new int [4];
        
        for(int count = 0; count < total1.length; count++)
        {
            total1[count] = count+3;
        }
        
        for(int count = 0; count < total2.length; count++)
        {
            total2[count] = count+5;
        }
        
        div(total1, total2);
        
        for(int count = 0; count < total2.length; count++)
        {
            System.out.println(total2[count]);
        }
        
    }
    
    
    public static int[] div(int total1[], int total2[])
    {
       
        
        for(int count = 0; count < total2.length; count++)
        {
            total2[count] = total1[count]/total2[count];
        }
        
        return total2;
    }
    
}
