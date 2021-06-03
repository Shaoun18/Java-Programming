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
public class item {
    private String id;
    private String desc;
    private int  qty;
    private double unitprice;
    
    public item(String i, String d,int  q,double n){
    
        this.id = i;
        this.desc = d;
        this.unitprice = n;
        this.qty = q;
    
    }
    
    public String getid(){
    
        return id;
    } 
    public String getdesc(){
    
        return desc;
    } 
    public int getqty(){
        
        return qty;
    } 
    public void setqty(int qty){
    
     this.qty = qty;
    } 
    public double getunitprice(){
        
        return unitprice;
    
    } 
    public void setunitprice(double unitprice){
    
         this.unitprice = unitprice;
    } 
    public double gettotal(){
        
        double totalprice;
        totalprice = unitprice*qty;
        return totalprice;
    
    } 
    String tostring(){
    
    return ("id" + " "+ id + ", desc" + " " +desc+ ", qty" + " "+ qty + ", unitprice"+ " "+unitprice); 
    } 
}
