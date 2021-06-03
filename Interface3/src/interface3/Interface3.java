/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface3;

/**
 *
 * @author Shaoun
 */
public class Interface3 implements SharedConstants{

    /**
     * @param args the command line arguments
     */
    
    static void answer (int result){
    
        switch (result){
            case No : 
                System.out.println("No");
                break;
            case Yes : 
                System.out.println("Yes");
                break;
            case Maybe : 
                System.out.println("Maybe");
                break;
            case Later : 
                System.out.println("Later");
                break;
            case Soon : 
                System.out.println("Soon");
                break;
            case Never : 
                System.out.println("Never");
                break;   
        
        }
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Question q = new Question();
        
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
    
}
