/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;


public class HW5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Check = new Scanner(System.in);
        boolean checker = false;
        
        do{
        int size1 = size(); //size1 = size of array
        double sum1 = scoresarr(size1);
        
        gradeavg(sum1,size1);
        
        System.out.println("Do you wish to repeat? enter 1 to do so");
        if(Check.hasNextInt(1))
        {
            checker = true;
        }
        
        }while(checker == false);
        
        
    }
    
    public static int size() //will give the size of the array
    {
            Scanner Grade = new Scanner(System.in);
            boolean checker = false;
            System.out.println("Please input the total number of scores you wish to enter:");
            int size = 0;
            
            while(checker == false)
            {
            if(Grade.hasNextInt())
            {
                size = Grade.nextInt();
                checker = true;
            }
            else
            {
                System.out.println("Please input the numbers asked for");
                Grade.next();
            }
            }
            
            return (size);
    }
    
    public static double scoresarr(int total)
    {
        Scanner Grade = new Scanner(System.in);
        boolean checker = false;
        double scorearr[] = new double[total];
        
        for(int count = 0; count < total; count++)
        {
            System.out.println("Please input the score");
            
            while(checker == false)
            {
            if(Grade.hasNextDouble())
            {
                scorearr[count] = Grade.nextDouble();
                checker = true;
            }
            else
            {
                System.out.println("Please input a number");
                Grade.next();
            }
            }
           checker = false;
        }
        
        double sum = 0;  //we will find the total sum of the scores array
        
        for(int count = 0; count < total; count++)
        {
            sum = sum + scorearr[count];
            //System.out.println("hey");
        }
        
        return (sum);
        
    }
    
    public static void gradeavg(double total, int size)
    {
        System.out.println("sum1 ="+total + " size1="+size);
        double avg = total/size;
        System.out.println("grade avg. is "+avg);
        if(avg>= 91 && avg <=100)
        {
            System.out.println("The Grade is A*");
        }
        if(avg>= 81 && avg <=90)
        {
            System.out.println("The Grade is A");
        }
        if(avg>= 71 && avg <=80)
        {
            System.out.println("The Grade is B");
        }
        if(avg>= 61 && avg <=70)
        {
            System.out.println("The Grade is C");
        }
        if(avg>= 51 && avg <=60)
        {
            System.out.println("The Grade is D");
        }
        else 
        {
            System.out.println("LOL");
        }
       
    }
    
}
