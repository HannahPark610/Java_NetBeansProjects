/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalGUI;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hyunyoungpark
 */
public class DataBase {

    public static void main(String[] args) {
        
        try {
            
            Connection myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/StockDatabase", "Hannah", "12345");
            Statement mystatObj = myconObj.createStatement();
            ResultSet myresObj = mystatObj.executeQuery("Select * from Hannah.ShoesStockTable");
            while (myresObj.next()) {
//                for (int i = 1; i<=coloumnNo; i++) {
//                     System.out.print(myresObj.getObject(i)+"\t");
//                }
                System.out.println(myresObj.getString(1));
                System.out.println(myresObj.getString(2));
                System.out.println(myresObj.getString(3));
                System.out.println(myresObj.getString(4));
                System.out.println("-------------------------");
                
            }
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
//        Connection myconObj = null;
//        Statement mystatObj = null;
//        ResultSet myresObj = null;
//        ResultSetMetaData mymeta = null;
//        String query = "Select * from Hannah.ShoesStockTable";
//
//        try {
//            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/StockDatabase", "Hannah", "12345");
//            mystatObj = myconObj.createStatement();
//            myresObj = mystatObj.executeQuery(query);
//            mymeta = myresObj.getMetaData();
//            int coloumnNo = mymeta.getColumnCount();
//            for (int i = 1; i<=coloumnNo; i++){
//                System.out.print(mymeta.getColumnName(i)+"\t");
//            }
//            System.out.println();
//            while (myresObj.next()) {
//                for (int i = 1; i<=coloumnNo; i++) {
//                     System.out.print(myresObj.getObject(i)+"\t");
//                }
//                System.out.println();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//
//        }
//    }
//}
