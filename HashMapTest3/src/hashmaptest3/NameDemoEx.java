/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaptest3;

import java.util.*;
        
public class NameDemoEx {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("a","A");
        map.put("b","B");
        map.put("c","C");
        map.put("d","D");
//        Map<Integer,Name> m1 = new TreeMap<>();
//        Name n1 = new Name(1,"john","tom");
//        m1.put(1, n1);

        Set<String> keySet = map.keySet();
        for(String Name:keySet){
            System.out.println(Name + "=" + map.get(Name));
        }


    }
    
}
