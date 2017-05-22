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
    private String artist;
    private String song;
    private double cost;
    private int tracks;
//    private CD nextNode;
    
    public CD() {
//        nextNode = null;
    }
    
    
    public  CD(String singer, String sname, double price, int numoftracks){
        artist = singer;
        song = sname;
        cost = price;
        tracks = numoftracks;
    //    nextNode = null;
    }
  
    //private 메모리를 사용할때는 getter, setter는 기본적으로 만들어두는게 좋음.
    public void setArtist(String pArtist)  { 
        this.artist = pArtist; 
    }
    public void setSong(String pSong) { 
        this.song = pSong; 
    }
    public void setCost(double pCost)  { 
        this.cost = pCost;  
    }
    public void setTracks(int pTracks)  { 
        this.tracks = pTracks; 
    }
//    public void setNext(CD pNode)   {
//        this.nextNode = pNode;
//    }
    public String getArtist()    { 
        return this.artist; 
    }
    public String getSong()    { 
        return this.song; 
    }
    public double getCost()     { 
        return this.cost; 
    }
    public int getTracks()     { 
        return this.tracks;  
    }
//    public CD getNext()      {   
//        return this.nextNode; 
//    }
     
    public  String details()
    {
        String desc;
        desc = artist + "\t" + song + "\t" + cost +"\t"+tracks;
        return desc;
    }
}
