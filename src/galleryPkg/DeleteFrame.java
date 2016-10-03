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
public class DeleteFrame extends javax.swing.JFrame {

    /**
     * Creates new form DeleteFrame
     */
    public DeleteFrame() {
        initComponents();
        connectQueries.FillDeleteFrameCbx(deleteArtworkCbx);
        //FillDeleteComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        deleteArtworkCbx = new javax.swing.JComboBox();
        deleteMsgLbl = new javax.swing.JLabel();
        deleteFrameBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        mainMenuDeleteFrameBtn = new javax.swing.JButton();
        disconnectDeleteFrameBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select Artwork to be deleted: ");

        deleteMsgLbl.setForeground(new java.awt.Color(0, 153, 102));

        deleteFrameBtn.setText("Delete");
        deleteFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFrameBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Delete Artwork");

        mainMenuDeleteFrameBtn.setText("MainMenu");
        mainMenuDeleteFrameBtn.setMaximumSize(new java.awt.Dimension(85, 23));
        mainMenuDeleteFrameBtn.setMinimumSize(new java.awt.Dimension(85, 23));
        mainMenuDeleteFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuDeleteFrameBtnActionPerformed(evt);
            }
        });

        disconnectDeleteFrameBtn.setText("Disconnect");
        disconnectDeleteFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectDeleteFrameBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deleteMsgLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addGap(95, 95, 95)
                                            .addComponent(mainMenuDeleteFrameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addComponent(deleteArtworkCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(disconnectDeleteFrameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                        .addComponent(deleteFrameBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(mainMenuDeleteFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disconnectDeleteFrameBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteArtworkCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteFrameBtn))
                .addGap(33, 33, 33)
                .addComponent(deleteMsgLbl)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disconnectDeleteFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectDeleteFrameBtnActionPerformed
        LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            DeleteFrame.this.setVisible(false);
            connectQueries.disConnectDb();
            DeleteFrame.this.dispose();
    }//GEN-LAST:event_disconnectDeleteFrameBtnActionPerformed

    private void mainMenuDeleteFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuDeleteFrameBtnActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        DeleteFrame.this.setVisible(false);
        DeleteFrame.this.dispose();
    }//GEN-LAST:event_mainMenuDeleteFrameBtnActionPerformed

    private void deleteFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFrameBtnActionPerformed
        String selection = deleteArtworkCbx.getSelectedItem().toString();
        
        if(connectQueries.deleteArtworkDeleteFrame(selection)){
            deleteMsgLbl.setText("Deleted Successfully.");
            deleteArtworkCbx.removeItemAt(deleteArtworkCbx.getSelectedIndex());
        } else{
            deleteMsgLbl.setText("Operation Failed.");
        }
    }//GEN-LAST:event_deleteFrameBtnActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox deleteArtworkCbx;
    private javax.swing.JButton deleteFrameBtn;
    private javax.swing.JLabel deleteMsgLbl;
    private javax.swing.JButton disconnectDeleteFrameBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mainMenuDeleteFrameBtn;
    // End of variables declaration//GEN-END:variables
}
