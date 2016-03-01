/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class CompSciCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner Calc = new Scanner(System.in);
     Scanner Word = new Scanner(System.in);
     
     System.out.println("Hello & Welcome to the Calc2000");
     
     String ender = "Hello";
     boolean checker = false, checker2 = false, checker3 = false;
     int total =0;
     double sum = 0;
     do{
         while(checker == false)
         {
         System.out.println("Please enter the total number of numbers you wish to enter");
         if(Calc.hasNextInt())
         {
             total = Calc.nextInt();
             checker = true;
         }
         else
         {
             System.out.println("ERROR: Please enter a number");
             Calc.next();
         }
         }
         
         double num[] = new double[total];
         checker = false;
         
         for(int count = 0; count < total; count++)
         {
             while(checker == false)
             {
                 System.out.println("Please enter the number");
                 
                 if(Calc.hasNextDouble())
                 {
                     num[count] = Calc.nextDouble();
                     checker = true;
                 }
                 else
                 {
                     System.out.println("ERROR: Please enter the number you wish to enter");
                     Calc.next();
                 }
             }
             checker = false;
         }
         
         checker = false;
         
         
         System.out.println("Please choose one of the following functions of this calculator that you wish to access");
         
         int func = 0;
         
        while(checker == false)
        {
         System.out.println("1. Addition");
         System.out.println("2. Subtraction");
         System.out.println("3. Division");
         System.out.println("4. Multiplication");
         System.out.println("5. Exit");
         if(Calc.hasNextInt())
         {
             func = Calc.nextInt();
             checker = true;
         }
         else
         {
             System.out.println("ERROR: Please enter the number corresponding to the associated function");
             Calc.next();
         }
        }
        checker = false;
        switch(func)
        {
            case 1: {
                System.out.println("Thank You for having chosen Addition");
                
                for(int count = 0; count < total; count++)
                {
                    sum = num[count] + sum;
                }
                
                System.out.println("The sum of these numbers is " +sum);
                    
                break;
            
            }
            
            case 2:
            {
                System.out.println("Thank You for having chosen Subtraction");
                
                double diff[] = new double[total];
                
                for(int count = 0; count < total; count++)
                {
                    num[count] = diff[count];
                }
                
                for (int count = 1; count < total; count++)
                {
                    double saver =0;
                    if(diff[count-1] < diff[count])
                    {
                        saver = diff[count-1];
                        diff[count-1] = diff[count];
                        diff[count] = saver;
                    }
                    
                }
                
                sum = diff[0] - diff[1];
                for (int count = 2; count < total; count++)
                {
                    sum =  sum - diff[count];
                }
                
                System.out.println("The difference between these numbers is " +sum);
                
                break;
            }
            
            case 3:
            {
                System.out.println("Thank You for having chosen Division");
                
                double diff[] = new double[total];
                String truth = "Hey";
                String truth2 = "Heyer";
                if (total > 2)
                {
                    System.out.println("Unfortunately we can only divide two numbers at the same time");
                    System.out.println("So what we will do is divide the first two nos. and then proceed to divide the quotient with the following number and so on until we reach the end.");
                    System.out.println("If you find this acceptable, please enter 'Okay'");
                    while(checker == false)
                    {
                        if(Word.hasNextLine())
                        {
                            truth = Word.nextLine();
                            if(truth.equalsIgnoreCase("Okay"))
                            {
                                sum = num[0]/num[1];
                                for(int count =2; count <total; count++)
                                {
                                    sum = sum/num[count];
                                }
                                System.out.println("The Division is "+sum);
                            
                                checker = true;
                            }
                            else
                            {
                               System.out.println("Okay, we will then proceed to divide the nos. in descending order.");
                               System.out.println("This is our only other option");
                               System.out.println("If you wish to continue please enter 'Okay'");
                               while(checker2 == false)
                               {
                                   if(Word.hasNextLine())
                                   {
                                       truth2 = Word.nextLine();
                                       if(truth2.equalsIgnoreCase("Okay"))
                                       {
                                           for(int count = 0; count < total; count++)
                                             {
                                                    diff[count] = num[count];
                                             }
                
                                           for (int count = 1; count < total; count++)
                                             {
                                                double saver =0;
                                                if(diff[count-1] < diff[count])
                                                    {
                                                        saver = diff[count-1];
                                                        diff[count-1] = diff[count];
                                                        diff[count] = saver;
                                                    }
                    
                                             }
                                           
                                           sum = diff[0]/diff[1];
                                           
                                           for(int count=2; count<total; count++)
                                           {
                                               sum = sum/diff[count];
                                           }
                                           checker2 = true;
                                       }
                                       else
                                       {
                                           checker2=true;
                                           Word.next();
                                           
                                       }
                                   }
                                   else
                                   {
                                       System.out.println("ERROR:Please input what you wish to in the ENGLISH LANGUAGE");
                                   }
                               }
                            }
                            
                        }
                        else
                        {
                            System.out.println("ERROR:Please enter your input in the English Language");
                            Word.next();
                        }
                            
                    }
                    checker = false;
                }
                else
                {
                
                sum = num[0]/num[1];
                System.out.println("The quotient is "+sum);
                }
                
                
                break;
                
            }
            
            
            case 4: 
            {
                System.out.println("Thank You for choosing multiplication");
                
                double sum2 = 1;
                for(int count = 0; count < total; count++)
                {
                    if(num[count] == 0)
                    {
                        sum2 = 0;
                    }
                    else
                    {
                    sum2 = sum2*num[count]; //we have to create a new variable called sum2 because sum is = 0. Anything multiplied to 0 is 0.
                    }
                }
                
                System.out.println("The product is "+sum2);
            
                break;
            }
            
            
            case 5:
            {
                break;
            }
        }
             
            System.out.println("Do you wish to end the program?");
            System.out.println("If so, type in 'End' to exit the program, and anything else to repeat it");
            while(checker3 == false)    
            if(Word.hasNext())
            {
               ender = Word.nextLine();
               if(ender.equalsIgnoreCase("End"))
               {
                   checker3 = true;
               }
            }
        }while(checker3==false);
         
         
     }
        
        
    }   
            
            
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
            
        


