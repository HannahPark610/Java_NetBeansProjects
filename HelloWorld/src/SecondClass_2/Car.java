/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondClass_2;

/**
 *
 * @author CICCC-CIRAC
 */
public class Car {
    public void m1() {
        System.out.println("Car1");
    }
    public void m2() {
        System.out.println("Car2");
    }
    public String toString() {
        return "vroom";
    }
}
public class Truck extends Car {
    public void m1() {
        System.out.println("Truck 1");
    }
}
