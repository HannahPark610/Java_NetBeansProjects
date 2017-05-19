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
import java.text.NumberFormat;

   public class CDplayer {
       private CD[] player ;
       private CD curNode;
       private int count;
       private double totalCost;
   
   //constructor : creates empty CD collections
   public  CDplayer(){
//     player= new CD[10];
       player = null;
       curNode = null;
       count = 0;
       totalCost = 0.0;
   }
   
   //Add a cd to colection
   public void addCD(String cdName, String song, double cost, int tracks) {
       if(curNode == null)
       {
       player[count] = new CD(cdName, song, cost, tracks); 
//       player = new CD(cdName, song, cost, tracks);
       curNode = player[count];
       }
       else
       { 
       CD newNode = new CD(cdName, song, cost, tracks); 
       curNode.setNext(newNode);
       }
       count++;//1
       totalCost += cost;
   }
   
   @Override
   public String toString(){
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       String report = "MY COLLECTION\n "+ "NUMBER OF CDS \t"+ count + "\nTOTAL COST\t"+totalCost;
       report += "\nAVERAGE COST\t" + (totalCost/count)+"\n";
      
          for(int i=0; i<count;i++)
              report += player[i].details()+"\n";
       return report;
   } 
}
