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
public class BookMapClass {
    public static void main(String[] args) {
        Map<Integer,Book> m1 = new LinkedHashMap<>();
        Book b1 = new Book(101, "C programming","aaa",2);
        Book b2 = new Book(105, "Java programming","zzz",20);
        Book b3 = new Book(102, "C# programming","ppp",10);
        Book b4 = new Book(104, "HTML programming","bbb",5);
        m1.put(1, b1);
        m1.put(2, b2);
        m1.put(3,b3);
        m1.put(4,b4);
        
        for(Map.Entry<Integer,Book> entry : m1.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println("key  "+ key);
            System.out.println("id " + b.id + " title "+ b.title );
                    
        }
    }
}
