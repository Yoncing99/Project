package project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Cart extends javax.swing.JFrame {
    
    ArrayList<Gymm> gy;
    String header[] = new String[]{"PRODUCT","PRICE","QUANTITY"};
    DefaultTableModel dtm;
    int x,y;
    int row,col;
    
    public Cart() {
        initComponents();
        buy.setVisible(false);
        display.setVisible(false); 
        total.setVisible(false);
        JOptionPane.showMessageDialog(null, "Please enter the product, price and quantity !");
        gy = new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        table.setModel(dtm);
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        close4 = new javax.swing.JLabel();
        reForm4 = new javax.swing.JLabel();
        mini4 = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        goback = new javax.swing.JLabel();
        background10 = new javax.swing.JLabel();
        pro = new javax.swing.JLabel();
        quan = new javax.swing.JTextField();
        pric = new javax.swing.JTextField();
        pri = new javax.swing.JLabel();
        qua = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        tota = new javax.swing.JButton();
        search = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        buy = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        produ = new javax.swing.JComboBox<>();
        total = new javax.swing.JLabel();
        ans = new javax.swing.JLabel();
        purchase = new javax.swing.JTextField();
        display = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel12MouseDragged(evt);
            }
        });
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel12MousePressed(evt);
            }
        });

        close4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/x3.jpg"))); // NOI18N
        close4.setText("jLabel1");
        close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close4MouseClicked(evt);
            }
        });

        reForm4.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        reForm4.setForeground(new java.awt.Color(255, 255, 0));
        reForm4.setText("CART");

        mini4.setBackground(new java.awt.Color(0, 0, 0));
        mini4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        mini4.setForeground(new java.awt.Color(255, 255, 255));
        mini4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini4.setText("—");
        mini4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mini4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reForm4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 796, Short.MAX_VALUE)
                .addComponent(mini4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(reForm4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 30));

        cart.setFont(new java.awt.Font("Shrikhand", 1, 24)); // NOI18N
        cart.setForeground(new java.awt.Color(255, 255, 255));
        cart.setText("My Shopping Cart");
        jPanel11.add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, -1));

        goback.setBackground(new java.awt.Color(255, 255, 255));
        goback.setFont(new java.awt.Font("Bernard MT Condensed", 1, 36)); // NOI18N
        goback.setForeground(new java.awt.Color(255, 255, 255));
        goback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goback.setText("<");
        goback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        goback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobackMouseClicked(evt);
            }
        });
        jPanel11.add(goback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 40));

        background10.setBackground(new java.awt.Color(0, 0, 0));
        background10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/t1_1.jpg"))); // NOI18N
        jPanel11.add(background10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 940, 60));

        pro.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        pro.setText("Product");
        jPanel11.add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        quan.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        quan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(quan, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 220, 30));

        pric.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        pric.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel11.add(pric, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 220, 30));

        pri.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        pri.setText("Price");
        jPanel11.add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        qua.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        qua.setText("Quantity");
        jPanel11.add(qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        add.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel11.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        delete.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel11.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        edit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel11.add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        tota.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tota.setText("TOTAL");
        tota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totaActionPerformed(evt);
            }
        });
        jPanel11.add(tota, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 110, -1));

        search.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel11.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        clear.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        clear.setText("CLEAR");
        clear.setToolTipText("");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel11.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        buy.setBackground(new java.awt.Color(255, 255, 0));
        buy.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        buy.setText("BUY");
        buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyActionPerformed(evt);
            }
        });
        jPanel11.add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 430, 120, 50));

        exit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel11.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 100, -1));

        table.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        table.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setRowHeight(24);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 550, 250));

        produ.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        produ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treadmill", "Stationary Bike", "Incline Bench Press", "Dumbbell Set", "Barbell Set" }));
        produ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produActionPerformed(evt);
            }
        });
        jPanel11.add(produ, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 220, 30));

        total.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        total.setText("Total :");
        jPanel11.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        ans.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        ans.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel11.add(ans, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 220, 40));

        purchase.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        purchase.setForeground(new java.awt.Color(255, 0, 0));
        purchase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        purchase.setBorder(null);
        jPanel11.add(purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, 420, 40));

        display.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        display.setText("DISPLAY");
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });
        jPanel11.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 490, 120, 50));

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setText("Category:");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        box.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gym Equipment", "Rice Cooker", "Refrigerator", "Vehicle" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        jPanel11.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 30));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 940, 2));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel11.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 940, 2));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_close4MouseClicked

    private void mini4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mini4MouseClicked
        this.setState(Cart.ICONIFIED);
    }//GEN-LAST:event_mini4MouseClicked

    private void jPanel12MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel12MouseDragged

    private void jPanel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel12MousePressed

    private void gobackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobackMouseClicked
        this.setVisible(false);
        Menu info = new Menu();
        info.setVisible(true);
    }//GEN-LAST:event_gobackMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        
        String pp = produ.getSelectedItem().toString();
        int rr = Integer.parseInt(pric.getText());
        int qq = Integer.parseInt(quan.getText());
        String cc = box.getSelectedItem().toString();
        
        gy.add(new Gymm(pp,rr,qq,cc));
        dtm.setRowCount(0);
        for(int i=0;i<gy.size();i++){
            Object[]objs = {gy.get(i).pp,gy.get(i).rr,gy.get(i).qq,gy.get(i).cc};
            dtm.addRow(objs);
        }
        
        clearField();
        
    }//GEN-LAST:event_addActionPerformed

    private void clearField(){

        produ.requestFocus();
        produ.setSelectedIndex(0);
        pric.setText("");
        quan.setText("");
        
    }
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        
        if(table.getSelectedRow() == -1){
            if(table.getRowCount() == 0){
                JOptionPane.showMessageDialog(null,"Invalid Delete !\nTable is empty !","Delete Error",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Delete !\nYou must select a product !","Delete Error",JOptionPane.ERROR_MESSAGE);
            }           
        }else{
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data","Delete",dialogButton);
            if(dialogResult == 0){
                dtm.removeRow(row);
                gy.remove(row);
                dtm.setRowCount(0);
                for(int i = 0; i< gy.size();i++){
                    Object[] objs = {gy.get(i).pp,gy.get(i).rr,gy.get(i).qq,gy.get(i).cc};
                    dtm.addRow(objs);
                }
                clearField();
            }else{
                
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        
        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        
        if(table.getSelectedRow() == -1){
            if(table.getRowCount() == 0){
                JOptionPane.showMessageDialog(null,"Invalid Edit !\nTable is empty !","Edit Error",JOptionPane.ERROR_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null,"Invalid Edit !\nYou must select a product !","Edit Error",JOptionPane.ERROR_MESSAGE);
            }
        }else{
            String updatedcc = box.getSelectedItem().toString();
            String updatedpp = produ.getSelectedItem().toString();
            int updatedrr = Integer.parseInt(pric.getText());
            int updatedqq = Integer.parseInt(quan.getText());
            
            gy.get(row).pp = updatedpp;
            gy.get(row).rr = updatedrr;
            gy.get(row).qq = updatedqq;
            gy.get(row).cc = updatedcc;
            dtm.setRowCount(0);
            for(int i =0; i<gy.size();i++){
                Object[]objs = {gy.get(i).pp,gy.get(i).rr,gy.get(i).qq,gy.get(i).cc};
                dtm.addRow(objs);
            }
        }
    }//GEN-LAST:event_editActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
         
        row = table.getSelectedRow();
        col = table.getColumnCount();
               
        pric.setText(dtm.getValueAt(row, 1).toString());
        quan.setText(dtm.getValueAt(row, 2).toString());
        String loca ;
        loca = dtm.getValueAt(row, 0).toString();

        if(loca.equals("Treadmill")||loca.equals("Stationary Bike")||loca.equals("Incline Bench Press")||loca.equals("Dumbbell Set")||loca.equals("Barbell Set")){
            box.setSelectedItem("Gym Equipment");
            produ.setSelectedItem(loca);
        }else if(loca.equals("Classic Electric")||loca.equals("Gas")||loca.equals("Micro-computerized")){
            box.setSelectedItem("Rice Cooker");
            produ.setSelectedItem(loca);
        }else if(loca.equals("French Door")||loca.equals("Side By Side")||loca.equals("Top Mount")||loca.equals("Bottom Mount")){
            box.setSelectedItem("Refrigerator");
            produ.setSelectedItem(loca);
        }else if(loca.equals("Audi A1")||loca.equals("BMW M850i")||loca.equals("Honda Civic")||loca.equals("Mazda Biante")){
            box.setSelectedItem("Vehicle");
            produ.setSelectedItem(loca);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        pric.setText(null);
        quan.setText(null);
        
        int move = dtm.getRowCount();
        for(int i = move - 1; i>=0; i--){
            dtm.removeRow(i);
        }
        gy.clear();
    }//GEN-LAST:event_clearActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        
        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        
        if(table.getRowCount() == 0){
                JOptionPane.showMessageDialog(null,"Invalid Search !\nTable is empty !","Search Error",JOptionPane.ERROR_MESSAGE);
        }else { 
            String input = JOptionPane.showInputDialog(this,"Search Product");
            for(int i =0; i< gy.size(); i++){
                if(gy.get(i).pp.equalsIgnoreCase(input)){
                    JOptionPane.showMessageDialog(search, "Found!!!","Search Product",2);
                    pric.setText(String.valueOf(gy.get(i).rr));
                    quan.setText(String.valueOf(gy.get(i).qq));
                    
                    String loca = String.valueOf(gy.get(i).pp);
                    
                    if(loca.equals("Treadmill")||loca.equals("Stationary Bike")||loca.equals("Incline Bench Press")||loca.equals("Dumbbell Set")||loca.equals("Barbell Set")){
                        box.setSelectedItem("Gym Equipment");
                        produ.setSelectedItem(loca);
                    }else if(loca.equals("Classic Electric")||loca.equals("Gas")||loca.equals("Micro-computerized")){
                        box.setSelectedItem("Rice Cooker");
                        produ.setSelectedItem(loca);
                    }else if(loca.equals("French Door")||loca.equals("Side By Side")||loca.equals("Top Mount")||loca.equals("Bottom Mount")){
                        box.setSelectedItem("Refrigerator");
                        produ.setSelectedItem(loca);
                    }else if(loca.equals("Audi A1")||loca.equals("BMW M850i")||loca.equals("Honda Civic")||loca.equals("Mazda Biante")){
                        box.setSelectedItem("Vehicle");
                        produ.setSelectedItem(loca);
                    }
                    return;
                }
            }
            JOptionPane.showMessageDialog(search,"Not Found!!!","Search Product",2);
        }
    }//GEN-LAST:event_searchActionPerformed

    private void produActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produActionPerformed
        String pp = produ.getSelectedItem().toString();
        
        switch(pp){

            case "Treadmill":
                pric.setText("2000");
                break;
                
            case "Stationary Bike":
                pric.setText("800");
                break;
                
            case "Incline Bench Press":
                pric.setText("400");
                break;
                
            case "Dumbbell Set":
                pric.setText("400");
                break;
                
            case "Barbell Set":
                pric.setText("600");
                break;
                
            case "Classic Electric":
                pric.setText("120");
                break;
            
            case "Gas":
                pric.setText("480");
                break;
            
            case "Micro-computerized":
                pric.setText("400");
                break;
                
            case "French Door":
                pric.setText("4399");
                break;
                
            case "Side By Side":
                pric.setText("2759");
                break;
            
            case "Top Mount":
                pric.setText("999");
                break;
                
            case "Bottom Mount":
                pric.setText("1699");
                break;
                
            case "Audi A1":
                pric.setText("179900");
                break;
                
            case "BMW M850i":
                pric.setText("1088800");
                break;
            
            case "Honda Civic":
                pric.setText("330002");
                break;
            
            case "Mazda Biante":
                pric.setText("145719");
                break;
        }
    }//GEN-LAST:event_produActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void totaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totaActionPerformed

        buy.setVisible(false);
        total.setVisible(false);
        ans.setVisible(false);
        display.setVisible(false);
        
        total.setVisible(true);
        getTotal();
        buy.setVisible(true);
        ans.setVisible(true);

    }//GEN-LAST:event_totaActionPerformed

    private void buyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyActionPerformed
        
        String bu = evt.getActionCommand();
        
        if("BUY".equals(bu)){
            if(evt.getSource()==buy){ 
                FileWriter fw = null;
                String fileContent = "\t\t                         MY SHOPPING CART\n"; 
 
                try {
                    File file = new File("/Users/Auntie Goh/Desktop/Filetxt/purchasing form.txt");
                    if(!file.exists()){
                        file.createNewFile();
                    }
                    fw = new FileWriter(file.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write(fileContent);
                    bw.write("\n|=================================================================================================|\n");
                    bw.write(String.format("| %-18s| %-22s | %-10s | %20s | %15s| %n","CATEGORY","PRODUCT","QUANTITY","PRICE PER UNIT(RM)","PRICE(RM)"));
                    bw.write("|=================================================================================================|\n");
       
                    for(int i=0;i<gy.size();i++){
                        bw.write(String.format("| %-18s| %-22s | %-10s | %20s | %15s| %n",gy.get(i).cc,gy.get(i).pp,gy.get(i).qq,gy.get(i).rr,Integer.parseInt(table.getValueAt(i, 1).toString())*Integer.parseInt(table.getValueAt(i, 2).toString())));
                        bw.write("|-------------------------------------------------------------------------------------------------|\n");
                    }
                    bw.write(String.format("| %-79s| %15s| %n","TOTAL PRICE:",ans.getText()));
                    bw.write("|-------------------------------------------------------------------------------------------------|\n");
                    bw.close();
                    
                fw.close();
                JOptionPane.showMessageDialog(null, "Purchase Successfully !");
                purchase.setText("Thank You For Purchasing !!!");
            
                int move = dtm.getRowCount();
                for(int i = move - 1; i>=0; i--){
                    dtm.removeRow(i);
                }
                gy.clear();

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }else{
                purchase.setText("");
            }
            buy.setVisible(false);
            total.setVisible(false);
            ans.setVisible(false);
            display.setVisible(true);
        }    
                    
    }//GEN-LAST:event_buyActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        this.setVisible(false);
        Receipt info = new Receipt();
        info.setVisible(true);
    }//GEN-LAST:event_displayActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed

        String pp = box.getSelectedItem().toString();

        switch(pp){

            case "Gym Equipment":
            produ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Treadmill", "Stationary Bike", "Incline Bench Press", "Dumbbell Set", "Barbell Set"}));
            break;

            case "Rice Cooker":
            produ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic Electric", "Gas", "Micro-computerized"}));
            break;

            case "Refrigerator":
            produ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "French Door", "Side By Side", "Top Mount", "Bottom Mount"}));
            break;

            case "Vehicle":
            produ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audi A1", "BMW M850i", "Honda Civic", "Mazda Biante"}));
            break;

        }
    }//GEN-LAST:event_boxActionPerformed

    public int getTotal(){
        
        int mul =0;
        int sum =0;
        for(int i=0; i<table.getRowCount();i++){
            mul =Integer.parseInt(table.getValueAt(i, 1).toString())*Integer.parseInt(table.getValueAt(i, 2).toString());
            sum = sum + mul;
        }
        ans.setText(Integer.toString(sum));
        return sum;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JLabel ans;
    private javax.swing.JLabel background10;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JButton buy;
    private javax.swing.JLabel cart;
    private javax.swing.JButton clear;
    private javax.swing.JLabel close4;
    private javax.swing.JButton delete;
    private javax.swing.JButton display;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JLabel goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mini4;
    private javax.swing.JLabel pri;
    private javax.swing.JTextField pric;
    private javax.swing.JLabel pro;
    private javax.swing.JComboBox<String> produ;
    private javax.swing.JTextField purchase;
    private javax.swing.JLabel qua;
    private javax.swing.JTextField quan;
    private javax.swing.JLabel reForm4;
    private javax.swing.JButton search;
    private javax.swing.JTable table;
    private javax.swing.JButton tota;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
