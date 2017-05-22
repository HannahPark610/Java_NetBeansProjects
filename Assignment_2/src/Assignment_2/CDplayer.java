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

   public class CDplayer {
       
       private CD[] player ;
       private int count;
       private double totalCost;
   
 
   public  CDplayer(){
       
       player= new CD[20];
       count = 0;
       totalCost = 0.0;
   }
   
   //Add a cd to colection
   public void addCD(String artist, String song, double cost, int tracks) {
        
       player[count] = new CD(artist, song, cost, tracks);
       totalCost = totalCost + cost;
       count++;
   }
       @Override
   public String toString(){
       String report = "MY COLLECTION\n "+ "NUMBER OF CDS \t"+ count + "\nTOTAL COST\t"+totalCost;
       report += "\nAVERAGE COST\t" + (totalCost/count)+"\n";
      
          for(int i=0; i<count;i++)
              report += player[i].details()+"\n";
       return report;
   } 
}

