// Q : AN  implements of intstack that uses fixed storage 

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;

/**
 *
 * @author Shaoun
 */
public class Interface2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Intstack mystack;
        DynStack ds = new DynStack(5);
        DynStack fs = new DynStack(8);
        
        mystack = ds;
        for(int i = 0; i < 12; i++)
            mystack.push(i);
        
        mystack = fs;
        for(int i = 0; i < 8; i++)
            mystack.push(i);
        
        mystack = ds;
        System.out.println("Values in dynamic search");
        for(int i = 0; i < 12; i++)
            System.out.println(mystack.pop());
        
        mystack = fs;
        System.out.println("Values in fixed stack");
        for(int i = 0; i < 8; i++)
            System.out.println(mystack.pop());       
        
    }
    
}
