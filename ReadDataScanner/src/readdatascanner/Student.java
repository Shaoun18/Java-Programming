/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readdatascanner;

/**
 *
 * @author Shaoun
 */
public class Student {
    
   String name;
   int age;
   float percent;
   boolean isLocal;
   char grade;
   
   Student(String name, int age, float percent, boolean isLocal, char grade){
      this.name = name;
      this.age = age;
      this.percent = percent;
      this.isLocal = isLocal;
      this.grade = grade;
    
}
    public void displayDetails(){
      System.out.println("Details..............");
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      System.out.println("Percent: "+this.percent);
      if(this.isLocal) {
         System.out.println("Nationality: Indian");
      }else {
         System.out.println("Nationality: Foreigner");
      }
      System.out.println("Grade: "+this.grade);
   }
   
}
