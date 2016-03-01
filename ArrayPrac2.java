/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class ArrayPrac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Friends = new Scanner(System.in);
        Scanner FriendNumber = new Scanner(System.in);
        System.out.println("Hello, please enter the size of your friend's list");
        int friendlist = Friends.nextInt();

        String friendarray[] = new String[friendlist];
        int friendage[] = new int[friendlist];
        for (int friendloop = 0; friendloop < friendarray.length; friendloop++) {
            System.out.println("Please enter your friend's name:");
            friendarray[friendloop] = FriendNumber.nextLine();
            System.out.println("Please enter your friend's age:");
            friendage[friendloop] = Friends.nextInt();
        }
        int maxage = 0;
        for (int friendloop = 0; friendloop < friendarray.length; friendloop++) {
            
            if (maxage < friendage[friendloop]) {
                maxage = String.valueOf(friendage[friendloop]).length();
            }
            System.out.println(maxage);

        }
        String name = "Name";
        String age = "Age";
        int spaces = 150;
        for (int dashmaker = 0; dashmaker < (name.length() + maxage + spaces); dashmaker++) {
            System.out.print("_");
        }
        System.out.println("");
        System.out.print("|" + name);
        for (int friendloop = 0; friendloop < spaces; friendloop++) {
            System.out.print(" ");
        }
        System.out.print(age);
        System.out.print("");
        for (int friendloop = 0; friendloop < friendlist; friendloop++) {
            System.out.println("|");
            System.out.print(friendarray[friendloop]);
            int space2 = friendarray[friendloop].length() - 4;
            int differ = spaces - space2;
            for (int timer = 0; timer < differ; timer++) {
                System.out.print(" ");
            }
            System.out.print(friendage[friendloop]);

        }
    }

}
