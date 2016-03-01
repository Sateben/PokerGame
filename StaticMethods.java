/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package term_1;

/**
 *
 * @author krrishdholakia
 */
public class StaticMethods {
    
    static int y = 8;
    
    public static void main(String[] args) {
     
        StaticMethods a = new StaticMethods();
        
        a.y = 9;
        
        y = 10;
        
        StaticMethods b = new StaticMethods();
        
        b.y = 123;
        
        System.out.println(a.y);
        
    }
    
}
