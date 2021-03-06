package galleryPkg;

import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class SearchFrame extends javax.swing.JFrame {

    /**
     * Creates new form SearchFrame
     */
    public SearchFrame() {
        initComponents();
        //checkSearchCheckBoxes();
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
        mainMenuSearchFrameBtn = new javax.swing.JButton();
        disconnectSearchFrameBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchFrameTable = new javax.swing.JTable();
        searchMsgLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        searchArtistTxt = new javax.swing.JTextField();
        searchGenreTxt = new javax.swing.JTextField();
        searchGroupTxt = new javax.swing.JTextField();
        searchArtworkSbtBtn = new javax.swing.JButton();
        searchArtworkClrBtn = new javax.swing.JButton();
        searchArtistChBx = new javax.swing.JCheckBox();
        searchGenreChBx = new javax.swing.JCheckBox();
        searchGroupChBx = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        searchCustPurchSbtBtn = new javax.swing.JButton();
        searchCustPurchClrBtn = new javax.swing.JButton();
        searchCustPurchTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchCustLikeClrBtn = new javax.swing.JButton();
        searchCustLikeSbtBtn = new javax.swing.JButton();
        searchCustLikesArtistTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        searchArtworkInsertedByYearSbtBtn = new javax.swing.JButton();
        searchArtworkInsertedByYearClrBtn = new javax.swing.JButton();
        searchNumArtworkTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Search Records: ");

        mainMenuSearchFrameBtn.setText("MainMenu");
        mainMenuSearchFrameBtn.setPreferredSize(new java.awt.Dimension(85, 23));
        mainMenuSearchFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuSearchFrameBtnActionPerformed(evt);
            }
        });

        disconnectSearchFrameBtn.setText("Disconnect");
        disconnectSearchFrameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectSearchFrameBtnActionPerformed(evt);
            }
        });

        searchFrameTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(searchFrameTable);

        searchMsgLbl.setForeground(new java.awt.Color(204, 153, 0));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Artwork by:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        searchArtistTxt.setEnabled(false);

        searchGenreTxt.setEnabled(false);

        searchGroupTxt.setEnabled(false);

        searchArtworkSbtBtn.setText("Search");
        searchArtworkSbtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtworkSbtBtnActionPerformed(evt);
            }
        });

        searchArtworkClrBtn.setText("Clear");
        searchArtworkClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtworkClrBtnActionPerformed(evt);
            }
        });

        searchArtistChBx.setText("artist");
        searchArtistChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtistChBxActionPerformed(evt);
            }
        });

        searchGenreChBx.setText("genre");
        searchGenreChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGenreChBxActionPerformed(evt);
            }
        });

        searchGroupChBx.setText("group");
        searchGroupChBx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGroupChBxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(searchArtworkSbtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(searchArtistChBx)
                                .addGap(55, 55, 55)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(searchGenreChBx)
                            .addGap(53, 53, 53)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchGroupChBx)
                        .addGap(53, 53, 53)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchGenreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchArtistTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchArtworkClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGroupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchArtistChBx)
                    .addComponent(searchArtistTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchGenreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchGenreChBx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchGroupChBx)
                    .addComponent(searchGroupTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchArtworkSbtBtn)
                    .addComponent(searchArtworkClrBtn)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Customer Purchases by year:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        searchCustPurchSbtBtn.setText("Search");
        searchCustPurchSbtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustPurchSbtBtnActionPerformed(evt);
            }
        });

        searchCustPurchClrBtn.setText("Clear");
        searchCustPurchClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustPurchClrBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer name: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(searchCustPurchTxt)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(searchCustPurchSbtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchCustPurchClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustPurchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCustPurchSbtBtn)
                    .addComponent(searchCustPurchClrBtn)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Customer Likes Artists:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        searchCustLikeClrBtn.setText("Clear");
        searchCustLikeClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustLikeClrBtnActionPerformed(evt);
            }
        });

        searchCustLikeSbtBtn.setText("Search");
        searchCustLikeSbtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustLikeSbtBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Customer Name: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchCustLikesArtistTxt)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(searchCustLikeSbtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchCustLikeClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchCustLikesArtistTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCustLikeSbtBtn)
                    .addComponent(searchCustLikeClrBtn)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Number Artworks created by artist, inserted by year:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 8), new java.awt.Color(0, 0, 102))); // NOI18N

        searchArtworkInsertedByYearSbtBtn.setText("Search");
        searchArtworkInsertedByYearSbtBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtworkInsertedByYearSbtBtnActionPerformed(evt);
            }
        });

        searchArtworkInsertedByYearClrBtn.setText("Clear");
        searchArtworkInsertedByYearClrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchArtworkInsertedByYearClrBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Artist Name: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(searchNumArtworkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(searchArtworkInsertedByYearSbtBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchArtworkInsertedByYearClrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchNumArtworkTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchArtworkInsertedByYearSbtBtn)
                    .addComponent(searchArtworkInsertedByYearClrBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainMenuSearchFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disconnectSearchFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchMsgLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(mainMenuSearchFrameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(disconnectSearchFrameBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchMsgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void disconnectSearchFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectSearchFrameBtnActionPerformed
        LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);
            SearchFrame.this.setVisible(false);
            connectQueries.disConnectDb();
            SearchFrame.this.dispose();
    }//GEN-LAST:event_disconnectSearchFrameBtnActionPerformed

    private void mainMenuSearchFrameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuSearchFrameBtnActionPerformed
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
        SearchFrame.this.setVisible(false);
        SearchFrame.this.dispose();
    }//GEN-LAST:event_mainMenuSearchFrameBtnActionPerformed

    private void searchArtworkSbtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtworkSbtBtnActionPerformed
        
        //Search by Artist AND Genre AND Group
        if(searchArtistChBx.isSelected() & searchGenreChBx.isSelected() & searchGroupChBx.isSelected()){
            String artist = searchArtistTxt.getText();
            String genre = searchGenreTxt.getText();
            String nameOfGroup = searchGroupTxt.getText();
            
            if(connectQueries.searchArtworkByArtistAndGenreAndGroup(searchFrameTable, artist, genre, nameOfGroup)){
                searchMsgLbl.setText("Artworks Search by Artists AND Genre AND Group results.");
            } else {
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        
        }
        
        
        
        //Search by Artist AND Genre
        if(searchArtistChBx.isSelected() & searchGenreChBx.isSelected() & !searchGroupChBx.isSelected()){
            String artist = searchArtistTxt.getText();
            String genre = searchGenreTxt.getText();
            
            if(connectQueries.searchArtworkByArtistAndGenre(searchFrameTable, artist, genre)){
                searchMsgLbl.setText("Artworks Search by Artists AND Genre results.");
            } else {
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        }
        
         //Search by Artist AND Group
        if(searchArtistChBx.isSelected() & searchGroupChBx.isSelected() & !searchGenreChBx.isSelected()){
            String artist = searchArtistTxt.getText();
            String nameOfGroup = searchGroupTxt.getText();
            
            if(connectQueries.searchArtworkByArtistAndGroup(searchFrameTable, artist, nameOfGroup)){
                searchMsgLbl.setText("Artworks Search by Artists AND Group results.");
            }else{
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        }
        
        //Search by Genre AND Group
        if(searchGenreChBx.isSelected() & searchGroupChBx.isSelected() && !searchArtistChBx.isSelected()){
            String genre = searchGenreTxt.getText();
            String nameOfGroup = searchGroupTxt.getText();
            
            if(connectQueries.searchArtworkByGenreAndGroup(searchFrameTable, genre, nameOfGroup)){
                searchMsgLbl.setText("Artworks Search by Genre AND Group results.");
            } else{
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
            
        }
        

        //Search by artist.
        if(searchArtistChBx.isSelected() && !searchGenreChBx.isSelected() && !searchGroupChBx.isSelected()){
            String artist = searchArtistTxt.getText();
            
            if(connectQueries.searchArtworkByArtist(searchFrameTable, artist)){
                searchMsgLbl.setText("Artworks Created by artist search results.");
            } else{
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        }
        
        //Search by genre.
        if(searchGenreChBx.isSelected() && !searchArtistChBx.isSelected() && !searchGroupChBx.isSelected()){
            String genre = searchGenreTxt.getText();

            if(connectQueries.searchArtworkByGenre(searchFrameTable, genre)) {
                searchMsgLbl.setText("Artworks Search by Genre results.");
            } else{
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        }
        
        //Search by group.
        if(searchGroupChBx.isSelected() && !searchGenreChBx.isSelected() && !searchArtistChBx.isSelected()){
            String nameOfGroup = searchGroupTxt.getText();
            
            if(connectQueries.searchArtworkByGroup(searchFrameTable, nameOfGroup)) {
                searchMsgLbl.setText("Artworks Search by Group results.");
            } else{
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
            }
        }
        
        //Disable TextFields when submit.
        searchGroupTxt.setEnabled(false);
        searchArtistTxt.setEnabled(false);
        searchGenreTxt.setEnabled(false);
        
        //Clear TextFields and Checkboxes when submit.
        searchArtistChBx.setSelected(false);
        searchGenreChBx.setSelected(false);
        searchGroupChBx.setSelected(false);
        searchArtistTxt.setText("");
        searchGenreTxt.setText("");
        searchGroupTxt.setText("");
         
        
    }//GEN-LAST:event_searchArtworkSbtBtnActionPerformed

    private void searchArtistChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtistChBxActionPerformed
        if(searchArtistChBx.isSelected()){
            searchArtistTxt.setEnabled(true);
        } else {
            searchArtistTxt.setEnabled(false);
        }
    }//GEN-LAST:event_searchArtistChBxActionPerformed

    private void searchGenreChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGenreChBxActionPerformed
        if(searchGenreChBx.isSelected()){
            searchGenreTxt.setEnabled(true);
        } else {
            searchGenreTxt.setEnabled(false);
        }
    }//GEN-LAST:event_searchGenreChBxActionPerformed

    private void searchGroupChBxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGroupChBxActionPerformed
        if(searchGroupChBx.isSelected()){
            searchGroupTxt.setEnabled(true);
        } else {
            searchGroupTxt.setEnabled(false);
        }
    }//GEN-LAST:event_searchGroupChBxActionPerformed

    //Search Artwork Clear Button
    private void searchArtworkClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtworkClrBtnActionPerformed
        searchArtistChBx.setSelected(false);
        searchGenreChBx.setSelected(false);
        searchGroupChBx.setSelected(false);
        searchArtistTxt.setText("");
        searchGenreTxt.setText("");
        searchGroupTxt.setText("");
        
        //Disable fields when clear.
        searchGroupTxt.setEnabled(false);
        searchArtistTxt.setEnabled(false);
        searchGenreTxt.setEnabled(false);
        
        searchFrameTable.setModel(new DefaultTableModel());
        
        searchMsgLbl.setText("");
    }//GEN-LAST:event_searchArtworkClrBtnActionPerformed

    
    //SEARCH CUSTOMER LIKES ARTIST
    private void searchCustPurchSbtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustPurchSbtBtnActionPerformed
        String cust =searchCustPurchTxt.getText();
        
        if(connectQueries.searchCustPurchasesByYear(searchFrameTable, cust)) {
            searchMsgLbl.setText("Total Customer Purchases by year results.");
        } else {
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
        }
    }//GEN-LAST:event_searchCustPurchSbtBtnActionPerformed

    private void searchCustPurchClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustPurchClrBtnActionPerformed
        searchCustPurchTxt.setText("");
        searchFrameTable.setModel(new DefaultTableModel());
        searchMsgLbl.setText("");
    }//GEN-LAST:event_searchCustPurchClrBtnActionPerformed

    private void searchCustLikeSbtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustLikeSbtBtnActionPerformed
        String cust = searchCustLikesArtistTxt.getText();
        
        if(connectQueries.searchCustLikesArtist(searchFrameTable, cust)){
            searchMsgLbl.setText("Customer Likes artists results.");
        } else {
                //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
        }
    }//GEN-LAST:event_searchCustLikeSbtBtnActionPerformed

    private void searchCustLikeClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustLikeClrBtnActionPerformed
        searchCustLikesArtistTxt.setText("");
        searchFrameTable.setModel(new DefaultTableModel());
        searchMsgLbl.setText("");
    }//GEN-LAST:event_searchCustLikeClrBtnActionPerformed

    private void searchArtworkInsertedByYearSbtBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtworkInsertedByYearSbtBtnActionPerformed
        String artist = searchNumArtworkTxt.getText();
        
        if(connectQueries.searchNumArtworkByArtistInsertedByYear(searchFrameTable, artist)){
            searchMsgLbl.setText("Number of Artworks that Artist created sorted by insertion year results.");
        } else {
            //clear table set Fail Msg.
                searchFrameTable.setModel(new DefaultTableModel());
                searchMsgLbl.setText("There are no Results.");
        }
    }//GEN-LAST:event_searchArtworkInsertedByYearSbtBtnActionPerformed

    private void searchArtworkInsertedByYearClrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchArtworkInsertedByYearClrBtnActionPerformed
        searchNumArtworkTxt.setText("");
        searchFrameTable.setModel(new DefaultTableModel());
        searchMsgLbl.setText("");
    }//GEN-LAST:event_searchArtworkInsertedByYearClrBtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton disconnectSearchFrameBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton mainMenuSearchFrameBtn;
    private javax.swing.JCheckBox searchArtistChBx;
    private javax.swing.JTextField searchArtistTxt;
    private javax.swing.JButton searchArtworkClrBtn;
    private javax.swing.JButton searchArtworkInsertedByYearClrBtn;
    private javax.swing.JButton searchArtworkInsertedByYearSbtBtn;
    private javax.swing.JButton searchArtworkSbtBtn;
    private javax.swing.JButton searchCustLikeClrBtn;
    private javax.swing.JButton searchCustLikeSbtBtn;
    private javax.swing.JTextField searchCustLikesArtistTxt;
    private javax.swing.JButton searchCustPurchClrBtn;
    private javax.swing.JButton searchCustPurchSbtBtn;
    private javax.swing.JTextField searchCustPurchTxt;
    private javax.swing.JTable searchFrameTable;
    private javax.swing.JCheckBox searchGenreChBx;
    private javax.swing.JTextField searchGenreTxt;
    private javax.swing.JCheckBox searchGroupChBx;
    private javax.swing.JTextField searchGroupTxt;
    private javax.swing.JLabel searchMsgLbl;
    private javax.swing.JTextField searchNumArtworkTxt;
    // End of variables declaration//GEN-END:variables
}
