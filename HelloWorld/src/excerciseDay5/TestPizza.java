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
public class TestPizza {
    public static void main(String[] args) {
        Pizza p1;
        p1 = new Pizza();
        p1.topping = "test";
        p1.settopping("ham");
        String toppingName;
        toppingName = p1.getTopping();
        System.out.println("topping:" + toppingName);
        p1.setdiameter(10);
        int diameter;
        diameter = p1.getDiameter();
        System.out.println("diameter:" + diameter);
        p1.setprice (11.99);
        double price;
        price = p1.getPrice();
        System.out.println("price:" + price);
        
        
        Pizza p2;
        p2 = new Pizza();
        p2.settopping("pepperoni");
        String toppingName2;
        toppingName = p2.getTopping();
        System.out.println("topping:" + toppingName);
        p2.setdiameter(12);
        int diameter2;
        diameter = p2.getDiameter();
        System.out.println("diameter:" + diameter);
        p2.setprice (13.99);
        double price2;
        price = p2.getPrice();
        System.out.println("price:" + price);
    }
    
}
