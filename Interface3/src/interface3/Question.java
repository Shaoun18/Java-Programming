/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface3;
import java.util.Random;

/**
 *
 * @author Shaoun
 */
public class Question implements SharedConstants{
    Random rand = new Random();
    
    int ask(){
        int prob  = (int) (100 * rand.nextDouble());
        
        if(prob < 30)
            return No;
        else if(prob < 60)
            return Yes;
        if(prob < 75)
            return Later;
        if(prob < 98)
            return Soon;
        else
            return Never; 
    
    }
}
