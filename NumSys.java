/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

import java.io.*;
import java.util.*;

public class NumSys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Calc = new Scanner (System.in);
        intro();
        if(Calc.hasNextInt())
        {
            
        }
        
    }
    
    public static void intro()
    {
        System.out.println("Which of the following functions do you wish to opt for:");
        System.out.println("1. Binary to Denary");
        System.out.println("2. Denary to Hexadecimal");
        System.out.println("3. Hexadecimal to Binary");
    }
    
}
