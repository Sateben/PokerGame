/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

/*
1 = Clubs
2 = Diamonds
3 = Hearts
4 = Spades
*/

//objective of PokerX2 is to clean the code of PokerX1 and add some minor improvements

public class PokerX2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     Scanner Poker = new Scanner(System.in);
        
     intro();
     char ucard[] = new char[2];
            cardno(ucard); // these are the user's card nos.
     char syscard[] = new char[2];
            cardno(syscard); // these are the computer's card nos.
     char ucardsuite[] = new char[2];
             cardsuite(ucardsuite);
     char syscardsuite[] = new char[2];
             cardsuite(syscardsuite);
     int ucard1[] = new int[2]; //for some reason System.out.println wasn't printing the char.. so I converted the char values to Int out here
     for(int count = 0; count < 2; count++)
     {
         ucard1[count] = 0 + ucard[count];
     }
     int syscard1[] = new int[2];
      for(int count = 0; count < 2; count++)
     {
         syscard1[count] = 0 + syscard[count];
     }
        
     for(int count = 0; count < 2; count++) // the user sees his/her cards
     {
         System.out.println("");
         if(ucard1[count] < 11)
         {
         cardsuiteconverter(ucardsuite[count]);
         System.out.println(ucard1[count]);
         }
         
         else
         {
          cardsuiteconverter(ucardsuite[count]);
          cardpowerconverter(ucard[count]);         
         }
         
     }
     // the computer's hand is just kept here in the initial stages so that we know if the program is working properly..the final version won't have this
     
     System.out.println("Here are the computer's cards:");
     for(int count = 0; count < 2; count++) // the user sees his/her cards
     {
         System.out.println("");
         if(syscard1[count] < 11)
         {
         cardsuiteconverter(syscardsuite[count]);
         System.out.println(syscard1[count]);
         }
         
         else
         {
          cardsuiteconverter(syscardsuite[count]);
          cardpowerconverter(syscard[count]);         
         }
         
     }
     char round1[] = new char[3];
     char round1suite[] = new char [3];
     char round2[] = new char[1];
     char round2suite[] = new char [1];
     char round3[] = new char[1];
     char round3suite[] = new char[1];
     gamerwork();
     if(Poker.hasNextInt())
     {
         int inputter = Poker.nextInt(); //takes scanner input
         if(inputter == 1)
         {
             cardno(round1);
             cardsuite(round1suite);
             int round1int[] = new int[3];
             shower(round1int,round1,round1suite);
             gamerwork();
             if(Poker.hasNextInt())
             {
                 inputter = Poker.nextInt();
                 if(inputter == 1)
                 {
                     cardno(round2);
                     cardsuite(round2suite);
                     int round2int[] = new int[1];
                     shower(round2int,round2,round2suite);
                     gamerwork();
                     if(Poker.hasNextInt())
                     {
                         inputter = Poker.nextInt();
                         if(inputter == 1)
                         {
                             cardno(round3);
                             cardsuite(round3suite);
                             int round3int[] = new int[1];
                             shower(round3int,round3,round3suite);
                             Poker.next();
                             decider( ucard, ucardsuite,  syscard, syscardsuite, round1, round1suite, round2, round2suite, round3, round3suite);

                         }
                     }
                     
                 }
             }
         }
     }
    }
    
    public static void intro()
    {
        System.out.println("Welcome to Earth Hold 'em Poker!");
        System.out.println("We will begin by dealing you two cards.");
    }
    
    public static char[] cardno(char rancard[])  //this method serves to generate the random card nos. for both players
    {
        int min = 1, max = 14;
        int range = (max - min) +1;
        for(int count = 0; count < rancard.length; count++)
        {
             rancard[count] = (char) ((char)(Math.random()*range)+min);
            
        }
       
        return rancard;
    }
    public static char[] cardsuite(char rancard[])
    {
        int min = 1, max = 4;
        int range = (max - min)+1;
        for(int count = 0; count < rancard.length; count++)
        {
            rancard[count] = (char) ((char)(Math.random()*range)+min);
        }
        
        
        return rancard;
    }
    
    public static void cardsuiteconverter(char rancardsuite)
    {
        
            if(rancardsuite == 1)
            {
                System.out.println("Clubs");
            }
            if(rancardsuite == 2)
            {
                System.out.println("Diamonds");
            }
            if(rancardsuite == 3)
            {
                System.out.println("Hearts");
            }
            if(rancardsuite == 4)
            {
                System.out.println("Spades");
            }
        
    }
    
    public static void cardpowerconverter(char ucard)
    {
        
        
        if (ucard == 11)
            ucard = 'J';
        else if (ucard == 12)
            ucard = 'Q';
        else if (ucard == 13)
            ucard = 'K';
        else if (ucard == 14)
            ucard = 'A';
        
        System.out.println(ucard);
    }
    
    public static void gamerwork()
    {
        System.out.println("Please enter the number corresponding to the function you wish to perform:");
        System.out.println("1.Check");
        System.out.println("2.Fold");
    }
    
    public static void shower(int ucard1[], char rancard[], char rancardsuite[])
    {
      
     for(int count = 0; count < ucard1.length; count++)
     {
         ucard1[count] = 0 + rancard[count];
     }
        
     for(int count = 0; count < ucard1.length; count++) // the user sees his/her cards
     {
         if(ucard1[count] < 11)
         {
         cardsuiteconverter(rancardsuite[count]);
         System.out.println(ucard1[count]);
         }
         
         else
         {
          cardsuiteconverter(rancardsuite[count]);
          cardpowerconverter(rancard[count]);         
         }
         
     }   
    }
    
    public static void decider(char ucard[], char ucardsuite[], char syscard[], char syscardsuite[], char round1[], char round1suite[], char round2[], char round2suite[], char round3[], char round3suite[])
    {
      boolean checker = false;
      int decision2 = 0,decision3 = 0,decision4=0,decision5=0,decision6=0,decision7=0,decision8=0;
          decision2 = straightflush(ucard,  ucardsuite,  syscard, syscardsuite,  round1,  round1suite,  round2, round2suite, round3, round3suite);
          if (decision2 == 1)
          {
              System.out.println("CONGRATULATIONS!! YOU HAVE WON WITH A STRAIGHT FLUSH");             
          }
          else if (decision2 == 2)
          {
              System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A STRAIGHT FLUSH");
          }
          else if (decision2 == 3)
          {
              System.out.println("IT'S A TIE! SF");
          }
          else if (decision2 == 0)
          {
              decision3 = fourofakind(ucard,  ucardsuite,  syscard, syscardsuite,  round1,  round1suite,  round2, round2suite, round3, round3suite);
              if(decision3 == 1)
              {
                  System.out.println("CONGRATULATIONS! YOU HAVE WON WITH A FOUR OF A KIND");
              }
              else if(decision3 == 2)
              {
                  System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A FOUR OF A KIND");
              }
              else if(decision3 == 3)
              {
                  System.out.println("IT'S A TIE! 4OFAKIND");
              }
              else if(decision3 == 0)
              {
                decision4 = fullhouse(ucard,  ucardsuite,  syscard, syscardsuite,  round1,  round1suite,  round2, round2suite, round3, round3suite);
                if(decision4 == 1)
                {
                    System.out.println("CONGRATULATIONS! YOU HAVE WON WITH A FULLHOUSE");
                }
                else if(decision4 == 2)
                {
                    System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A FULLHOUSE");
                }
                else if(decision4 == 3)
                {
                    System.out.println("IT'S A TIE!!! FULLHOUSE");
                }
                else if(decision4 == 0)
                {
                   decision5 = flush(ucardsuite,syscardsuite,round1suite,round2suite,round3suite);
                   if(decision5 == 1)
                   {
                       System.out.println("CONGRATULATIONS! YOU HAVE WON WITH A FLUSH");
                   }
                   else if(decision5 == 2)
                   {
                       System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A FLUSH");
                   }
                   else if(decision5 == 3)
                   {
                       System.out.println("IT'S A TIE! FLUSH");
                   }
                   else if(decision5 == 0)
                   {
                       int decision1 = straight(ucard, syscard, round1, round2, round3);
                       if(decision1 == 1)
                           System.out.println("CONGRATULATIONS! YOU HAVE WON WITH A STRAIGHT");
                       else if(decision1 == 2)
                           System.out.println("SORRY! YOU HAVE LOST TO THE COMPUTER, WHO WON WITH A STRAIGHT");
                       else if(decision1 == 3)
                           System.out.println("IT'S A TIE!! STRAIGHT");
                       else if(decision1 == 0)
                       {
                       decision6 = threeofakind(ucard,syscard,round1,round2,round3);
                       if(decision6 == 1)
                       {
                           System.out.println("CONGRATULATIONS! YOU HAVE WON WITH A THREE OF A KIND");
                       }
                       else if(decision6 == 2)
                       {
                           System.out.println("SORRY! YOU HAVE LOST TO THE COMPUTER, WHO WON WITH A THREE OF A KIND");
                       }
                       else if(decision6 == 3)
                       {
                           System.out.println("IT'S A TIE");
                       }
                       else if(decision6 == 0)
                       {
                           decision7 = twopairs(ucard,syscard,round1,round2,round3);
                           if(decision7 == 1)
                               System.out.println("CONGRATULATIONS! YOU WIN BY TWOPAIRS");
                           else if(decision7 == 2)
                               System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A TWOPAIR");
                           else if(decision7 == 3)
                               System.out.println("IT'S A TIE");
                           else if(decision7 == 0)
                           {
                              decision8 = highcard(ucard,syscard);
                              if(decision8 == 1)
                                  System.out.println("CONGRATULATIONS! YOU WIN BY A HIGHCARD");
                              else if(decision8 == 2)
                                  System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A HIGHCARD");
                              else if(decision8 == 3)
                                  System.out.println("IT'S A TIE!");
                           }
                       }
                   }
                }
                
              }
          }
          }
    }    
    
    public static int straightflush(char ucard[], char ucardsuite[], char syscard[], char syscardsuite[], char round1[], char round1suite[], char round2[], char round2suite[], char round3[], char round3suite[])
    {
        boolean checker1 = false,checker2 = false; 
        char dealersuite[] = new char[round1suite.length+round2suite.length+round3suite.length], dealer[] = new char[round1.length+round2.length+round3.length], flushhand[] = new char [ucard.length+dealer.length];
        int counter = 0,total1 = 0;
        
        for(int count = 1; count < ucardsuite.length; count++ )
        {
            if (ucardsuite[count-1] != ucardsuite[count])
            {
                
                checker1 = true;
            }
        }
        
        if(checker1 == false)
        {
            
            for(int count = 0; count < round1suite.length; count++)
            {
                dealersuite[count] = round1suite[count];
            }
            dealersuite[3] = round2suite[0];
            dealersuite[4] = round3suite[0];
           
            for(int count = 0; count < dealersuite.length; count++)  //this is done to ensure that there are at least 3 cards of the same card suite
            {
                if(ucardsuite[0] == dealersuite[count])
                {
                    System.out.println("Line 365");
                    counter++;
                }
            }
            
            if (counter >= 2)
            {
              
            for(int count = 0; count < round1.length; count++)
                {
                     dealer[count] = round1[count];
                }
            dealer[3] = round2[0];
            dealer[4] = round3[0];
            int counter2 = ucard.length;
            
            for (int count = 0; count < ucard.length; count++)
            {
                flushhand[count] = ucard[count];
            }
            
            for (int count = 0; count < dealer.length; count++ )
            {
                if(ucardsuite[0] == dealersuite[count])
                {
                    flushhand[counter2] = dealer[count];
                    counter2++;
                }
            }
            
            //we need to shrink flushhand array because dealer.length+counter2+1 < flushhand.length
            
            char newflushhand[] = new char [counter2+1];
            System.arraycopy(flushhand, 0, newflushhand, 0, newflushhand.length);            
            for(int count = 0; count < newflushhand.length; count++)
            {
                total1 = total1 + newflushhand[count];
            }   
            
            
            
            for (int count = 1; count < newflushhand.length; count++)
            {
                if (newflushhand[count - 1] > newflushhand[count])
                {
                    char swapper = newflushhand[count];
                    newflushhand[count] = newflushhand[count - 1];  
                    newflushhand [count - 1] = swapper;
                }
            }
            
            for (int count = 1; count < newflushhand.length; count++)
            {
                if (newflushhand[count] != newflushhand[count-1] + 1)
                {
                    checker2 = true;
                }
            }
            
             
            
            }
            else
                checker2 = true;
            
           
                                       
        }
        
       
        
        
        boolean checker3 = false,checker4 = false;
        char flushhandsys[] = new char[syscard.length+dealer.length];
        int decision = 0, total2 = 0;
        
        for(int count = 1; count < syscardsuite.length; count++ )
        {
            if (syscardsuite[count-1] != syscardsuite[count])
            {
                checker3 = true;
            }
        }
        
        if(checker3 == false)
        {
              for(int count = 0; count < round1suite.length; count++)
            {
                dealersuite[count] = round1suite[count];
            }
            dealersuite[3] = round2suite[0];
            dealersuite[4] = round3suite[0];
            
            for(int count = 0; count < dealersuite.length; count++)  //this is done to ensure that there are at least 2 cards of the same card suite
            {
                if(ucardsuite[0] == dealersuite[count])
                {
                    counter++;
                }
            }
            
          
            
            if (counter >= 2)
            {
            for(int count = 0; count < round1.length; count++)
                {
                     dealer[count] = round1[count];
                }
            dealer[3] = round2[0];
            dealer[4] = round3[0];
            int counter2 = syscard.length;
            
            for (int count = 0; count < syscard.length; count++)
            {
                flushhandsys[count] = syscard[count];
            }
            
            for (int count = 0; count < dealer.length; count++ )
            {
                if(syscardsuite[0] == dealersuite[count])
                {
                    flushhandsys[counter2] = dealer[count];
                    counter2++;
                }
            }
            
            //we have to create a new array that will be the size of the logical size of the flushhandsys array
            char newflushhandsys[] = new char[counter2+1];
            System.arraycopy(flushhandsys, 0, newflushhandsys, 0, newflushhandsys.length);
            
            for(int count = 0; count < newflushhandsys.length; count++)
               total2 = total2 + newflushhandsys[count];
            
            
            
            for (int count = 1; count < newflushhandsys.length; count++)
            {
                if (newflushhandsys[count - 1] > newflushhandsys[count])
                {
                    char swapper = newflushhandsys[count];
                    newflushhandsys[count] = newflushhandsys[count - 1];
                    newflushhandsys [count - 1] = swapper;
                }
            }
            
            for (int count = 1; count < newflushhandsys.length; count++)
            {
                if (newflushhandsys[count] != newflushhandsys[count-1] + 1)
                {
                    checker4 = true;
                }
            }
            
            
            
            }
            else
                checker4 = true;
        }
        
       
        
        if(checker1==false && checker3 == false)
        {
            if(checker2 == false && checker4 == true)
            {
                decision = 1; //user wins
            }
            else if(checker2 == true && checker4 == false)
            {
                decision = 2; //computer wins
            }
            else if(checker2 == false && checker4 == false)
            {
                if(total1 == 0 && total2 != 0)
                    decision = 2;
                else if(total1 != 0 && total2 == 0)
                    decision = 1;
                else if(total1 == 0 && total2 == 0)
                    decision = 0;
                if(total1 != 0 && total2 != 0)
                {
                if(total1 > total2)
                {
                    decision = 1;
                }
                else if (total1 < total2)
                {
                    
                    decision = 2;
                }
                else if (total1 == total2)
                {
                    decision = 3; //it's a tie!                    
                }
                }
            }
        
           else if(checker2 == true && checker4 == true)
                decision = 0;
        }
        else if(checker1 == false && checker3 == true)
        {
            if(checker2 == false)
                decision = 1;
            else if(checker2 == true)
                decision = 0;
        }
        else if(checker1 == true && checker3 == false)
        {
            System.out.println("ADELE LOVERS UNITE"); // checks if program reaches till here
            if(checker4 == false)
                decision = 2;
            else if(checker4 == true)
                decision = 0;
        }
        else if(checker1 == true && checker3 == true)
        {
            System.out.println("HELLLOOOOOOO"); //checks if program reaches till here 
            decision = 0;
        }   
            
                                   
        
        
        return decision;
                
    }  
    
    public static int fourofakind(char ucard[], char ucardsuite[], char syscard[], char syscardsuite[], char round1[], char round1suite[], char round2[], char round2suite[], char round3[], char round3suite[])
    {
        System.out.println("HIIII");//checks if program reaches till here
        int decision = 0;
        char dealer[] = new char [round1.length+round2.length+round3.length];
        
        boolean checker1 = false,checker2 = false;
        for (int count = 0; count < round1.length; count++)
        {
            dealer[count]  = round1[count];
        }
        
        System.out.println("CHECKING1");
        
        dealer[3] = round2[0];
        dealer[4] = round3[0];
        
        int counter1 = 0;
        char total1[] = new char [ucard.length + dealer.length];
         
        for (int count = 0; count<ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        
        for (int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        
        
        int counter2 = 0, counter3 = 0;
        int ufour =0;
        for (int count = 1;count < total1.length; count++)
        {
            if(total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        for(int count = 0; count < ucard.length; count++)
        {
            for(counter2 = 0; counter2 < total1.length; counter2++)
            {
            if(ucard[count] == total1[counter2])
            {
                counter3++;
            }
            }
            if(counter3 >= 4)
            {
                ufour = 0+ucard[count];
                checker1 = true;
            }
            counter3 = 0;
        }
        System.out.println(ufour+"  hiiii");
        
        int counter4 = 0, counter5 = 0, counter6 = 0;
        int sysfour = 0;
        char total2[] = new char[syscard.length+dealer.length];
        for (int count = 0; count<syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        
        for (int count = syscard.length; count < total1.length; count++)
        {
            total2[count] = dealer[counter4];
            counter4++;
        }
        
        for(int count = 0; count < syscard.length; count++)
        {
            
            for(counter5 = 0; counter5 < total2.length; counter5++)
            {
                if(syscard[count] == total2[counter5])
            {
                counter6++;
            }
            }
            if(counter6 >= 4)
            {
                sysfour = 0 + syscard[count];
                checker2 = true;
            }
            counter6 = 0;
        }
        System.out.println("sysfour is " +sysfour);
        
        if(checker1 == true && checker2 == true)
        {
            System.out.println("CHECKING");
            if(ufour>sysfour)
                decision = 1; // user wins
            else if(ufour < sysfour)
                decision = 2; //computer wins 
            else if(ufour == sysfour)
                decision = 3; // it's a tie!!
                
        }
        else if(checker1 == true && checker2 == false)
            decision = 1; //user wins
        else if(checker1 == false && checker2 == true)
            decision = 2;//computer wins 
        else if(checker1 == false && checker2 == false)
            decision = 0;
        
      return decision; 
    }
    
    
    public static int fullhouse(char ucard[], char ucardsuite[], char syscard[], char syscardsuite[], char round1[], char round1suite[], char round2[], char round2suite[], char round3[], char round3suite[])
    {
        System.out.println("Fullhouse Entry");
        char dealer[] = new char[5];
        char dealersuite[] = new char[5];
        char u2card2 = '0';
        char u2card3 = '0';
        
        char sys2card2 = '0';
        char sys2card3 = '0';
        
        int decision = 0;
        for (int count = 0; count < round1.length; count++)
        {
            dealer[count]  = round1[count];
        }
        
        for (int count = 0; count < round1suite.length; count++)
        {
            dealersuite[count] = round1suite[count];
        }
        
        dealer[3] = round2[0];
        dealer[4] = round3[0];
        dealersuite[3] = round2suite[0];
        dealersuite[4] = round3suite[0];
        int counter1 = 0;
        char total1[] = new char [ucard.length + dealer.length];
        
        for (int count = 0; count<ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        
        for (int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        for (int count = 1; count < total1.length; count++)
        {
            if (total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
       
        char total2[] = new char [syscard.length + dealer.length];
        
        for(int count = 0; count < syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        int counter2 = 0;
        for (int count = syscard.length; count < total2.length; count++)
        {
            
            total2[count] = dealer[counter2];
            counter2++;
        }
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] > total2[count])
            {
                char swapper = total2[count-1];
                total2[count-1] = total2[count];
                total2[count] = swapper; 
            }
        }
    
        
        // in case of user's cards:
        
        boolean checker1 = false, checker2 = false, checker3 = false; 
        int counter3 = 0;
        
        
            for(int count = 0; count < ucard.length; count++ )
            {
                for(int count2 = 0; count2 < total1.length; count2++)
                {
                    if(ucard[count] == total1[count2])
                    {
                        counter3++;
                    }
                }
                // we must compensate for the fact that total1 will include ucard[count] as well..
                if(counter3 == 2) 
                {
                    u2card2 = total1[count];
                    
                    checker2 = true;
                }
                
                if(counter3 == 3)
                {
                    u2card3 = total1[count];
                  
                    checker3 = true;
                }
                counter3 = 0;
            }
        
        
        // in the case of the system's cards 
        boolean checker5 = false, checker6 = false;
        int counter4 = 0;
        
       
            for(int count = 0; count < syscard.length; count++)
            {
                for(int counter = 0; counter < total2.length; counter++)
                {
                    if(syscard[count] == total2[counter])
                    {
                        counter4++;
                    }
                }
                // same reason as stated in previous comment 
                if(counter4 == 2)
                {
                   sys2card2 = total2[count];
                   
                   checker5 = true;
                }
                
                if(counter4 == 3)
                {
                    sys2card3 = total2[count];
                    
                    checker6 = true;
                }
                counter4 = 0;
            }
        
        if(checker2 == true && checker3 == true && checker5 == true && checker6 == true)
       {
            
            int usum = 0 + u2card2 + u2card3;   
            int syssum = 0 + sys2card2 + sys2card3; // this is done to add up the value of the player and the computer's cards to check which has the greater value
            if(usum > syssum)
                decision = 1; //user wins
            else if(syssum > usum)
                decision = 2; // system wins
            else if (usum == syssum)
                decision = 3; // it's a TIE
        }
        
        else if(checker2 == true && checker3 == true &&  (checker5 == false || checker6 == false))
        {
          decision = 1; //user wins  
        }
        
        else if((checker2 == false || checker3 == false) && checker5 == true && checker6 == true)
        {
            decision = 2; //computer wins
        }
        
        else if((checker2 == false || checker3 == false) && (checker5 == false || checker6 == false))
            decision = 0;
        
        return decision; 
    }
    
    public static int flush(char ucardsuite[], char syscardsuite[],char round1suite[], char round2suite[], char round3suite[])
    {
       char dealersuite[] = new char[round1suite.length+round2suite.length+round3suite.length];
       int decision = 0,count1 = 0,count2 = 0; 
       for(int count = 0; count < round1suite.length; count++)
       {
           dealersuite[count] = round1suite[count];
       }
       dealersuite[3] = round2suite[0];
       dealersuite[4] = round1suite[0];
       //for user's cards
       char total1[] = new char [dealersuite.length + ucardsuite.length];
       boolean checker1 = false, checker2 = false; 
       
       for(int count = 1; count < ucardsuite.length; count++)
       {
           if(ucardsuite[count-1] != ucardsuite[count])
               checker1 = true;
       }
       if(checker1 == false)
       {
       for(int count = 0; count < ucardsuite.length; count++)
       {
           total1[count] = ucardsuite[count];
       }
       int counter1 = 0; 
       for(int count = ucardsuite.length; count <total1.length; count++)
       {
           total1[count] = dealersuite[counter1];
           counter1++;
       }
       
       for(int count = 1; count < total1.length; count++)
       {
           if(ucardsuite[0] == total1[count])
               count1++;
             
       }
       // we must compensate for the fact that ucardsuite[0] will also be a part of the total1 array.
       if(count1 >= 5)
           checker2 = true;
       }
       // for system's cards
       char total2[] = new char [dealersuite.length + syscardsuite.length];
       boolean checker3 = false, checker4 = false;
       
       for(int count = 1; count < syscardsuite.length; count++)
       {
           if(syscardsuite[count-1] != syscardsuite[count])
               checker3 = true;
       }
       
       if(checker3 == false)
       {    
       for(int count = 0; count < syscardsuite.length; count++)
       {
           total2[count] = syscardsuite[count];
       }
       int counter2 = 0;
       for(int count = syscardsuite.length; count < total2.length; count++ )
       {
           total2[count] = dealersuite[counter2];
           counter2++;
       }
       
       for(int count = 1; count < total2.length; count++)
       {
           if(syscardsuite[0] == total2[count])
           {
               count2++; 
           }
       }
       
       if(count2 >= 5)
           checker4 = true;
       }
       // conclusion
       
       if(checker2 == true && checker4 == true)
       { 
           int usum = total1[0];
           int syssum = total2[0];
           if(usum > syssum)
           {
               decision = 1; //user wins
           }
           else if(usum < syssum)
           {
               decision = 2; //computer wins
           }
           else if(usum == syssum)
           {
               decision = 3; //it's a TIE
           }
       }
       else if(checker2 == true && checker4 == false)
       {
           decision = 1; //user wins
       }
       else if(checker2 == false && checker4 == true)
       {
           decision = 2; //system wins
       }
       
       else if(checker2 == false && checker4 == false)
           decision = 0;
       
       return decision;
    }
    public static int straight(char ucard[], char syscard[], char round1[], char round2[],char round3[])
    {
        char dealer[] = new char[5];
        
        for(int count = 0; count < round1.length; count++)
        {
            dealer[count] = round1[count];
        }
        
        dealer[3] = round2[0];
        dealer[4] = round3[0];
        
        //user's card
        boolean checker1 = false;
        char total1[] = new char [ucard.length + dealer.length];
        
        for(int count = 0; count <ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        int counter1 = 0;
        for(int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count] != total1[count-1] + 1)
            {
                checker1 = true; //this would mean that the numbers are not in sequence and therefore disqualify it from being a straight
            }
        }
        
        // system's cards
        boolean checker2 = false;
        char total2[] = new char [syscard.length + dealer.length];
        
        for(int count = 0; count <syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        int counter2 = 0;
        for(int count = syscard.length; count < total2.length; count++)
        {
            total2[count] = dealer[counter2];
            counter2++;
        }
        
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] > total2[count])
            {
                char swapper = total2[count-1];
                total2[count-1] = total2[count];
                total2[count] = swapper;
            }
        }
        
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count] != total2[count-1] + 1)
            {
                checker2 = true; //this would mean that the numbers are not in sequence and therefore disqualify it from being a straight
            }
        }
        
        //conclusion
        int decision = 0;
        
        if(checker1 == false && checker2 == false)
        {
            if(total1[0]>total2[0])
                decision = 1; //user wins
            else if(total1[0] < total2[0])
                decision = 2; //system wins
            else if(total1[0] == total2[0])
                decision = 3; // it's a TIE
        }
        
        else if (checker1 == false && checker2 == true)
            decision = 1; //user wins
        else if (checker1 == true && checker2 == false)
            decision = 2; //system wins
        
        return decision;
    }
    
    public static int threeofakind(char ucard[], char syscard[],char round1[], char round2[], char round3[])
    {
        char dealer[] = new char[5];
        char ucatch='0',syscatch='0';
        for(int count = 0; count < round1.length; count++)
        {
            dealer[count] = round1[count];
        } 
        dealer[3] = round2[0];
        dealer[4] = round3[0];
       
        //user cards
        boolean checker1 = false;
        char total1[] = new char [ucard.length+dealer.length];
        
        for(int count = 0; count < ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        int counter1 = 0;
        for(int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        int counter2 = 0; 
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] == total1[count])
            {
                counter2++;
                ucatch = total1[count];
            }
        }
        
        if(counter2 == 2)
        {
            checker1 = true;
        }
        
        //system's card
        boolean checker2 = false;
        char total2[] = new char [syscard.length+dealer.length];
        
        for(int count = 0; count < syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        int counter3 = 0;
        for(int count = syscard.length; count < total2.length; count++)
        {
            total2[count] = dealer[counter3];
            counter3++;
        }
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] > total2[count])
            {
                char swapper = total2[count-1];
                total2[count-1] = total2[count];
                total2[count] = swapper;
            }
        }
        int counter4 = 0; 
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] == total2[count])
            {
                counter4++;
                syscatch = total2[count];
            }
        }
        
        if(counter4 == 2)
        {
            checker2 = true;
        }
        
        //conclusion
        
        int decision = 0;
        
        if(checker1 == true && checker2 == true)
        {
            if(ucatch > syscatch)
                decision = 1; //user wins
            else if(ucatch < syscatch)
                decision = 2; //computer wins
            else if(ucatch == syscatch)
                decision = 3; //it's a TIE
        }
        else if(checker1 == true && checker2 == false)
            decision = 1; //user wins
        else if(checker1 == false && checker2 == true)
            decision = 2; //computer wins
        
        return decision;
    }
    
    public static int twopairs(char ucard[], char syscard[],char round1[], char round2[], char round3[])
    {
        char dealer[] = new char [5];
        
        for(int count = 0; count < round1.length; count++)
        {
            dealer[count] = round1[count];
        }
        dealer[3] = round2[0];
        dealer[4] = round3[0];
        
        //user's cards 
        boolean checker1 = false;
        char total1[] = new char [ucard.length + dealer.length], ucard1 = '0',ucard2 = '0';
        int counter1 = 0, counter2 = 0,counter3 = 1; 
        for(int count = 0; count < ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        for(int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        for(int count = 0; count < total1.length; count++)
        {
            for(int counter = count+1; counter<total1.length; counter++)
            {
                if(total1[count] == total1[counter])
                {
                    counter2++;
                }
            }
            if(counter2 == 1)
            {
                if(counter3 == 1)
                {
                    ucard1 = total1[count];
                }
                if(counter3 == 2)
                {
                    ucard2 = total1[count];
                    checker1 = true;
                }
                counter3++;
                counter2 = 0;
            }
        }
        
        //system's cards
        boolean checker2 = false;
        char total2[] = new char [syscard.length + dealer.length], syscard1 = '0',syscard2 = '0';
        int counter4 = 0, counter5 = 0,counter6 = 1; 
        for(int count = 0; count < syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        for(int count = syscard.length; count < total2.length; count++)
        {
            total2[count] = dealer[counter4];
            counter4++;
        }
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] > total2[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        for(int count = 0; count < total2.length; count++)
        {
            for(int counter = count+1; counter<total1.length; counter++)
            {
                if(total1[count] == total1[counter])
                {
                    counter5++;
                }
            }
            if(counter5 == 1)
            {
                if(counter6 == 1)
                {
                    syscard1 = total1[count];
                }
                if(counter6 == 2)
                {
                    syscard2 = total1[count];
                    checker2 = true;
                }
                counter6++;
                counter5 = 0;
            }
        }
        
        //conclusion
        int decision = 0;
        
        if(checker1 == true && checker2 == true)
        {
            int ucardtotal = ucard1 + ucard2;
            int syscardtotal = syscard1 + syscard2;
            
            if(ucardtotal > syscardtotal)
                decision = 1; //user wins
            else if(ucardtotal < syscardtotal)
                decision = 2; //system wins
            else if(ucardtotal == syscardtotal)
                decision = 3; //it's a TIE
        }
        
        else if(checker1 == true && checker2 == false)
            decision = 1; //user wins
        else if(checker1 == false && checker2 == true)
            decision = 2; //system wins
        
        return decision;   
    }
    
  
    
    public static int onepair(char ucard[], char syscard[],char round1[], char round2[], char round3[])
    {
        char dealer[] = new char [5];
        
        for(int count = 0; count < dealer.length; count++)
        {
            dealer[count] = round1[count];
        }
        dealer[3] = round2[0];
        dealer[4] = round3[0];
        
        //user's cards 
        boolean checker1 = false;
        char total1[] = new char [ucard.length + dealer.length], ucard1 = '0';
        int counter1 = 0, counter2 = 0; 
        for(int count = 0; count < ucard.length; count++)
        {
            total1[count] = ucard[count];
        }
        for(int count = ucard.length; count < total1.length; count++)
        {
            total1[count] = dealer[counter1];
            counter1++;
        }
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] > total1[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        for(int count = 0; count < total1.length; count++)
        {
            for(int counter = count+1; counter<total1.length; counter++)
            {
                if(total1[count] == total1[counter])
                {
                    counter2++;
                }
            }
            if(counter2 == 1)
            {
                
               
                    ucard1 = total1[count];
                    checker1 = true;
                
                
                counter2 = 0;
            }
        }
        
        //system's cards
        boolean checker2 = false;
        char total2[] = new char [syscard.length + dealer.length], syscard1 = '0';
        int counter4 = 0, counter5 = 0,counter6 = 1; 
        for(int count = 0; count < syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        for(int count = syscard.length; count < total2.length; count++)
        {
            total2[count] = dealer[counter4];
            counter4++;
        }
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count-1] > total2[count])
            {
                char swapper = total1[count-1];
                total1[count-1] = total1[count];
                total1[count] = swapper;
            }
        }
        for(int count = 0; count < total2.length; count++)
        {
            for(int counter = count+1; counter<total1.length; counter++)
            {
                if(total1[count] == total1[counter])
                {
                    counter5++;
                }
            }
            if(counter5 == 1)
            {
                
                    syscard1 = total1[count];
                    checker2 = true;
                
                counter6++;
                counter5 = 0;
            }
        }
        
        //conclusion
        int decision = 0;
        
        if(checker1 == true && checker2 == true)
        {
            int ucardtotal = ucard1;
            int syscardtotal = syscard1;
            
            if(ucardtotal > syscardtotal)
                decision = 1; //user wins
            else if(ucardtotal < syscardtotal)
                decision = 2; //system wins
            else if(ucardtotal == syscardtotal)
                decision = 3; //it's a TIE
        }
        
        else if(checker1 == true && checker2 == false)
            decision = 1; //user wins
        else if(checker1 == false && checker2 == true)
            decision = 2; //system wins
        
        return decision;  
    }
    
    public static int highcard(char ucard[], char syscard[])
    {
       
        
        //user's cards
        
        
        for(int count = 1; count < ucard.length; count++)
        {
            if(ucard[count-1] > ucard[count])
            {
                char swapper = ucard[count-1];
                ucard[count-1] = ucard[count];
                ucard[count] = swapper;
            }
        }
        
        //computer's cards
        for(int count = 1; count < syscard.length; count++)
        {
            if(syscard[count-1] > syscard[count])
            {
                char swapper = syscard[count-1];
                syscard[count-1] = syscard[count];
                syscard[count] = swapper;
            }
        }
        
        //conclusion
        int decision = 0;
        
        if(ucard[ucard.length-1] > syscard[syscard.length-1])
            decision = 1; //user wins
        else if(ucard[ucard.length - 1] < syscard[syscard.length-1])
            decision = 2; //computer wins
        else if(ucard[ucard.length-1] == syscard[syscard.length-1])
            decision = 3; //it's a TIE
        
        return decision;
        
        
    }
            
}
