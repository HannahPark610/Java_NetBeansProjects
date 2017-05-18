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
public class CD {
    private String cdName;
    private String song;
    private double cost;
    private int tracks;
    
    
    public  CD(String singer, String sname, double price, int numoftracks){
        cdName = singer;
        song = sname;
        cost = price;
        tracks = numoftracks;
    }
     
    public  String details()
    {
        String desc;
        desc = cdName + "\t" + song + "\t" + cost +"\t"+tracks;
        return desc;
    }
}
