/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance.method.overriding;

/**
 *
 * @author Shaoun
 */
public class InheritanceMethodOverriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        B subob = new B(1,2,3);
        B r;
        r= subob;
        subob.show("this is k : ");
        subob.show();
    }
    
}