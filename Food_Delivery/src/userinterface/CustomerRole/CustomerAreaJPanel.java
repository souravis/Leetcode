/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;

import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecoSystem;
    private Restaurant restaurant;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecoSystem) {
        initComponents();        
        this.userProcessContainer = userProcessContainer;        
        this.userAccount = account; 
        this.ecoSystem = ecoSystem;
        populateComboBox();
        populatePreviousOrderTable();
    }
    
    public void populateComboBox(){
       restComboBox.removeAllItems();
       
       for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            restComboBox.addItem(restaurant.getRestaurentName());
        }
    }
    
    public void populateRequestTable(){
        
       for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            restComboBox.addItem(restaurant.getRestaurentName());
        }
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        restComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnCheckout = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        previousOrderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Food Menu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(menuTable);

        restComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Select Restaurent:");

        btnCheckout.setText("Checkout ->");
        btnCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckoutActionPerformed(evt);
            }
        });

        previousOrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(previousOrderTable);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Order History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCheckout)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCheckout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckoutActionPerformed
        // TODO add your handling code here:
//       Restaurant r = (Restaurant) restComboBox.getSelectedItem(); 
       for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            if(restaurant.getRestaurentName().equals(restComboBox.getSelectedItem())) {
                PlaceOrderJPanel placeOrderJPanel = new PlaceOrderJPanel(userProcessContainer, userAccount, ecoSystem, restaurant);
                userProcessContainer.add("placeOrderJPanel", placeOrderJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
       
    }//GEN-LAST:event_btnCheckoutActionPerformed

    private void restComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restComboBoxActionPerformed
        // TODO add your handling code here:
         
         System.out.println(restComboBox.getSelectedItem());
         for (Restaurant restaurant : ecoSystem.getRestaurantDirectory().getRestaurentList()){
            if(restaurant.getRestaurentName().equals(restComboBox.getSelectedItem())) {
                populateTable(restaurant);
            }
        }
//         
//         populateTable(r);
    }//GEN-LAST:event_restComboBoxActionPerformed

    public void populateTable(Restaurant res){
        DefaultTableModel model = (DefaultTableModel) menuTable.getModel();
        model.setRowCount(0);
            for (String menu : res.getMenulist()) {
                Object[] row = new Object[2];
                row[0] = menu;
                model.addRow(row);
            }  
    }
    
     public void populatePreviousOrderTable(){
        DefaultTableModel model = (DefaultTableModel) previousOrderTable.getModel();
        
        model.setRowCount(0);
            for (WorkRequest wr :  userAccount.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[2];
                row[0] = wr.getMessage();
                row[1] = "Delivered";
                //row[2] = "Delivered";
                model.addRow(row);
            }  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable menuTable;
    private javax.swing.JTable previousOrderTable;
    private javax.swing.JComboBox<String> restComboBox;
    // End of variables declaration//GEN-END:variables
}