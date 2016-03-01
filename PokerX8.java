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

//the objective of PokerX5 is to refine the code

public class PokerX8 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
     
     Scanner Poker = new Scanner(System.in);
        
     intro();
     int ubet = 0, sysbet = 0;
     ubet = initialbetting(ubet);
     ArrayList<Character> totalcard = new<Character> ArrayList();
     ArrayList<Character> totalcardsuite = new <Character> ArrayList();
     ArrayList<Character> totalplayercards = new<Character> ArrayList();
     ArrayList<Character> totalplayercardsuite = new <Character> ArrayList();

     char ucard[] = new char[2];
            cardno(ucard); // these are the user's card nos.
     char syscard[] = new char[2];
            cardno(syscard); // these are the computer's card nos.
            for(int count = 0; count < ucard.length; count++)
            { 
                totalcard.add(ucard[count]);
                totalplayercards.add(ucard[count]);
            }
            
            for(int count = 0; count < syscard.length; count++)
            {
                totalcard.add(syscard[count]);
                totalplayercards.add(syscard[count]);
            }
     char ucardsuite[] = new char[2];
     {
         cardsuite(ucardsuite);
            
     }
      for(int count = 0; count < ucardsuite.length; count++)
            { 
                totalcardsuite.add(ucardsuite[count]);
                totalplayercardsuite.add(ucardsuite[count]);
            }
     
            
     char syscardsuite[] = new char[2];
     {
         cardsuite(syscardsuite);
        
     }
      for(int count = 0; count < syscardsuite.length; count++)
            { 
                totalcardsuite.add(syscardsuite[count]);
                totalplayercardsuite.add(syscardsuite[count]);
            }
            
     ArrayList<Character>temptotalcard = totalcard ;
     totalcardarraytolistconverter(totalcard,totalcardsuite);    
     totalcardsuitearraytolistconverter(temptotalcard,totalcardsuite);
     syscard = cardupdater(totalcard,syscard);
     syscardsuite = cardsuiteupdater(totalcardsuite,syscardsuite);
     
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
     
     /*
     for(int count = 0; count < 2; count++) 
     {
         System.out.println("");
         
         System.out.println("Here are the computer's cards");
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
     */
     
     sysbet = ubet;
     ubet = preroundbet(ubet);     
     sysbet = systempreroundbet(sysbet);
     
     /*
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
             */
     char round1[] = new char[3];
     char round1suite[] = new char [3];
     cardno(round1);
     cardsuite(round1suite);
     for(int count = 0; count < round1.length; count++)
     {
         totalcard.add(round1[count]);
     }
     for(int count = 0; count < round1suite.length; count++)
     {
         totalcardsuite.add(round1suite[count]);
     }
     
     temptotalcard = totalcard;
     totalcardarraytolistconverter(totalcard,totalcardsuite);
     totalcardsuitearraytolistconverter(temptotalcard,totalcardsuite);
     cardupdater(totalcard,round1);
     cardsuiteupdater(totalcardsuite,round1suite);
     
     char round2[] = new char[1];
     char round2suite[] = new char [1];
     cardno(round2);
     cardsuite(round2suite);
     for(int count = 0; count < round2.length; count++)
     {
         totalcard.add(round2[count]);
     }
     for(int count = 0; count < round2suite.length; count++)
     {
         totalcardsuite.add(round2suite[count]);
     }
     
     temptotalcard = totalcard;
     totalcardarraytolistconverter(temptotalcard,totalcardsuite);
     totalcardsuitearraytolistconverter(temptotalcard,totalcardsuite);
     cardupdater(totalcard,round2);
     cardsuiteupdater(totalcardsuite,round2suite);
     char round3[] = new char[1];
     char round3suite[] = new char[1];
     cardno(round3);
     cardsuite(round3suite);
     for(int count = 0; count < round3.length; count++)
     {
         totalcard.add(round3[count]);
     }
     for(int count = 0; count < round3suite.length; count++)
     {
         totalcardsuite.add(round3suite[count]);
     }
     
     temptotalcard = totalcard;
     totalcardarraytolistconverter(totalcard,totalcardsuite);
     totalcardsuitearraytolistconverter(temptotalcard,totalcardsuite);
     cardupdater(totalcard,round3);
     cardsuiteupdater(totalcardsuite,round3suite); 
     boolean ender = false;
     int counter1 = 0;
     int counter = 0;
     int counter2 = 0; 
     int counter3 = 0;
     
     while(ender == false)
     {
     gamerwork();
     if(Poker.hasNextInt())
     {
         
         boolean ender6 = false;
         while(ender6 == false)
             {
             if(Poker.hasNextInt())
             {
          int inputter = Poker.nextInt(); //takes scanner input
          boolean ender1 = false;
          
          
              if(counter > 0)
              {
                 System.out.println("");
                  System.out.println("counter1");
                  gamerwork();
                  boolean checker123 = false;
                  while(checker123 == false)
                  {
                      if(Poker.hasNextInt())
                      {
                          inputter = Poker.nextInt();
                          checker123 = true;
                      }
                      else
                      {
                          System.out.println("Please enter a relevant function");
                          Poker.next();
                      }
                  }
              }
          if(inputter == 1)
             {
                
                   int round1int[] = new int[3];
             shower(round1int,round1,round1suite);
                
             gamerwork();
             
             while(ender1 == false)
             {
             if(Poker.hasNextInt())
             {
                inputter = Poker.nextInt(); //takes scanner input
                
                 boolean ender2 = false;  
          
              if(counter1 > 0)
              {
                  System.out.println("");
                  System.out.println("counter2");
                  gamerwork();
                  boolean checker123 = false;
                  while(checker123 == false)
                  {
                      if(Poker.hasNextInt())
                      {
                          inputter = Poker.nextInt();
                          checker123 = true;
                      }
                      else
                      {
                          System.out.println("Please enter a relevant function");
                          Poker.next();
                      }
                  }
                  
              }
          if(inputter == 1)
             {
                 
                int round2int[] = new int[1];
                     shower(round2int,round2,round2suite);
                 
                     gamerwork();
                     
                     boolean ender3 = false;
                      while(ender3 == false)
             {
             if(Poker.hasNextInt())
             {
           inputter = Poker.nextInt(); //takes scanner input
          
           
         
               if(counter2 > 0)
              {
                  System.out.println("");
                  System.out.println("counter3");
                  gamerwork();
                  boolean checker123 = false;
                  while(checker123 == false)
                  {
                      if(Poker.hasNextInt())
                      {
                          inputter = Poker.nextInt();
                          checker123 = true;
                      }
                      else
                      {
                          System.out.println("Please enter a relevant function");
                          Poker.next();
                      }
                  }
              }
               
          if(inputter == 1)
             {
                
                  int round3int[] = new int[1];
                             shower(round3int,round3,round3suite);
                 
                             
                                gamerwork();
                              boolean ender4 = false;
                      while(ender4 == false)
             {
             if(Poker.hasNextInt())
             {
                 inputter = Poker.nextInt(); //takes scanner input
          
          boolean carder1 = false;
          while(carder1 == false)
          {
           if(counter3 > 0)
              {
                  System.out.println("");
                  System.out.println("counter3");
                  gamerwork();
                  boolean checker123 = false;
                  while(checker123 == false)
                  {
                      if(Poker.hasNextInt())
                      {
                          inputter = Poker.nextInt();
                          checker123 = true;
                      }
                      else
                      {
                          System.out.println("Please enter a relevant function");
                          Poker.next();
                      }
                  }
              }
          
          
          if(inputter == 1)
             {
               decider( ucard, ucardsuite,  syscard, syscardsuite, round1, round1suite, round2, round2suite, round3, round3suite);   
               carder1 = true;
               System.out.println("Thank You for Playing");
               System.exit(0);
             }
          else if(inputter == 2)
          {
              System.out.println("Checker");
                             boolean checked = false;
                             
                                 int tempbet = ubet;
                                 ubet = userbetting(ubet);
                                 int ubetdown = tempbet - ubet;
                                 System.out.println("YOU BET... "+ubetdown);
                                 int bet = systembetting(sysbet,ubetdown,syscard,syscardsuite,totalcard,totalcardsuite,totalplayercards,totalplayercardsuite);
                                 System.out.println("The System bets " + bet);
                                 sysbet = sysbet - bet;
                                 while(checked == false)
                                 {
                                     if(bet > ubetdown || ubet != 0)
                                     {
                                        tempbet = ubet;
                                        ubet = userbetcontinue(ubet,bet,ubetdown);
                                        ubetdown = tempbet - ubet;
                                        System.out.println("You bet... "+ubetdown);
                                     }
                                     else
                                     {
                                         checked = true;
                                     }
                                     
                                 }
                             
                             
                           counter3++;
                          
                            if(bet == 0)
              {
                  System.out.println("The Computer has folded..hence you win!");
                  System.exit(0);
              }
          }
          
          else if(inputter == 3)
          {
              System.out.println("Thank You for Playing!");
              carder1 = true;
              ender = true;
          }
          }
          
        
                 
             
          
          ender4 = true;
          
          }
             else 
             {
                 System.out.println("Please enter a valid no.");
                 Poker.next();
             }
             
             }
             }
          else if(inputter == 2)
          {
              System.out.println("Checker");
                            boolean checked = false;
                                 int tempbet = ubet;
                                 ubet = userbetting(ubet);
                                 int ubetdown1 = tempbet - ubet;
                                 int ubetdown2 = 0;
                                 System.out.println("YOU BET... "+ubetdown1);
                                 int bet = systembetting(sysbet,ubetdown1,syscard,syscardsuite,totalcard,totalcardsuite,totalplayercards,totalplayercardsuite);
                                 System.out.println("The System bets " + bet);
                                 sysbet = sysbet - bet;
                                 while(checked == false)
                                 {
                                     if(bet > (ubetdown1+ubetdown2))
                                     {
                                        tempbet = ubet;
                                        ubet = userbetcontinue(ubet,bet,ubetdown1);
                                        ubetdown2 = tempbet - ubet;
                                        System.out.println("You bet... "+ubetdown2);
                                     }
                                     else if((ubetdown1+ubetdown2) >= bet || (ubetdown1+ubetdown2) == 0)
                                     {
                                         checked = true;
                                     }
                                     
                                 }
                             
                             
               counter2++; 
               
               
                if(bet == 0)
              {
                  System.out.println("The Computer has folded..hence you win!");
                  
                  System.exit(0);
              }
          }
          
          else if(inputter == 3)
          {
              System.out.println("Thank You for Playing!");
              System.exit(0);
          }
          
          
        
                 
             
          
          ender3 = true;
          
          
          
          }
             else 
             {
                 System.out.println("Please enter a valid no.");
                 Poker.next();
             }
             
             
             
             }
                      //break
                      
                     
                             
                             
                                                 
       
             }
             
          else if(inputter == 2)
          {
              
              System.out.println("Checker");
                             boolean checked = false;
                             
                                 int tempbet = ubet;
                                 ubet = userbetting(ubet);
                                 int ubetdown1 = tempbet - ubet;
                                 int ubetdown2 = 0;
                                 System.out.println("YOU BET... "+ubetdown1);
                                 int bet = systembetting(sysbet,ubetdown1,syscard,syscardsuite,totalcard,totalcardsuite,totalplayercards,totalplayercardsuite);
                                 System.out.println("The System bets " + bet);
                                 sysbet = sysbet - bet;
                                 while(checked == false)
                                 {
                                     if(bet > (ubetdown1+ubetdown2) && ubet != 0 )
                                     {
                                        tempbet = ubet;
                                        ubet = userbetcontinue(ubet,bet,ubetdown1);
                                        ubetdown2 = tempbet - ubet;
                                        System.out.println("You bet... "+ubetdown2);
                                     }
                                     else if((ubetdown1+ubetdown2) >= bet || ubet == 0)
                                     {
                                         checked = true;
                                     }
                                     
                                 }
                                 
                                  if(bet == 0)
                                 {
                                    System.out.println("The Computer has folded..hence you win!");
                                    System.exit(0);
                                 }
                             
                             
               counter1++;   
               
              
          }
          
          else if(inputter == 3)
          {
              System.out.println("Thank You for Playing!");
              System.exit(0);
          }
          
          
        
                 
             
          
          ender1 = true;
          
          }
             else 
             {
                 System.out.println("Please enter a valid no.");
                 Poker.next();
             }
             }
             }
          
          //inputter == 2
          else if(inputter == 2)
          {
              
              System.out.println("Checker");
                             
                             
                                 int tempbet = ubet;
                                 ubet = userbetting(ubet);
                                 int ubetdown1 = tempbet - ubet;
                                 System.out.println("YOU BET... "+ubetdown1);
                                 int ubetdown2 = 0;
                                 int bet = systembetting(sysbet,ubetdown1,syscard,syscardsuite,totalcard,totalcardsuite,totalplayercards,totalplayercardsuite);
                                 System.out.println("The System bets " + bet);
                                 sysbet = sysbet - bet;
                                 boolean checked2 = false;
                                 while(checked2 == false)
                                 {
                                     System.out.println(bet);
                                     if(bet > (ubetdown1+ubetdown2) && (ubetdown1+ubetdown2) != 0)
                                     {
                                        tempbet = ubet;
                                        ubet = userbetcontinue(ubet,bet,ubetdown1);
                                        ubetdown2 = tempbet - ubet;
                                        System.out.println("You bet... "+ubetdown2);
                                     }
                                     else if((ubetdown1+ubetdown2) >= bet || (ubetdown2) == 0)
                                     {
                                         checked2 = true;
                                     }
                                     
                                 
                             }
                     
              counter++;          
              if(bet == 0)
              {
                  System.out.println("The Computer has folded..hence you win!");
                  System.exit(0);
              }
          }
          
          else if(inputter == 3)
          {
              System.out.println("Thank You for Playing!");
              
              System.exit(0);
          }
          
          
        
               
             
          
          ender6 = true;
          
          }
             else 
             {
                 System.out.println("Please enter a valid no.");
                 Poker.next();
             }
             }
         
         //break
         
         
         
         
         
             
             //break
             
               
     }
     else 
     {
         System.out.println("Please enter the nos. asked for.");
         Poker.next();
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
        System.out.println("2.Raise");
        System.out.println("3.Fold");
    }
    
    public static void shower(int ucard1[], char rancard[], char rancardsuite[])
    {
      
     for(int count = 0; count < ucard1.length; count++)
     {
         ucard1[count] = 0 + rancard[count];
     }
        
     for(int count = 0; count < ucard1.length; count++) // the user sees his/her cards
     {
         System.out.println("");
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
      int decision2 = 0,decision3 = 0,decision4=0,decision5=0,decision6=0,decision7=0,decision8=0,decision9=0;
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
                               decision9 = onepair(ucard,syscard,round1,round2,round3);
                                       if(decision9 == 1)
                                           System.out.println("CONGRATULATIONS! YOU WIN BY ONE PAIR");
                                       else if(decision9 == 2)
                                           System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A ONE PAIR");
                                       else if(decision9 == 3)
                                           System.out.println("IT'S A TIE");
                                       else if(decision9 == 0)
                                       {
                               
                              decision8 = highcard(ucard,syscard);
                              if(decision8 == 1)
                                  System.out.println("CONGRATULATIONS! YOU WIN BY A HIGHCARD");
                              else if(decision8 == 2)
                                  System.out.println("SORRY! YOU LOSE TO THE COMPUTER, WHO WON WITH A HIGHCARD");
                              else if(decision8 == 3)
                                  System.out.println("IT'S A TIE! HIGHCARD");
                                       }
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
                    counter++;
                }
            }
            
            if (counter >= 3)
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
            
          
            
            if (counter >= 3)
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
            
            if(checker4 == false)
                decision = 2;
            else if(checker4 == true)
                decision = 0;
        }
        else if(checker1 == true && checker3 == true)
        {
            
            decision = 0;
        }   
            
                                   
        
        
        return decision;
                
    }  
    
    public static int fourofakind(char ucard[], char ucardsuite[], char syscard[], char syscardsuite[], char round1[], char round1suite[], char round2[], char round2suite[], char round3[], char round3suite[])
    {
        
        int decision = 0;
        char dealer[] = new char [round1.length+round2.length+round3.length];
        
        boolean checker1 = false,checker2 = false;
        for (int count = 0; count < round1.length; count++)
        {
            dealer[count]  = round1[count];
        }
        
        
        
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
        
        
        if(checker1 == true && checker2 == true)
        {
            
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
       dealersuite[4] = round3suite[0];
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
        int counter3 = 0;
        for(int count = 1; count < total1.length; count++)
        {
            if(total1[count] != total1[count-1] + 1)
            {
                counter3++; 
            }
        }
        
        if(counter3 >= 2)
            checker1 = true;//this would mean that the straight is not possible
        
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
        int counter4 = 0;
        for(int count = 1; count < total2.length; count++)
        {
            if(total2[count] != total2[count-1] + 1)
            {
                counter4++; 
            }
        }
        
        if(counter4 >= 2)
            checker2 = true;//this would mean that the numbers are not in sequence and therefore disqualify it from being a straight
        
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
        /*for(int count = 1; count < total1.length; count++)
        {
            if(total1[count-1] == total1[count])
            {
                counter2++;
                ucatch = total1[count];
            }
        }
        */
        
        for(int count = 0; count < ucard.length; count++)
        {
            for(int count2 = ucard.length; count2 < total1.length; count2++)
            {
                if(ucard[count] == total1[count2])
                {
                    counter2++;
                    ucatch = ucard[count];
                }
                
            }
            
            if(counter2 == 2)
            {
            checker1 = true;
            }
            
            counter2 = 0;
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
        for(int count = 0; count < syscard.length; count++)
        {
            for(int count2 = syscard.length; count2 < total2.length; count2++)
            {
                if(syscard[count] == total2[count2])
                {
                    counter4++;
                    syscatch = syscard[count];
                }
                
            }
            
            if(counter4 == 2)
            {
            checker1 = true;
            }
            
            counter4 = 0;
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
        else if(checker1 == false && checker2 == false)
            decision = 0;
            
            
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
        
        for(int count = 0; count < round1.length; count++)
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
       
        for(int count = 0; count < total1.length; count++)
        {
            for(int counter = 0; counter<total1.length; counter++)
            {
                if(counter != count)
                {
                if(total1[count] == total1[counter])
                {
                    counter2++;
                }
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
        int counter4 = 0, counter5 = 0; 
        for(int count = 0; count < syscard.length; count++)
        {
            total2[count] = syscard[count];
        }
        for(int count = syscard.length; count < total2.length; count++)
        {
            total2[count] = dealer[counter4];
            counter4++;
        }
        
        for(int count = 0; count < syscard.length; count++)
        {
            for(int counter = syscard.length; counter<total1.length; counter++)
            {
                if(syscard[count] == total1[counter])
                {
                    counter5++;
                }
            }
            if(counter5 == 1)
            {
                
                    syscard1 = total1[count];
                    checker2 = true;
                
                
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
    
    public static char[][] rules(ArrayList<Character>rancard, ArrayList<Character>rancardsuite) // this is done to ensure that no card (card value+card suite) is repeated.. 
    {
        char rancard1[] = new char[rancard.size()];
        for(int count = 0; count < rancard1.length; count++)
        {
            rancard1[count] = rancard.get(count);
        }
        
         
        
        char rancardsuite1[] = new char[rancardsuite.size()];
        for(int count = 0; count < rancardsuite1.length; count++)
        {
            rancardsuite1[count] = rancardsuite.get(count);
        }
        boolean ender = false;
        int counter = 0;
        
        while(ender == false)
        
        {    
        for(int count1=0; count1 < rancard1.length; count1++)
        {
            for(int count2 = 0; count2 < rancard1.length;count2++)
                if(count2 != count1)
                {
                   if (rancard1[count1] == rancard1[count2])
                   {
                       
                               
                                if(rancardsuite1[count1] == rancardsuite1[count2])
                                {
                                    
                                  rancard1[count2] = uniquecardno(rancard1[count2]);
                                  rancardsuite1[count2] = uniquecardsuite(rancardsuite1[count2]);
                                  counter++;
                                }
                               
                            
                       
                   }
                }
        }
        
        
        if(counter == 0)
            ender = true;
        
        counter = 0;
        
        System.out.println("WORKING1");
        
        }
        
         
        
        char totalrancard[][] = {rancard1,rancardsuite1};
        
        System.out.println("WORKING2");
        
        return totalrancard;
       
        

        
    }
    
    public static char uniquecardno(char rancard)  //this method serves to generate the random card nos. for both players
    {
        int min = 1, max = 14;
        int range = (max - min) +1;
        rancard = (char) ((char)(Math.random()*range)+min);
            
        
       
        return rancard;
    }
         
    public static char uniquecardsuite(char rancard)
    {
        int min = 1, max = 4;
        int range = (max - min)+1;
        rancard = (char) ((char)(Math.random()*range)+min);
        
        
        
        return rancard;
    }
    
    public static ArrayList<Character> totalcardarraytolistconverter(ArrayList<Character>totalcard,ArrayList<Character>totalcardsuite) //this is created to return the card values back to the totalcard
    {
         
        char twodarraystorer[][] = rules(totalcard,totalcardsuite);
         
        char temptotalcard[] = twodarraystorer[0];
        
        totalcard.clear();
        for(int count = 0; count < temptotalcard.length; count++)
            totalcard.add(temptotalcard[count]);
        
        
        
        return totalcard;
        
    }
    
    public static ArrayList<Character> totalcardsuitearraytolistconverter(ArrayList<Character>totalcard,ArrayList<Character>totalcardsuite)
    {
        
        char twodarraystorer[][] = rules(totalcard,totalcardsuite);
        char temptotalcardsuite[] = twodarraystorer[1];
        
        totalcardsuite.clear();
        for(int count = 0; count < temptotalcardsuite.length; count++)
            totalcardsuite.add(temptotalcardsuite[count]);
        
        
        return totalcardsuite;
        
    }
    
    public static char[] cardupdater(ArrayList<Character>totalcard, char[] rancard)
    {
        int counter = totalcard.size()-rancard.length;
        for(int count = 0 ; count < rancard.length; count++)
        {
            rancard[count] = totalcard.get(counter);
            counter++;
        }
        
        return rancard;
    }
  
    
    public static char[] cardsuiteupdater(ArrayList<Character>totalcardsuite, char[] rancardsuite)
    {
        int counter = rancardsuite.length;
        for(int count = 0; count < rancardsuite.length; count++)
        {
            rancardsuite[count] = totalcardsuite.get(counter);
            counter++;
        }
        
        return rancardsuite;
    }
   
    public static int initialbetting(int ubet)
    {
        Scanner Bet = new Scanner(System.in);
        System.out.println("");
        System.out.println("How much would you like to begin with ?");
        boolean checker = false;
        
        while(checker == false)
        {
            if(Bet.hasNextInt())
            {
                ubet = Bet.nextInt();
                checker = true;
            }
            else
            {
                System.out.println("Please enter an numerical value for the total amount of money you wish to bet");
                Bet.next();
            }
            
        }
        
        return ubet;
    }
    
    public static int preroundbet(int ubet)
    {
        int minbet = (15*ubet)/100;
        
        Scanner Bet = new Scanner(System.in);
        boolean checker = false;
        
        System.out.println("The minimum bet to enter this round is " +minbet);
        
        while(checker == false)
        {
            if(Bet.hasNextInt())
            {
                int tempbet = Bet.nextInt();
                if(tempbet >= minbet && tempbet <= ubet)
                {
                    ubet = ubet - tempbet;
                    checker = true;
                }
                else
                { 
                    System.out.println("Please enter a valid bet");
                    Bet.next();
                }
            }
            else
                System.out.println("Please enter an numerical value for the total amount of money you wish to bet ");
        }
        
        
        
        return ubet;
    }
    
    public static int systempreroundbet(int sysbet)
    {
        int minbet = (15*sysbet)/100;
        System.out.println("The system bets " +minbet);
        
        sysbet = sysbet - minbet;
        
        return sysbet;
        
    }
    
    public static int userbetting(int ubet)
    {
        Scanner Bet = new Scanner(System.in);
        boolean checker2 = false;
        
        
        
        while(checker2 == false)
        {
            System.out.println("How much would you like to bet?");
            if(Bet.hasNextInt())
            {
                boolean checker1 = false;
                int ubet2 = Bet.nextInt();
                while(checker1 == false)
                {
                if(ubet2 > 0 && ubet2 <=ubet)
                {
                    ubet = ubet - ubet2;
                    checker1 = true;
                }
                else
                {  
                    
                    System.out.println("Please bet a valid amount");
                    ubet = Bet.nextInt();
                }
                
                
                }
                
                    checker2 = true;
            }
            else
            {
                System.out.println("Please enter an numerical value for the total amount of money you wish to bet ");
                Bet.next();
            }
        }
        
        
        return ubet;
    }
    
    public static int systembetting(int sysbet, int ubet, char syscard[],char syscardsuite[] ,ArrayList<Character>totalcard,ArrayList<Character>totalcardsuite,ArrayList<Character>totalplayercards, ArrayList<Character>totalplayercardsuite ) //ubet in this case is the bet the user has just made and not the money the user has with him
    {
        //inherent assumption that ubet > 0 because the systembetting only called when user chooses to raise
        int decider = 0;
        int systembet = 0; 
        int bet = 0;
        
            decider = systemstraightflush(totalcard,totalcardsuite,syscard,syscardsuite,totalplayercards, totalplayercardsuite);
            if(decider == 0)
            {
                decider = systemfourofakind(totalcard);
                if(decider == 0)
                {
                    decider = systemfullhouse(totalcard);
                    if(decider == 0)
                    {
                        decider = systemflush(totalcardsuite);
                        if(decider == 0)
                        {
                            decider = systemstraight(totalcard);
                            if(decider == 0)
                            {
                                decider = systemthreeofakind(totalcard);
                                if(decider == 0)
                                {
                                    decider = systemtwopair(syscard,totalcard);
                                    if(decider == 0)
                                    {
                                        decider = systemonepair(syscard,syscardsuite,totalcard,totalcardsuite);
                                        if(decider == 0)
                                        {
                                            decider = systemhighcard(syscard);
                                            if(decider == 0)
                                            {
                                                systembet = 0;
                                            }
                                            else 
                                            {
                                                systembet = 1;
                                            }
                                        }
                                        else 
                                            {
                                                systembet = 1;
                                            }
                                    }
                                    else 
                                            {
                                                systembet = 1;
                                            }
                                }
                                else 
                                            {
                                                systembet = 1;
                                            }
                            }
                            else 
                                            {
                                                systembet = 1;
                                            }
                        }
                        else 
                                            {
                                                systembet = 1;
                                            }
                    }
                    else 
                                            {
                                                systembet = 1;
                                            }
                }
                else 
                                            {
                                                systembet = 1;
                                            }
            }
            else 
                                            {
                                                systembet = 1;
                                            }
           
            if(ubet <= (0.15*sysbet)) //if this is true then the computer will either raise or call, it will not fold
        {
            if(systembet == 0)
                 bet = ubet;
            else if(systembet == 1)
            {
                int min2 = ubet, max2 = sysbet;
                     int range2 = (max2 - min2) +1;
                     bet = (int) ((int)(Math.random()*range2)+min2);
            }
             
        }
        
        int decider2 = 0, decider3 = 0;
        
         if(systembet == 0)
             {
                 int min = 1, max = 2; // min = fold, max = check
                 int range = (max - min) +1;
                   decider2 = (int) ((int)(Math.random()*range)+min);
                   if(decider2 == 1)
                   {
                       System.out.println("The computer folds");
                       System.exit(0); //computer folds.
                   }
                   
                   else if(decider2 == 2)
                   {
                       bet = ubet;
                   }
             }
         else if(systembet == 1)
         {
              int min = 1, max = 2; // min = check, max = raise
                 int range = (max - min) +1;
                 decider3 = (int) ((int)(Math.random()*range)+min);
                 if(decider3 == 1)
                 {
                     bet = ubet;
                 }
                 else if(decider3 == 2)
                 {
                     int min2 = ubet, max2 = sysbet;
                     int range2 = (max2 - min2) +1;
                     bet = (int) ((int)(Math.random()*range2)+min2);
                     
                 }

         }
         
         
         
        return bet;
        
        
    }
    
    public static int systemhighcard(char syscard[])
    {
        boolean checker = false;
        int decision = 0;
        for(int count = 0; count < syscard.length; count++ )
        {
            if(syscard[count] >= 10)
            {
                checker = true;
            }
            
            if(checker == true)
                decision = 1;
        }
        
        return decision;
    }
    
    public static int systemonepair(char syscard[], char syscardsuite[],ArrayList<Character>totalcard,ArrayList<Character>totalcardsuite)
    {
        int decision = 0;
        boolean checker1 = false;
        if(totalcard.size() == 4 && totalcardsuite.size() == 4)
        {
            if(syscardsuite[0] == syscardsuite[1])
            {
                if(syscard[0] == syscard[1])
                {
                    decision = 1;
                }
            }
        }
        
        else if(totalcard.size() > 4 && totalcardsuite.size() > 4)
        {
            for(int count1 = 0; count1 < syscardsuite.length; count1++)
            {
                for(int count2 = 4; count2 <totalcardsuite.size(); count2++)
                {
                    if(syscardsuite[count1] == totalcardsuite.get(count2))
                    {
                        if(syscard[count1] == totalcard.get(count2))
                        {
                            decision = 1;
                        }
                    }
                }
                
            }
        }
        
        return decision;
    }
    
    public static int systemtwopair(char syscard[], ArrayList<Character>totalcard)
    {
        int decision = 0,counter = 0;       
        
        for(int count1 = 0; count1 < syscard.length; count1++)
        {
            for(int count2 = 4; count2 < totalcard.size(); count2++)
            {
                
                    if(syscard[count1] == totalcard.get(count2))
                    {
                        counter++;
                    }
                
            }
        }
        
        if(counter == 2)
            decision = 1;
        
        return decision;
    }
    
    public static int systemthreeofakind(ArrayList<Character>totalcard)
    {
        int decision = 0, counter = 0; 
        
        for(int count = 2; count < totalcard.size(); count++)
        {
            for(int count2 = 4; count2 < totalcard.size(); count2++)
            {
                if(totalcard.get(count) == totalcard.get(count2))
                {
                    counter++;
                }
                
            }
            
            if(counter == 2)
            {
            decision = 1;
            }
            
            counter = 0;
        }
        
        return decision;
        
    }
    
    public static int systemstraight(ArrayList<Character>totalcard)
    {
        int decision = 0, counter = 0;
        char temparray[] = new char[totalcard.size()];
        for(int count = 0; count < temparray.length; count++)
        {
            temparray[count] = totalcard.get(count);
        }
        for(int count = 3; count < temparray.length; count++)
        {
            if(temparray[count-1] > temparray[count])
            {
                char swapper = temparray[count-1];
                temparray[count-1] = temparray[count];
                temparray[count] = swapper;               
            }          
        }
        
        for(int count = 3; count < temparray.length; count++)
        {
            if(temparray[count] != temparray[count-1] + 1)
            {
                counter++;
            }
        }
        
        if(counter < 2)
            decision = 1;
        
        return decision;
    }
    
    public static int systemflush(ArrayList<Character>totalcardsuite)
    {
        int decision = 0, counter = 0; 
        char temparray[] = new char[totalcardsuite.size()];
        for(int count = 0; count < temparray.length; count++)
        {
            temparray[count] = totalcardsuite.get(count);
        }
        for(int count = 3; count < temparray.length; count++)
        {
            if(temparray[count-1] > temparray[count])
            {
                char swapper = temparray[count-1];
                temparray[count-1] = temparray[count];
                temparray[count] = swapper;               
            }          
        }
        
        for(int count = 3; count < temparray.length; count++)
        {
            if(temparray[count-1] != temparray[count])
                counter++;
        }
        
        if(counter < 2)
            decision = 1;
        
        return decision;
        
        
    }
    
    public static int systemfullhouse(ArrayList<Character>totalcard)
    {
        int counter1 = 0, decision = 0;
        
        boolean checker1 = false, checker2 = false;
         for(int count = 2; count < 4; count++ )
            {
                for(int count2 = 4; count2 < totalcard.size(); count2++)
                {
                    if(totalcard.get(count) == totalcard.get(count2))
                    {
                        counter1++;
                    }
                }
                // we must compensate for the fact that total1 will include ucard[count] as well..
                if(counter1 == 2) 
                {
                    checker1 = true;
                }
                
                if(counter1 == 3)
                {
                    checker2 = true;
                }
                counter1 = 0;
            } 
         
         if(checker1 == true && checker2 == true)
             decision = 1;
         
         return decision;
        
    }
    
    public static int systemfourofakind(ArrayList<Character>totalcard)
    {
        int decision = 0, counter3 = 0;
        boolean checker1 = false;
        for(int count = 2; count < 4; count++)
        {
            for(int counter2 = 0; counter2 < totalcard.size(); counter2++)
            {
            if(totalcard.get(count) == totalcard.get(counter2))
            {
                counter3++;
            }
            }
            if(counter3 >= 4)
            {
                
                checker1 = true;
            }
            counter3 = 0;
        }
        
        if(checker1 == true)
            decision = 1;
        
        return decision;
    }
    
    
    public static int systemstraightflush(ArrayList<Character>totalcard, ArrayList<Character>totalcardsuite, char rancard[], char rancardsuite[], ArrayList<Character>totalplayercards,ArrayList<Character>totalplayercardsuite)
    {
        int decision = 0, counter1 = 0, counter2 = 0; 
        boolean checker1 = false, checker2 = false, checker3 = false;
        
        ArrayList<Character>tempnumcatch = new<Character>ArrayList();
        for(int count = 1; count < rancardsuite.length; count++)
        {
            if(rancardsuite[count-1] != rancardsuite[count])
                checker1 = true;
        }
        
        if(checker1 == false)
        {
            for(int count = totalplayercardsuite.size(); count < totalcardsuite.size(); count++)
            {
                if(rancardsuite[0] == totalcardsuite.get(count))
                {
                    tempnumcatch.add(totalcard.get(count));
                    counter1++;
                }
            }
            
            if(counter1 >= 3)
            {
                for(int count = 0; count < rancard.length; count++)
                {
                    tempnumcatch.add(rancard[count]);
                }
                
                Collections.sort(tempnumcatch); // sorts in ascending order 
                
                for(int count = 1; count < tempnumcatch.size(); count++)
                {
                    if(tempnumcatch.get(count) != tempnumcatch.get(count-1) + 1)
                    {
                        counter2++;
                    }
                }
                
                if(counter2 <= 2)
                    checker2 = true;
                
                
            }
            
            
        }
        
        if(checker2 == true)
                decision = 1;
            
            return decision;
        
    }
    
   public static int userbetcontinue(int ubet, int bet, int ubetdown)
   {
       
       
       
       Scanner Bet = new Scanner(System.in);
       boolean checker1 = false,checker2 = false;
       
       
       System.out.println("Which of the following functions would you like to do:");
       System.out.println("1. Raise");
       System.out.println("2. Fold");
       while(checker1 == false)
       {
           if(Bet.hasNextInt())
           {
               int decision1 = Bet.nextInt();
               if(decision1 == 1)
               {
                   int tempubet = ubet;
                   System.out.println("You have... "+tempubet);
                   
                   while(checker2 == false)
                   {
                       System.out.println("Please input a number equal to or greater than "+(bet-ubetdown));
                       ubet = userbetting(ubet);
                       System.out.println(ubet);
                      
                       if((tempubet-ubet) >= (bet-ubetdown) || (tempubet-ubet) == 0)
                       {
                           
                           checker2 = true;
                       }
                       else
                       {
                           System.out.println("Please enter a valid bet");
                           Bet.next();
                       }
                   }
                   
                   
               }
               else
               {
                   System.out.println("Thank You for playing");
                   System.exit(0);
               }
               checker1 = true;
           }
           else
           {
               System.out.println("Please enter the a function number.");
               Bet.next();
               
              
           }
       }
         
       
       return ubet;
   }
   
   
   
   
}
