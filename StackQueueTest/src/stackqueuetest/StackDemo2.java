/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueuetest;

/**
 *
 * @author hyunyoungpark
 */

import java.util.*;
public class StackDemo2 {
    
    static void showpush(Stack st, int a) {
        st.push(new Integer(a));
        System.out.println("Push(" + a + ")");
        System.out.println("Stcak: " + st);
    }
    
    static void showpop(Stack st) {
        System.out.print("pop - > ");
        Integer a = (Integer) st.pop();
        System.out.println(a);
        System.out.println("Stack: " + st);
    }
    
    public static void main (String args[]) {
        Stack st = new Stack();
    }
}
