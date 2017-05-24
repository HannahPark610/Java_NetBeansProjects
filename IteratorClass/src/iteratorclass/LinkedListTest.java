/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorclass;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hyunyoungpark
 */
public class LinkedListTest {
    public static void main(String[] args) {
        // Create a list of names
        ArrayList names = new ArrayList();
        
        //Add some names in list
        names.add("Hannah");
        names.add("Ann");
        names.add("Mia");
        
        //Method #1 : Iterate using for loop
        System.out.println("Name of the friends: ");
        Iterator itr = names.iterator();
        
        while(itr.hasNext()) {
            Object friendList = itr.next();
            System.out.print(friendList + "");
        }
        System.out.println();
    }
}
