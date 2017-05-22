/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_2;

import! java.io.*;

/**
 *
 * @author hyunyoungpark
 */
public class PlayList {
    
     public static void main(String[] args) throws Exception{     // 예외 던지기
    FileOutputStream fos=new FileOutputStream("c:\\알파벳.txt");
    
    for(int i='A'; i<='Z'; i++)
      fos.write(i);       // fos에게 데이터를 보내면 fos는 파일에 출력한다.
 
      fos.close();          // 스트림은 다 쓴 후에 닫아주는 것이 좋다.
  }
}
