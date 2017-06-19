
package FinalGUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class GUI extends javax.swing.JFrame implements ListSelectionListener  {
    
  public  Connection con;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        ListSelectionModel rowSelMod = ShoesStockTable.getSelectionModel();
        rowSelMod.addListSelectionListener(this);
    }
    public void valueChanged(ListSelectionEvent le) {
        int rows = ShoesStockTable.getSelectedRow();
        typeOfShoes.setText(ShoesStockTable.getValueAt(rows, 1).toString());
        color.setText(ShoesStockTable.getValueAt(rows, 2).toString());
        size.setText(ShoesStockTable.getValueAt(rows, 3).toString());
        stock.setText(ShoesStockTable.getValueAt(rows, 4).toString());
   
    }

    
    public Connection getConnection(){
        
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/StockDatabase", "Hannah", "12345");
            return con;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    
    public ArrayList<User> usersList() {
        ArrayList<User> usersList = new ArrayList<User>();
        Connection connection = getConnection();
        
        String query = "SELECT * From SHOESSTOCKTABLE ";
        Statement st;
        ResultSet rs;
        
        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            User user;
            while(rs.next()) {
                user = new User(rs.getInt("shoeid"),rs.getString("typeOfShoes"),rs.getString("color"),rs.getDouble("size"),rs.getInt("stock"));
                usersList.add(user);
            }
        
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return usersList;
    }
    
//    Show_Jtable_row_data jtRowData = new Show_Jtable_row_data();
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        StockDatabasePUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("StockDatabasePU").createEntityManager();
        shoesstocktableQuery = java.beans.Beans.isDesignTime() ? null : StockDatabasePUEntityManager.createQuery("SELECT s FROM Shoesstocktable s");
        shoesstocktableList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : shoesstocktableQuery.getResultList();
        shoesstocktableQuery1 = java.beans.Beans.isDesignTime() ? null : StockDatabasePUEntityManager.createQuery("SELECT s FROM Shoesstocktable s");
        shoesstocktableList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : shoesstocktableQuery1.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        ShoesStockTable = new javax.swing.JTable();
        bAdd = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        color = new javax.swing.JTextField();
        typeOfShoes = new javax.swing.JTextField();
        size = new javax.swing.JTextField();
        stock = new javax.swing.JTextField();
        lMessage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        shoeid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, shoesstocktableList1, ShoesStockTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${shoeid}"));
        columnBinding.setColumnName("Shoeid");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${typeofshoes}"));
        columnBinding.setColumnName("Typeofshoes");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${color}"));
        columnBinding.setColumnName("Color");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${size}"));
        columnBinding.setColumnName("Size");
        columnBinding.setColumnClass(Double.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stock}"));
        columnBinding.setColumnName("Stock");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        ShoesStockTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShoesStockTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ShoesStockTable);

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });

        jLabel1.setText("Type Of Shoes");

        jLabel2.setText("Color");

        jLabel3.setText("Size");

        jLabel4.setText("Stock");

        lMessage.setForeground(new java.awt.Color(255, 51, 51));

        jLabel5.setText("ShoeID");

        jButton1.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shoeid, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))
                    .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(typeOfShoes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(shoeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAdd))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bDelete)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(typeOfShoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(bUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(size, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
      Statement st = null;
        try {
          lMessage.setText("");
//          DefaultTableModel model = (DefaultTableModel) ShoesStockTable.getModel();
//          if(!typeOfShoes.getText().trim().equals("")){
//              model.addRow(new Object[] {color.getText(),size.getText(), stock.getText()});
//              
//          }else{
//              lMessage.setText("Type of Shoes should not be left blank");
//          }
          getConnection();
          st = con.createStatement();
          String queryco = "Insert into SHOESSTOCKTABLE(TYPEOFSHOES,COLOR,SIZE,STOCK,SHOEID) values  ('"+
                  typeOfShoes.getText() + "','" + 
                  color.getText() + "',"+
                  Double.parseDouble(size.getText()) + "," +
                  Integer.parseInt(stock.getText()) + "," +
                  Integer.parseInt(shoeid.getText()) + ")";
                  
  
       //  pst.addBatch(queryco);
         st.executeUpdate(queryco);
         con.commit();
         usersList();
      } catch (SQLException ex) {
          Logger.getLogger(GUI.class.getName()).log(Level.SEVERE, null, ex);
      }
    }//GEN-LAST:event_bAddActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
           DefaultTableModel model = (DefaultTableModel) ShoesStockTable.getModel();
        if(ShoesStockTable.getSelectedRow()==-1){
            if(ShoesStockTable.getRowCount()==0){
                lMessage.setText("Table is empty");
            }else{
                lMessage.setText("You must select a product");
            }
        }else{
            model.removeRow(ShoesStockTable.getSelectedRow());
        }      
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        lMessage.setText("");
        DefaultTableModel model = (DefaultTableModel) ShoesStockTable.getModel();
        if(ShoesStockTable.getSelectedRow()==-1){
            if(ShoesStockTable.getRowCount()==0){
                lMessage.setText("Table is empty");
            }else{
                lMessage.setText("You must select a product");
            }
        }else{
            
        model.setValueAt(typeOfShoes.getText(), ShoesStockTable.getSelectedRow(), 0);
        model.setValueAt(color.getText(), ShoesStockTable.getSelectedRow(), 1);
        model.setValueAt(size.getText(), ShoesStockTable.getSelectedRow(), 2);
        model.setValueAt(stock.getText(), ShoesStockTable.getSelectedRow(), 3);
        }      
    }//GEN-LAST:event_bUpdateActionPerformed

    private void ShoesStockTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShoesStockTableMouseClicked

        
        
        
        
        
    }//GEN-LAST:event_ShoesStockTableMouseClicked

//    private void ShoesStockTableMouseClicked(java.awt.event.MouseEvent evt) {                                        
//        DefaultTableModel model = (DefaultTableModel) ShoesStockTable.getModel();
//        typeOfShoes.setText(model.getValueAt(ShoesStockTable.getSelectedRow(), 0).toString());
//        color.setText(model.getValueAt(ShoesStockTable.getSelectedRow(), 1).toString());
//        size.setText(model.getValueAt(ShoesStockTable.getSelectedRow(), 2).toString());
//        stock.setText(model.getValueAt(ShoesStockTable.getSelectedRow(), 3).toString());
//    }  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
        
        
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ShoesStockTable;
    private javax.persistence.EntityManager StockDatabasePUEntityManager;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bUpdate;
    private javax.swing.JTextField color;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JTextField shoeid;
    private java.util.List<FinalGUI.Shoesstocktable> shoesstocktableList;
    private java.util.List<FinalGUI.Shoesstocktable> shoesstocktableList1;
    private javax.persistence.Query shoesstocktableQuery;
    private javax.persistence.Query shoesstocktableQuery1;
    private javax.swing.JTextField size;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField typeOfShoes;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
