/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceclass;
import java.util.Scanner;
/**
 *
 * @author Shaoun
 */

interface AdvancedArithmetic {
    int divisorSum(int s);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisorSum(int s) {
        int sum = 0;
        for (int j = 1; j <= s; j++) {
            if (s % j == 0)
                sum += j;
        }
        return sum;
    }
}
public class Interfaceclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner k = new Scanner(System.in);
        int u = k.nextInt();
        AdvancedArithmetic MyCalculator = new MyCalculator();
        int sum = MyCalculator.divisorSum(u);
        System.out.println("Sum: " + sum);
    }
    
}
