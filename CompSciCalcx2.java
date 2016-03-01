/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;

public class CompSciCalcx2 {

    
    public static void main(String[] args) {
       int total = 0;
       int calcfunc=0;
       int func1 = 0;
       int num1 = 0, num2 = 0;
       double finalsum = 0;
       Scanner Calc = new Scanner(System.in);
       Scanner Word = new Scanner(System.in);
       System.out.println("Hello & Welcome to the CALCx2000");
       String ender2 = "hey";
       boolean ender = false, checker1 = false,checker2 = false,checker3 = false, checker4 = false, checker5 = false;
       
       
           intro();
           
           while(checker1 == false)
           {
           System.out.println("1. Preset Calculator");
           System.out.println("2. Dynamic Calculator");
           
           if(Calc.hasNextInt())
           {
               calcfunc = Calc.nextInt();
               if(calcfunc==1 || calcfunc==2)
               
           {
               System.out.println("Okay Thank You.. we shall now proceed from this point.. ");
                       checker1 = true;
           }
           
               else
               {
                   System.out.println("Please enter a valid number");
               }
           }
           else
           {
               System.out.println("Nice Try... Please enter the number");
               Calc.next();
           }
           }
           
           for(int count = 0; count<8; count++)
           {
           System.out.println("");
           }
           do{
           if(calcfunc == 1)
           {
               System.out.println("****************PRESET CALCULATOR****************");
               while(checker2 == false)
               {
               System.out.println("Please enter the total number of numbers you wish to enter:");
               if(Calc.hasNextInt())
               {
                   total = Calc.nextInt();
                   checker2 = true;
               }
               else
               {
                System.out.println("Please enter a number");
                Calc.next();
               }
               
               double num[] = new double[total];
               
               for(int count =0; count < total; count++)
               {
                  num[count] = loop(num[count]);
               }
                              
                   while(checker3 == false)
                   {
                       func();
                       if(Calc.hasNextInt())
                       {
                           func1 = Calc.nextInt();
                           if(func1 > 0 && func1 < 5)
                           {
                               checker3 = true;
                           }
                           else
                           {
                               System.out.println("Please enter a valid number...");
                           }
                       }
                       else
                       {
                           System.out.println("Please enter a number...");
                           Calc.next();                         
                       }
                   }
                   
                   switch(func1)
                   {
                       case 1: //addition
                       { 
                           double adder = 0;
                           adder = add(num,total);
                           finalsum=adder;
                           System.out.println("The sum is " +adder);
                           break;
                           
                       }
                       case 2:  //subtraction
                       { 
                           double sub = 0;
                           
                           sub = sub1(num,total);
                           finalsum = sub;
                           System.out.println("The subtracted value is "+sub);
                           
                           break;
                       }   
                       case 3:  //multiplication
                       { 
                           double mult =1;
                           
                           mult = mult1(num,total);
                           finalsum = mult;
                           System.out.println("The product is "+mult);
                           
                           break;
                       }   
                       case 4:  //division
                       {   
                           double div =1;
                           int chooser =1;
                           
                           System.out.println("There are 3 ways we can proceed with this, please choose the number corresponding with the function");
                           System.out.println("1. Divide regardless of position of nos.");
                           System.out.println("2. Divide in descending order");
                           System.out.println("3. Divide in ascending order");
                           
                           while(checker5 == false)
                           {
                           if(Calc.hasNextInt())
                           {
                               chooser = Calc.nextInt();
                               if(chooser > 0 && chooser <4)
                               {
                                   if(chooser == 1)
                                   {
                                       div = div1(num, total);
                                       finalsum = div;
                                       System.out.println("The quotient after adopting the first method is "+div);
                                       checker5 = true;
                                   }
                                   else if(chooser == 2)
                                   {
                                       div = div2(num, total);
                                       finalsum = div;
                                       System.out.println("The quotient after adopting the second method is "+div);
                                       checker5 = true;
                                   }
                                   else if(chooser == 3)
                                   {
                                       div = div3(num, total);
                                       finalsum = div;
                                       System.out.println("The quotient after adopting the third method is "+div);
                                       checker5 = true;
                                   }
                                  
                                   
                               }
                               else
                               {
                                   System.out.println("Please enter a relevant number..");
                                   Calc.next();
                               }
                           }
                           else
                           {
                               System.out.println("Please enter number...");
                               Calc.next();
                           }
                           }   
                           break;
                       }   
                                                                     
                   }
                   
               
               }
           }
           System.out.println("If you wish to exit the program enter 'exit'.. type anything else to exit");           
           while(ender == false)
           {
               if(Word.hasNextLine())
               {
                   ender2 = Word.next();
                   if(ender2.equalsIgnoreCase("exit"))
                   {
                       ender = true;
                   }
               }
               else
               {
                   System.out.println("Please enter the keyword/s requested");
               }
           }
           
           }while(ender2.equalsIgnoreCase("hey"));
           if (calcfunc == 2)
                   {
                        System.out.println("****************DYNAMIC CALCULATOR****************");
                        while(checker2 == false)
                        {
                            System.out.println("Please enter the first number ");
                            if(Calc.hasNext())
                            {
                                num1 = Calc.nextInt();
                                checker2 = true;
                            }
                            else
                            {
                                System.out.println("Nice try... please enter a number");
                                Calc.next();
                            }
                        }
                        while(checker3 == false)
                        {
                            System.out.println("Please enter the second number ");
                            if(Calc.hasNext())
                            {
                                num2 = Calc.nextInt();
                                checker2 = true;
                            }
                            else
                            {
                                System.out.println("Nice try... please enter a number");
                                Calc.next();
                            }
                        }
                   }
           
           
           
           
           }
           
           
        
    
    public static void intro()
    {
        System.out.println("Here are the functions we offer:");
           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
           System.out.println("3. Division");
           System.out.println("4. Multiplication");
           
           
           System.out.println("We offer the option of setting a default function for a total number of inputs ");
           System.out.println("Alternatively, we offer a dynamic calculator which will ask you for the function you wish to conduct and the number you wish to enter, after every input");
           System.out.println("Please choose which function you would like by selecting the adjacent number:");
           
    }
    
    public static void func()
    {
        System.out.println("Here are the functions we offer, please select the number corresponding to the function on offer:");
           System.out.println("1. Addition");
           System.out.println("2. Subtraction");
           System.out.println("3. Multiplication");
           System.out.println("4. Division");
          
           
           
    }
    
    public static double loop(double num1)
    {
        System.out.println("Please enter the number");
        boolean checker = false;
        Scanner Calc2 = new Scanner(System.in);
        while(checker == false)
        {
            if(Calc2.hasNextDouble())
            {
                num1 = Calc2.nextDouble();
                checker  = true;
            }
                
            else
            {
                System.out.println("Please input a number");
                Calc2.next();
            }
        }
       return num1; 
        
    }
    
    public static double add(double num2[], int total2)
    {
        double addloop = 0;
        for(int count = 0; count < total2; count++)
        {
        addloop = addloop + num2[count];
        }
        
        return (addloop);
    }
    
    public static double sub1(double num3[],int total3)
    {
        double subloop = 0;
        for(int count =0; count <total3; count++)
        {
            subloop = subloop + num3[count];
        }
        return (subloop);
    }
    
    
    public static double mult1(double num4[], int total4)
    {
        double multloop = 1;
        
        for(int count=0; count < total4; count++)
        {
            multloop=multloop*num4[count];
        }
        
        return(multloop);
        
    }
    
    public static double div1(double num5[], int total5)
    {
        double divloop = num5[0];
        
        for(int count =1; count < total5; count++)
        {
            divloop = divloop/num5[count];
        }
        
        return(divloop);
    }
    
    public static double div2(double num6[], int total6)
    {
          double divloop = num6[0];
          double switcher;
          for(int count =0; count < total6; count++)
          {
              for(int looper = count+1; looper < total6; looper++)
              {
                  if(num6[looper] > num6[count])
                  {
                      switcher = num6[count];
                      num6[count] = num6[looper];
                      num6[looper] = switcher;
                  }
              }
          }
          
          for(int count = 1; count < total6; count++)
          {
              divloop = divloop/num6[count];
          }
          return(divloop);
    }
    
    public static double div3(double num7[], int total7)
    {
        double divloop = num7[0];
        double switcher;
        for(int count =0; count < total7; count++)
          {
              for(int looper = count+1; looper < total7; looper++)
              {
                  if(num7[looper] < num7[count])
                  {
                      switcher = num7[count];
                      num7[count] = num7[looper];
                      num7[looper] = switcher;
                  }
              }
          }
        
        for(int count = 1; count <total7; count++)
        {
            divloop = divloop/num7[count];
        }
        
        return (divloop);
    }
    
        
}
