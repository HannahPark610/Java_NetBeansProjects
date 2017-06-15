/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
        String query = "Select * from Hannah.ShoesStockTable";

        try {
            myconObj = DriverManager.getConnection("jdbc:derby://localhost:1527/StockDatabase", "Hannah", "12345");
            mystatObj = myconObj.createStatement();
            myresObj = mystatObj.executeQuery(query);
            while (myresObj.next()) {
                String typeOfShoes = myresObj.getString("TypeOfShoes");
                String color = myresObj.getString("Color");
                Double size = myresObj.getDouble("Size");
                int stock = myresObj.getInt("Stock");
                System.out.println(typeOfShoes + "\t  " + color + "\t  " + size + "\t  "+ stock);
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
