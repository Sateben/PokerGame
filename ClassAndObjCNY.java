/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.util.*;
import java.io.*;

public class ClassAndObjCNY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner SackManagement = new Scanner(System.in);
        int ordertotal = 0;
        
        System.out.println("Hello and Welcome to Order Management Service!");
        System.out.println("");
        
        boolean checker1 = false;
        
        while(checker1 == false)
        {
        
            System.out.println("Please enter the total number of sacks for your order: ");
            
            if(SackManagement.hasNextInt())
            {
                ordertotal = SackManagement.nextInt();
                
                checker1 = true;
            }
            
            else
            {
                System.out.println("Please enter a valid number");
                
                SackManagement.next();
            }
            
            
            
        }
        
        OrderChecker orderintake = new OrderChecker(ordertotal);
        
        for(int count = 0; count < ordertotal; count++)
        {
            orderintake.OrderType();
            orderintake.OrderPrice1();
        }
        
        System.out.println("The number of rejected orders were " +orderintake.FaultyOrder2);
        
        orderintake.OrderPrice2();
        
    }
    
}

class Individual
{
    static double count = 0;
    boolean checker1 = false, checker2 = false, checker3 = false;
    double C, G, S;
    static String finalchecker1[][] = new String [1][3], sacktype;
    int sackprice = 0;
    
    int FaultyOrder = 0;
    
    public Individual (String propersacktype)
    {
        sacktype = propersacktype;
    }
    
    public void weightgetter()
    {
        
        boolean checker4 = false;
        
        Scanner Weight = new Scanner (System.in);
        
       while(checker4 == false)
       {
           System.out.println("What is the weight of the sack?");
           
           if(Weight.hasNextDouble())      
            {
                if(sacktype.equalsIgnoreCase("C"))
                {
                    C = Weight.nextDouble();
                    
                }
                
                else if(sacktype.equalsIgnoreCase("G"))
                {
                    G = Weight.nextDouble();
                    
                    
                }
                
                else if(sacktype.equalsIgnoreCase("S"))
                {
                    S = Weight.nextDouble();
                    
                    
                }
                
                checker4 = true;
            }
           
           else 
           {
               System.out.println("Please enter the correct weight");
               
               Weight.next();
           }
       }
       
    
    }
    
    public String[][] checker() {
    
        if (S >= 49.9 && S <= 50.1)
        {
                checker1 = true;
        }        
                
                if(sacktype.equalsIgnoreCase("S"))
                {
                if(checker1 == true)
                {
                    finalchecker1 [0][0] = "Sand";
                    finalchecker1 [0][1] = "accepted";
                    finalchecker1 [0][2] = "perfect";
                    
                    count = S;
                }
                
                else if (checker1 == false)
                {
                    finalchecker1 [0][0] = "Sand";
                    finalchecker1 [0][1] = "rejected";
                    
                    if(S < 49.9)
                    {
                        finalchecker1[0][2] = "underweight";
                    }
                    
                    else if(S > 50.1)
                    {
                        finalchecker1[0][2] = "overweight";
                    }
                }
            
                }
                
                
        
        if (G >= 49.9 && G <= 50.1)
        {
            checker2 = true;
        }    
        
         if(sacktype.equalsIgnoreCase("G"))
         {
            if(checker2 == true)
            {
                finalchecker1 [0][0] = "Gravel";
                finalchecker1 [0][1] = "accepted";
                finalchecker1 [0][2] = "perfect";
                count = G;
            }
            
            else if(checker2 == false)
            {
                finalchecker1 [0][0] = "Gravel";
                finalchecker1 [0][1] = "rejected";
                
                if(G < 49.9)
                {
                    finalchecker1[0][2] = "underweight";
                }
                
                else if(G > 50.1)
                {
                    finalchecker1[0][2] = "overweight";
                }
            }
        
         }
         
         
        if (C >= 24.9 && C <= 25.1)
        {
            checker3 = true;
        }    
        
        if(sacktype.equalsIgnoreCase("C"))
        {
            if(checker3 == true)
            {
                finalchecker1 [0][0] = "Cement";
                finalchecker1 [0][1] = "accepted";
                finalchecker1 [0][2] = "perfect";
                count = C;
            }
            
            else if(checker3 == false)
            {
                finalchecker1 [0][0] = "Cement";
                finalchecker1 [0][1] = "rejected";
                
                if(C < 24.9)
                {
                    finalchecker1[0][2] = "underweight";
                }
                
                else if(C > 25.1)
                {
                    finalchecker1[0][2] = "overweight";
                }
            }
        
        }
        
        return finalchecker1;
    }
    
    
    public void CounterChecker ()
    {
        if(finalchecker1[0][1].equals("rejected"))
        {
            FaultyOrder++;
        }
    }
    
    public void Price()
    {
        
        if(sacktype.equalsIgnoreCase("S"))
        {
            sackprice = 2;
            
        }
        
        else if(sacktype.equalsIgnoreCase("C"))
        {
            sackprice = 3;
        }
        
        if(sacktype.equalsIgnoreCase("G"))
        {
            sackprice = 2;
        }
        
        
        
    }
}
    
 class OrderChecker
 {
     static double orderweighttotal=0;
     static int FaultyOrder2 = 0;
     String ordertype;
     static int sandsacks = 0, gravelsacks = 0, cementsacks = 0, totalorderprice = 0;
     int totalloops2 = 0,totalcount1 = 0;
     
     public OrderChecker(int totalloops)
     {
         String sackcount[] = new String[totalloops];
         
         totalloops2 = totalloops;
     }
 
     public void OrderType()
     {
         
       Scanner SackType = new Scanner(System.in); //deals with the type of sack
       
       Scanner SackWeight = new Scanner(System.in); //deals with weight of sack
     
       boolean checker1 = false;
       
       while(checker1 == false)
       {
           System.out.println("What is the type of sack you want?");
       
           ordertype = SackType.next();
           
           if(ordertype.equalsIgnoreCase("C")||ordertype.equalsIgnoreCase("G")||ordertype.equalsIgnoreCase("S"))
           {
               
               checker1 = true;
           }
           
           else 
           {
               System.out.println("Please enter a relevant sacktype..'C' for Cement, 'G' for gravel and 'S' for sand");
               
               SackType.next();
           }
               
       }
       
       Individual sackcheck = new Individual(ordertype);
       
       sackcheck.weightgetter();
       
       sackcheck.checker();
       
       sackcheck.CounterChecker();
       
       System.out.println("The sack containing "+ sackcheck.finalchecker1[0][0]+ " has been "+ sackcheck.finalchecker1[0][1]+ " for being " +sackcheck.finalchecker1[0][2]);
       
       if(sackcheck.count > 0)
       { 
           orderweighttotal = orderweighttotal + sackcheck.count;
       }
       
       FaultyOrder2 = FaultyOrder2 + sackcheck.FaultyOrder;
       
     }
     
     public void OrderPrice1()
     {
        Individual sackcheck = new Individual(ordertype);
        
        sackcheck.Price();
        
        totalorderprice = sackcheck.sackprice + totalorderprice;
        
       if(sackcheck.sacktype.equalsIgnoreCase("S"))
            {
                if(sackcheck.finalchecker1[0][1].equals("accepted"))
                {
                    sandsacks++;
                }
            }
            
            else if(sackcheck.sacktype.equalsIgnoreCase("G"))
            {
                if(sackcheck.finalchecker1[0][1].equals("accepted"))
                {
                    gravelsacks++;
                }
            }
            
            else if(sackcheck.sacktype.equalsIgnoreCase("C"))
            {
                if(sackcheck.finalchecker1[0][1].equals("accepted"))
                {
                    cementsacks++;
                }
            }
        
        
       
     }
     
     public void OrderPrice2()
     {
         if(sandsacks >=2 && gravelsacks>=2)
         {
          if(sandsacks == gravelsacks)
        {
            int tempdiv = sandsacks/2;
            
            if(cementsacks >= tempdiv)
            {
                totalcount1 = tempdiv;
            }
            
            else
            {
                totalcount1 = cementsacks;
            }
        }
        
        else if(sandsacks > gravelsacks)
        {
            int tempdiv = gravelsacks/2;
            
            if(cementsacks >= tempdiv)
            {
                totalcount1 = tempdiv;
            }
            
            else
            {
                totalcount1 = cementsacks;
            }
         
            
          
        }
          
         
        else if (sandsacks < gravelsacks)
        {
            int tempdiv = sandsacks/2;
            
            if(cementsacks >= tempdiv)
            {
                totalcount1 = tempdiv;
            }
            
            else
            {
                totalcount1 = cementsacks;
            }
        }
          
         }
         
         else
         {
             totalcount1 = 0;
         }
          
          System.out.println(cementsacks);
          System.out.println(sandsacks);      
          System.out.println(gravelsacks);
          int discountprice = totalcount1*10;
          
          int savings = totalorderprice - discountprice;
          
          System.out.println("The total weight is "+orderweighttotal);
          
          System.out.println("Your total order cost comes to: " +totalorderprice);
          
          System.out.println("The discount applied is: "+discountprice);
          
          System.out.println("Your final cost is: "+savings);
          
     }
     
     
 }
