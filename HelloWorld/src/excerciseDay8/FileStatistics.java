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
public class FileStatistics {
    
    static String name;
    private static String folder;
    private static int size;
    private static int lastModiTime;

public void setname(String name) {

   this.name = name;
  
  }

public void folder(String folder) {

    this.folder = folder;
  }

public void size(int size) {

    this.size = size;
  }

public void lastModiTime(int lastModiTime) {

    this.lastModiTime = lastModiTime;
  }
}
