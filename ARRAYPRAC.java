/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class ARRAYPRAC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner Friends = new Scanner(System.in);
         Scanner FriendNumber = new Scanner(System.in);
         System.out.println("Hello, please enter the size of your friend's list");
         int friendlist = Friends.nextInt();
         
         String friendarray[] = new String[friendlist];
         
         for (int friendloop = 0; friendloop <friendarray.length; friendloop++)
         {
            System.out.println("Please enter your friend:");
            friendarray[friendloop] = FriendNumber.nextLine();
         }
         
         for (int friendloop = 0; friendloop < friendlist; friendloop++)
         {
             System.out.println("Your " + (friendloop + 1) + " friend is " +friendarray[friendloop]);
         }
         
    }
    }
    
