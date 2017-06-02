/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetTestDomain;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hyunyoungpark
 */
public class DomainDemo {
    public static void main (String[] args) {
        Set<Domain> domain = new HashSet<>();
        Domain d1 = new Domain("dontgothere.com");
        Domain d2 = new Domain("ohno.org");
        Domain d3 = new Domain("badstuff.com");
        Domain d4 = new Domain("badstuff.org");
        Domain d5 = new Domain("badstuff.net");
        Domain d6 = new Domain("whatintheworld.com");
        Domain d7 = new Domain("notinthislifetime.irg");
        Domain d8 = new Domain("letsnot.com");
        Domain d9 = new Domain("eeewwwwww.com");
        domain.add(d1);
        domain.add(d2);
        domain.add(d3);
        domain.add(d4);
        domain.add(d5);
        domain.add(d6);
        domain.add(d7);
        domain.add(d8);
        domain.add(d9);
        
        for(Domain d:domain){
            System.out.println(d.name + " ");
        }
    }
}
