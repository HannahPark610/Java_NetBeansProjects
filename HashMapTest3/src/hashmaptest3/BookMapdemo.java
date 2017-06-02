/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaptest3;

import java.util.*;

/**
 *
 * @author CICCC-CIRAC
 */
public class BookMapdemo {

    public static void main(String[] args) {
       
//      Map<Integer, String> m1 = new LinkedHashMap<>();
        Map<Integer, String> m1 = new TreeMap<>();
        m1.put(110,"ddd");
        m1.put(101,"aaa");
        m1.put(105,"ccc");
        m1.put(104,"bbb");
        m1.put(111,"eee");
        
        System.out.println("data is "+m1);
        
        System.out.println("deleted data is"+m1.remove(103));
        System.out.println("data is " + m1);
        System.out.println("value at 110 is " +m1.get(110));
    }
    
}
