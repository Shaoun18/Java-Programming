/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractclass;
import java.util.Scanner;
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
         Scanner sd = new Scanner(System.in);
        String title = sd.nextLine();
        booktest k = new booktest();
        k.setTitle(title);
        String w = k.getTitle();
        System.out.println("Title is: " + w);
    }
    
}
