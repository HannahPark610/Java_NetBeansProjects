/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorclass;

/**
 *
 * @author hyunyoungpark
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a list of names
        ArrayList names = new ArrayList();
        
        //Add some names in list
        names.add("Hannah");
        names.add("Ann");
        names.add("Mia");
        
        //Method #1 : Iterate using for loop
        System.out.println("Name of the friends: ");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
    
}
