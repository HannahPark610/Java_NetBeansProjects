/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testMusicBox;

public class CDApplication {

    public static void main(String[] args) {
    CDcollections music = new CDcollections();
    music.addCD("Storm Front",14.95,10);
    music.addCD("Come On Over",14.95,16);
    music.addCD("Sound Track",17.95,33);
    music.addCD("GraceLand",13.5,11);
    
    System.out.println(music.toString());
    
     music.addCD("Sound Track 2",20.5,10);
    music.addCD("GraceLand 2 ",13.5,15);
    
    System.out.println(music.toString());
    }
    
}

