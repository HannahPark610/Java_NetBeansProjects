/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SecondClass;

public class AutoMain {
    public static void main(String[] args) {
        bigfoot();
        
    }
        static void bigfoot(){    
	MonsterTruck bigfoot = new MonsterTruck();
	bigfoot.m1();                  // monster 1
	bigfoot.m2();                  // truck 1 / car 1
	System.out.println(bigfoot);   // monster vroomvroom
  }
}