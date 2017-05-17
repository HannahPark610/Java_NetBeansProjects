/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseDay5;

/**
 *
 * @author CICCC-CIRAC
 */
public class Pizza {
    
    String topping;
    private int diameter;
    private double price;
        
    public void settopping(String topping) {
        this.topping = topping;
    }
  
    public void setdiameter(int diameter) {
        this.diameter = diameter;
    }
    
    public void setprice(double price) {
        this.price = price;
    }

    public String getTopping() {
        return topping;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getPrice() {
        return price;
    }
    
    
}
