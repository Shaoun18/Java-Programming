// Q :  Using abstract methods and classes.

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract.pkgclass;

/**
 *
 * @author Shaoun
 */
public class AbstractClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        rectangle r = new rectangle (9,5);
        triangle t = new triangle (10,8);
        
        figure figuref;
        
        figuref = r;
        System.out.println("Area is : " +  figuref.area());
        figuref = t;
        System.out.println("Area is : " +  figuref.area());
        
        
    }
    
}
