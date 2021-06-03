/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmaticexception;

/**
 *
 * @author Shaoun
 */
public class ArithmaticException {

    public void f(){
        try{
            g();
        }catch(Exception ex){
            System.out.println(ex);
            throw new NullPointerException();
        }
    }

    public void g(){
        int num1=40, num2=0;
        if(num2 == 0){
            throw new ArithmeticException("Operation Not Possible!");
        }
        else{
            int output=num1/num2;
            System.out.println ("Result: "+output); 
        }
    }
    public static void main(String[] args) {
       
        ArithmaticException ob = new ArithmaticException();
        try{
            ob.f();
        }catch(Exception ex){
            System.out.println(ex);
    }
    }   
}
