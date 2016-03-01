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
public class Measurements {
    
    int length,breadth,height;
    
    
    
    public Measurements(int templength, int tempbreadth,int tempheight)
    {
        length = templength;
        breadth = tempbreadth;
        height = tempheight;
    }
    
    public void area ()
    {
        int totalarea = length*breadth;
        
        System.out.println("The area is " + totalarea);
    }
    
    public void volume ()
    {
        int totalvolume = length*breadth*height;
        
        System.out.println("The volume is " + totalvolume);
    }
    

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
