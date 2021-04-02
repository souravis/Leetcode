/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author abhilash
 */
public class ManageRestaurentsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomersJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcoSystem ecosystem;
    private Restaurant restaurant;
    public ManageRestaurentsJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;        
        this.userAccount = account;
        this.ecosystem = ecosystem;
        populateTable();
        populateComboBox();
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
        restJTable = new javax.swing.JTable();
        restComboBox = new javax.swing.JComboBox();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtRestUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtRestName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRestPhonNum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRestAdd = new javax.swing.JTextField();
        btnUpdateManager = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRestMan = new javax.swing.JTextField();
        txtRestPass = new javax.swing.JPasswordField();
        saveBtn = new javax.swing.JButton();

        restJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurent Name", "Phone Number", "Address", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(restJTable);

        btnCreate.setText("Create Resturant");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete Resturant");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Password:");

        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("Restaurent Name:");

        jLabel6.setText("Role:");

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Phone Number:");

        jLabel3.setText("Address:");

        txtRestAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRestAddActionPerformed(evt);
            }
        });

        btnUpdateManager.setText("Update Resturant");
        btnUpdateManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManagerActionPerformed(evt);
            }
        });

        jLabel4.setText("Username:");

        jLabel7.setText("Restaurent Manager:");

        saveBtn.setText("Save Resturant ");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel6)
                                        .addGap(57, 57, 57)
                                        .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestPhonNum, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRestPass, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtRestMan, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdateManager)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(saveBtn)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnBack)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRefresh))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(79, 79, 79)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnRefresh))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(restComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtRestMan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRestAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRestPhonNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtRestPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdateManager)
                    .addComponent(saveBtn)
                    .addComponent(btnDelete))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    public void populateComboBox(){
       restComboBox.removeAllItems();
       restComboBox.addItem(Role.RoleType.RestaurantAdmin.toString());
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) restJTable.getModel();

        model.setRowCount(0);
        
            for (Restaurant restaurant : ecosystem.getRestaurantDirectory().getRestaurentList()) {
                Object[] row = new Object[model.getColumnCount()];
                row[0] = restaurant;
                row[1] = restaurant.getPhoneNumber();
                row[2] = restaurant.getAddress();
                row[3] = restaurant.getUserAccount().getUsername();

                model.addRow(row);
                }  
        
    }
    
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String username = txtRestUsername.getText();
        String password = String.valueOf(txtRestPass.getPassword());
        
        String restName = txtRestName.getText();
        String restMan = txtRestMan.getText();
        int phoneNum = Integer.parseInt(txtRestPhonNum.getText());
        String address = txtRestAdd.getText();        
        
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(restMan);
        
        UserAccount account = ecosystem.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());
        
        Restaurant restaurant = ecosystem.getRestaurantDirectory().createRestaurant(restName, restMan, phoneNum, address, account);      
                
        txtRestName.setText("");
        txtRestMan.setText("");
        txtRestPhonNum.setText("");
        txtRestAdd.setText("");
        txtRestUsername.setText("");
        txtRestPass.setText("");
        
        populateTable();
        JOptionPane.showMessageDialog(null, "Restaurant Created");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManagerActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = restJTable.getSelectedRow();

        if (selectedRow >= 0) {
            Restaurant r = (Restaurant) restJTable.getValueAt(selectedRow, 0);
            restaurant = r;
            txtRestName.setText(r.getRestaurentName());
            txtRestMan.setText(r.getRestaurentManager());
            txtRestPhonNum.setText(Integer.toString(r.getPhoneNumber()));
            txtRestAdd.setText(r.getAddress());
            txtRestUsername.setText(r.getUserAccount().getUsername());
            txtRestPass.setText(r.getUserAccount().getPassword());
            
        }else {
            JOptionPane.showMessageDialog(null, "Please select a row");
        }
        txtRestName.getText();
        txtRestMan.getText();
        txtRestAdd.getText();
        txtRestAdd.getText();
        txtRestUsername.getText();
        txtRestPass.getPassword();
        
        populateTable();
    }//GEN-LAST:event_btnUpdateManagerActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = restJTable.getSelectedRow();
        if (selectedRow >= 0) {
            Restaurant r = (Restaurant) restJTable.getValueAt(selectedRow, 0);
            ecosystem.getRestaurantDirectory().deleteRestaurant(r);
            JOptionPane.showMessageDialog(null, "Restaurent removed Successfully.");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please select any row.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:

        for (Restaurant r : ecosystem.getRestaurantDirectory().getRestaurentList()) {
       
            if (restaurant.getRestaurentName().equals(r.getRestaurentName())) {
                r.setRestaurentName(txtRestName.getText());
                r.setAddress(txtRestAdd.getText());
                r.setPhoneNumber(Integer.parseInt(txtRestPhonNum.getText()));
                r.setRestaurentManager(txtRestMan.getText());
               
            }
        }
        JOptionPane.showMessageDialog(null, "Restaurent Updated Successfully.");
        populateTable();
        txtRestName.setText("");
        txtRestMan.setText("");
        txtRestPhonNum.setText("");
        txtRestAdd.setText("");
        txtRestUsername.setText("");
        txtRestPass.setText("");
    }//GEN-LAST:event_saveBtnActionPerformed

    private void txtRestAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRestAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRestAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnUpdateManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox restComboBox;
    private javax.swing.JTable restJTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtRestAdd;
    private javax.swing.JTextField txtRestMan;
    private javax.swing.JTextField txtRestName;
    private javax.swing.JPasswordField txtRestPass;
    private javax.swing.JTextField txtRestPhonNum;
    private javax.swing.JTextField txtRestUsername;
    // End of variables declaration//GEN-END:variables
}