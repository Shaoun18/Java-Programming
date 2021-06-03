/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code.test;

/**
 *
 * @author Shaoun
 */
public class CodeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int result = 0;
                        for (int i = 0; i < 5; i++) {
                          if (i == 3) { 
                             result += 10;
                           } else {
                             result += i;
                           }	
                        }
                        System.out.println(result);
    }
    
}
