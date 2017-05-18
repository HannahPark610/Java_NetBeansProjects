/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

/**
 *
 * @author CICCC-CIRAC
 */
public class CDdisplay {
    public static void main(String[] args) {
        
    CDplayer music = new CDplayer();
    
    music.addCD("Ariana grande","Bang Bang",14.99,1);
    music.addCD("Ariana grande","Breake Free",15.50,5);
    music.addCD("Ariana grande","Side to Side",15.00,6);
    music.addCD("Bruno Mars","That's What I Like",15.50,2);
    music.addCD("Bruno Mars","When I was Your Man",14.99,5);
    music.addCD("Bruno Mars","Treasure",15.50,8);
    music.addCD("Adele","Hello",15.75,7);
    music.addCD("Adele","Some One Like You",15.50,1);
    music.addCD("Adele","Rolling in the Deep",14.99,4);
    music.addCD("Cold Play","Fix You",15.00,7);
    music.addCD("Cold Play","The Sientist",15.50,2);
    music.addCD("Cold Play","Something Just Like This",14.99,3);
    
    System.out.println("Select Play Music : ");
    System.out.println(music.toString());
    
    music.addCD("Bruno Mars","That's What I Like",15.50,13);
    music.addCD("Cold Play","The Sientist",15.50,20);
    
    System.out.println("You : ");
    System.out.println(music.toString());
    }
    
}