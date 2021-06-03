//Q :   Compute distance light travels using long variables

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author Shaoun
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int lightspeed;
        long days,seconds,distance;
        
        lightspeed = 186000;
        days  = 1000;
        seconds =  days * 24  * 60 * 60;
        distance = lightspeed * seconds;
        
        System.out.print("In " + days);
        System.out.print("days light will travel about ");
        System.out.println( distance + " miles ");
        
    }
    
}
