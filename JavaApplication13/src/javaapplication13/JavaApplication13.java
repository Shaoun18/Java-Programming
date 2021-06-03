/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author Shaoun
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        item ob  = new item("CSE06607756","Program", 6, 21.52);
        
        System.out.println(ob.getid());
        System.out.println(ob.getdesc());
        System.out.println(ob.getqty());
        System.out.println(ob.getunitprice());
        ob.setunitprice(1.0);
        System.out.println(ob.gettotal());
        System.out.println(ob.tostring());
    }
    
}
