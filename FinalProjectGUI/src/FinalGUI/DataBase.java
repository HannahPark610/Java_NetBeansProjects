/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalGUI;

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

        Connection myconObj = null;
        Statement mystatObj = null;
        ResultSet myresObj = null;
        ResultSetMetaData mymeta = null;
        String query = "Select * from Hannah.ShoesStockTable";

        try {
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/StockDatabase", "Hannah", "12345");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);
            mymeta = myresObj.getMetaData();
            int coloumnNo = mymeta.getColumnCount();
//            System.out.println(coloumnNo);
            for (int i = 1; i<=coloumnNo; i++){
                System.out.println(mymeta.getColumnName(i)+"\t");
            }
            while (myresObj.next()) {
                for (int i = 1; i<=coloumnNo; i++){
                     System.out.println(myresObj.getObject(i)+"\t");
                }
                System.out.println();
//                String typeOfShoes = myresObj.getString("TypeOfShoes");
//                String color = myresObj.getString("Color");
//                Double size = myresObj.getDouble("Size");
//                int stock = myresObj.getInt("Stock");
//                System.out.println(typeOfShoes + "\t  " + color + "\t  " + size + "\t  "+ stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
