/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excerciseDay8;

/**
 *
 * @author CICCC-CIRAC
 */
public class WritePhoneList {
     public static void main(String[] args) {
         
         FileStatistics name1;
         name1 = new FileStatistic();
         name1.setFileStatisticName("hannah");
         String FileStatisticName;
         FileStatisticName = name1.getFileStatisticName();
         System.out.println("Name:" + FileStatisticName);
         
         name1.setfolder(10);
         String folder;
         folder = name1.getfolder();
         
     }
}

