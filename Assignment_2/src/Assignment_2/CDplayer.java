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
class CDplayer {
   private final CD[] player ;
   private int count;
   private double totalCost;
   //constructor : creates empty CD collections
   public  CDplayer(){
       player= new CD[10];
       count = 0;
       totalCost =0.0;
   }
   
   //Add a cd to colection
   public void addCD(String cdName, String song, double cost, int tracks){
       player[count] = new CD(cdName,song,cost,tracks);  //"Storm Front",14.95,10);
       //"Come On Over",14.95,16
       totalCost = totalCost + cost; //0+14.95=14.95, 14.95+14.95
       count++;//1,
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
