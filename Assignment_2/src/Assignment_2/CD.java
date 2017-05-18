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
    private CD nextNode;
    
    public CD() {
        nextNode = null;
    }
    
    
    public  CD(String singer, String sname, double price, int numoftracks){
        cdName = singer;
        song = sname;
        cost = price;
        tracks = numoftracks;
        nextNode = null;
    }
  
    //private 메모리를 사용할때는 getter, setter는 기본적으로 만들어두는게 좋음.
    public void setCdName(String singer)  { 
        this.cdName = singer; 
    }
    public void setSong(String sname) { 
        this.song = sname; 
    }
    public void setCost(double price)  { 
        this.cost = price;  
    }
    public void setTracks(int numoftracks)  { 
        this.tracks = numoftracks; 
    }
    public void setNext(CD pNode)   {
        this.nextNode = pNode;
    }
    public String getCdName()    { 
        return this.cdName; 
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
    public CD getNext()      {   
        return this.nextNode; 
    }
     
    public  String details()
    {
        String desc;
        desc = cdName + "\t" + song + "\t" + cost +"\t"+tracks;
        return desc;
    }
}
