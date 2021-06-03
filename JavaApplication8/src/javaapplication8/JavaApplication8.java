// Q : fid the output of x = 101

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Shaoun
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 101;
        
        int d,y =0,t=1;
        while (x > 0){
        d = x % 10;
        if (d % 2 == 0)
        {
        y = y + t*d;
        t = t * 10;
        }
         x = x/10;
        }
        System.out.println("Number after = " + y);
        }
        
    }
