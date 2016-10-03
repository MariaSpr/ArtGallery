package galleryPkg;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
import net.proteanit.sql.DbUtils;
import java.sql.*;
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    //private static connectQueries connex;
    
    public MainFrame() {
        //this.connex = connex;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        welcomeLbl = new javax.swing.JLabel();
        disconnectBtn = new javax.swing.JButton();
        selectActionLbl = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        insertBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        selectRecordsLbl = new javax.swing.JLabel();
        artistsRdBtn = new javax.swing.JRadioButton();
        artworksRdBtn = new javax.swing.JRadioButton();
        customersRdBtn = new javax.swing.JRadioButton();
        ordersRdBtn = new javax.swing.JRadioButton();
        groupsRdBtn = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        mainFrameTable = new javax.swing.JTable();
        showRecordsBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        welcomeLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        welcomeLbl.setText("Welcome to the GalleryDatabase Project.");

        disconnectBtn.setText("Disconnect");
        disconnectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectBtnActionPerformed(evt);
            }
        });

        selectActionLbl.setText("Select Action:");

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        insertBtn.setText("Insert");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        selectRecordsLbl.setText("Select Record to be shown:");

        artistsRdBtn.setText("artists");
        artistsRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artistsRdBtnActionPerformed(evt);
            }
        });

        artworksRdBtn.setText("artworks");
        artworksRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artworksRdBtnActionPerformed(evt);
            }
        });

        customersRdBtn.setText("customers");
        customersRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersRdBtnActionPerformed(evt);
            }
        });

        ordersRdBtn.setText("orders");
        ordersRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordersRdBtnActionPerformed(evt);
            }
        });

        groupsRdBtn.setText("groups");
        groupsRdBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                groupsRdBtnActionPerformed(evt);
            }
        });

        mainFrameTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        jScrollPane1.setViewportView(mainFrameTable);

        showRecordsBtn.setText("Show Records");
        showRecordsBtn.setEnabled(false);
        showRecordsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRecordsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(63, 63, 63))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectActionLbl)
                            .addComponent(selectRecordsLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(artistsRdBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(artworksRdBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(customersRdBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ordersRdBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(groupsRdBtn)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(welcomeLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(disconnectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(showRecordsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 411, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disconnectBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectActionLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(insertBtn))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectRecordsLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistsRdBtn)
                    .addComponent(artworksRdBtn)
                    .addComponent(customersRdBtn)
                    .addComponent(ordersRdBtn)
                    .addComponent(groupsRdBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showRecordsBtn)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disconnectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectBtnActionPerformed
        LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            MainFrame.this.setVisible(false);
            connectQueries.disConnectDb();
            
    }//GEN-LAST:event_disconnectBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        SearchFrame searchFrame = new SearchFrame();
            searchFrame.setVisible(true);
            MainFrame.this.setVisible(false);
            MainFrame.this.dispose();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        InsertFrame insertFrame = new InsertFrame();
            insertFrame.setVisible(true);
            MainFrame.this.setVisible(false);
            MainFrame.this.dispose();
    }//GEN-LAST:event_insertBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        UpdateFrame updateFrame = new UpdateFrame();
            updateFrame.setVisible(true);
            MainFrame.this.setVisible(false);
            MainFrame.this.dispose();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DeleteFrame deleteFrame = new DeleteFrame();
            deleteFrame.setVisible(true);
            MainFrame.this.setVisible(false);
            MainFrame.this.dispose();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnGroup.add(artistsRdBtn);
        btnGroup.add(artworksRdBtn);
        btnGroup.add(customersRdBtn);
        btnGroup.add(ordersRdBtn);
        btnGroup.add(groupsRdBtn);
    }//GEN-LAST:event_formWindowOpened

    private void artistsRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artistsRdBtnActionPerformed
        showRecordsBtn.setEnabled(true);
    }//GEN-LAST:event_artistsRdBtnActionPerformed

    private void artworksRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artworksRdBtnActionPerformed
        showRecordsBtn.setEnabled(true);
    }//GEN-LAST:event_artworksRdBtnActionPerformed

    private void customersRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersRdBtnActionPerformed
        showRecordsBtn.setEnabled(true);
    }//GEN-LAST:event_customersRdBtnActionPerformed

    private void ordersRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordersRdBtnActionPerformed
        showRecordsBtn.setEnabled(true);
    }//GEN-LAST:event_ordersRdBtnActionPerformed

    private void groupsRdBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_groupsRdBtnActionPerformed
        showRecordsBtn.setEnabled(true);
    }//GEN-LAST:event_groupsRdBtnActionPerformed

    private void showRecordsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRecordsBtnActionPerformed
        if(artistsRdBtn.isSelected()) {
            
            mainFrameTable.setModel(DbUtils.resultSetToTableModel(connectQueries.selectArtistMainFrame()));
            
        } else if (artworksRdBtn.isSelected()){
            
            mainFrameTable.setModel(DbUtils.resultSetToTableModel(connectQueries.selectArtworkMainFrame()));
            
        } else if(customersRdBtn.isSelected()){
            
            mainFrameTable.setModel(DbUtils.resultSetToTableModel(connectQueries.selectCustomerMainFrame()));
            
        } else if(ordersRdBtn.isSelected()){
            
            mainFrameTable.setModel(DbUtils.resultSetToTableModel(connectQueries.selectOrderMainFrame()));
            
        } else if(groupsRdBtn.isSelected()) {
            
            mainFrameTable.setModel(DbUtils.resultSetToTableModel(connectQueries.selectGroupMainFrame()));
            
        }
    }//GEN-LAST:event_showRecordsBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton artistsRdBtn;
    private javax.swing.JRadioButton artworksRdBtn;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JRadioButton customersRdBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton disconnectBtn;
    private javax.swing.JRadioButton groupsRdBtn;
    private javax.swing.JButton insertBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable mainFrameTable;
    private javax.swing.JRadioButton ordersRdBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel selectActionLbl;
    private javax.swing.JLabel selectRecordsLbl;
    private javax.swing.JButton showRecordsBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
