// Q : Demostatic static variables,method, and blocks.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teststack;

/**
 *
 * @author Shaoun
 */
public class Teststack {

    /**
     * @param args the command line arguments
     */
    
    static int a =  3;
    static int b;
    
    static void meth (int x){
        System.out.println(" X  =  " + x);
        System.out.println(" A  =  " + a);
        System.out.println(" B  =  " + b);
    
    }
    
    static {
            System.out.println("Staic block initialixed");
            b = a * 5; 
    }
    public static void main(String[] args) {
        // TODO code application logic here

        meth(42);
    }
    
}
