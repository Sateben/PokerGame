/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;
import java.util.*;
import java.io.*;

public class TryCatch_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner TryCatch = new Scanner (System.in);
     int num;
     
     System.out.println("Please enter a number");
     try{
     num = TryCatch.nextInt();
    }catch(InputMismatchException ai)
    {
        System.out.println("Please enter a number");
        
    }
        
    
}

}