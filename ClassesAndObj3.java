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
public class ClassesAndObj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Player {
    int bet, react, decision;
    
    Player(int otherbet)
    {
        int min = 1, max = 25000;
        int range = (max - min) +1;
        
        bet = (int) ((int)(Math.random()*range)+min);
        
        react = otherbet;
        
    }
    
    public void decision()
    {
        
    }
}

