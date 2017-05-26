/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackqueuetest;

import java.util.Stack;

/**
 *
 * @author hyunyoungpark
 */
public class StackQueueTest {

    public static void stackDemo(Stack<Integer> X) {
        
        int stackDemo = X.pop();
        
        while (!X.isEmpty()) {
            int next = X.pop();
            stackDemo = Math.max(stackDemo, next);
        }
        X.push(new Integer(4));
        X.push(new Integer(3));
        Integer Y = X.pop();
        X.push(new Integer(7));
        X.push(new Integer(2));
        X.push(new Integer(5));
        X.push(new Integer(9));
        Integer Y = X.pop();
        X.push(new Integer(3));
        X.push(new Integer(9));
        
    }
    
}
