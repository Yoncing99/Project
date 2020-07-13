package project;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {

    int x,y;
    
    public Menu() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        reForm = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        shop = new javax.swing.JLabel();
        background9 = new javax.swing.JLabel();
        box = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        go = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/x3.jpg"))); // NOI18N
        close.setText("jLabel1");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        reForm.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        reForm.setForeground(new java.awt.Color(255, 255, 51));
        reForm.setText("PRODUCT");

        mini.setBackground(new java.awt.Color(0, 0, 0));
        mini.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        mini.setForeground(new java.awt.Color(255, 255, 255));
        mini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mini.setText("—");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reForm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1120, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(reForm)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b1.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        b1.setText("P1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel2.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 240, 40));

        b2.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        b2.setText("P2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel2.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 240, 40));

        b3.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        b3.setText("P3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel2.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 40));

        b4.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        b4.setText("P4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel2.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 240, 40));

        b5.setFont(new java.awt.Font("Marcellus SC", 1, 18)); // NOI18N
        b5.setText("P5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel2.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 240, 40));

        jButton4.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 120, 40));
        jButton4.getAccessibleContext().setAccessibleName("BACK");

        jLabel1.setFont(new java.awt.Font("Century Schoolbook", 1, 24)); // NOI18N
        jLabel1.setText("PRODUCT:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        photo.setBackground(new java.awt.Color(255, 255, 255));
        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/g9.jpg"))); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 260, 260));

        Area.setEditable(false);
        Area.setColumns(20);
        Area.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 710, 450));

        shop.setFont(new java.awt.Font("Bauhaus 93", 0, 36)); // NOI18N
        shop.setForeground(new java.awt.Color(255, 255, 255));
        shop.setText("ONLINE SHOPPING APP");
        shop.setToolTipText("");
        jPanel2.add(shop, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, -1));

        background9.setBackground(new java.awt.Color(0, 0, 0));
        background9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/t1-1.jpg"))); // NOI18N
        jPanel2.add(background9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 60));

        box.setFont(new java.awt.Font("Marcellus SC", 0, 18)); // NOI18N
        box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gym Equipment", "Rice Cooker", "Refrigerator", "Vehicle" }));
        box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxActionPerformed(evt);
            }
        });
        jPanel2.add(box, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 220, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("PICTURE OF PRODUCT :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("LIST OF PRODUCT");

        go.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        go.setText("GO TO CART");
        go.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goActionPerformed(evt);
            }
        });
        jPanel2.add(go, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 471, 530, 40));

        exit.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 100, 40));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 122, 1300, 5));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("LIST OF PRODUCT :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1300, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(Register.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx-x,yy-y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(evt.getSource()==jButton4){
            this.dispose();
            Register info = new Register();
            info.setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        if (evt.getSource()== b1){
            
            if(b1.getText().equals("Treadmill")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/a1.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data= "****************************************************************************************\n" +
                "                                   ~~ TREADMILL ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : NORDICTRACK\n" +
                " COLOR      : black\n" +
                " PRICE      : RM 2000.00\n" +
                " PATTERN    : foldable\n\n" +
                " ~~ INFO ~~\n" +
                " INTRO      : A device with a moving belt for walks, runs while staying same place.\n" +
                " FUNCTION   : can help to lose weight and build strength.\n" +
                " 1. Suitable for beginners.\n" +
                " 2. Involves cardiovascular system and the full body.\n" +
                " 3. Display speed, time, mileage, calories burned, and heart rate.\n" +
                " 4. Has adjustable incline levels.\n\n" +
                " ~~ WORK OUT STEP ~~\n" +
                " POWER ON !\n" +
                " POWER OFF !\n" +
                " SPEED UP !\n" +
                " SPEED DOWN !";
                Area.setText(data);
            }
            else if(b1.getText().equals("Classic Electric")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/El.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data2= "****************************************************************************************\n" +
                "                            ~~ Classic Electric Rice Cooker ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : TEFAL\n" +
                " PRICE      : RM 120.00\n\n" +
                " ~~ FUNCTION//FEARTURE ~~\n" +
                " 1. Cook plain rice\n" +
                " 2. Heat Retention\n" +
                " 3. Internal pot (Removable)\n" +
                " 4. Rice cooker surface (Non-sticky)\n";
                                
                Area.setText(data2);
            }
            else if(b1.getText().equals("French Door")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/r1.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(160, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data2= "****************************************************************************************\n" +
                "                              ~~ French Door Refrigerator ~~\n" +
                "****************************************************************************************\n" +
                " BRAND          : TOSHIBA\n" +
                " PRICE          : RM 4399.00\n" +
                " NUMBER OF DOOR : MORE THAN 2\n\n" +
                " ~~ FUNCTION ~~\n" +
                " 1. Making Ais\n" +
                " 2. Help food stay fresh longer\n\n" +
                " ~~ SPECIAL OF FRENCH DOOR REFRIGERATOR ~~\n" +
                " 1. Large capacity\n" +
                " 2. Some of this refrigerator has Wi-Fi capable screen on the door\n" +
                " 3. Some of this refrigerator has coffeemaker in the door\n";
                                
                Area.setText(data2);
            }
            else if(b1.getText().equals("AUDI A1")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/Audi.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(270, 152, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data4= "****************************************************************************************\n" +
                "                                     ~~ AUDI A1 ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : AUDI\n" +
                " PRICE      : RM 179900.00\n\n" +
                " ~~ INFO ~~\n" +
                " 1. Engine Tech   : 16-valve DOHC, turbocharged with variable valve timing, \n" +
                "                    direct fuel injection\n" +
                " 2. Capacity      : 1390 cc\n" +
                " 3. Power         : 122 hp at 5,000 rpm\n" +
                " 4. Bore x Stroke : 76.5mm x 75.6mm\n";
                                
                Area.setText(data4);
            }   
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        if (evt.getSource()== b2){
            
            if(b2.getText().equals("Stationary Bike")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/B.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data= "****************************************************************************************\n" +
                "                                ~~ Stationary Bike ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : EXERPEUTIC\n" +
                " COLOR      : silver\n" +
                " PRICE      : RM 800.00\n" +
                " PATTERN    : foldable\n\n" +
                " ~~ INFO ~~\n" +
                " INTRO      : A device used as bicycle without wheels but has a saddle and pedals.\n" +
                " FUNCTION   : can help to lose weight and build strength.\n" +
                " 1. Suitable for beginners.\n" +
                " 2. Involves cardiovascular system and the lower body.\n" +
                " 3. Display speed, time, mileage, calories burned, and heart rate.\n" +
                " 4. Has adjustable tension levels, seat levels and pedal straps.\n" +
                " 5. Has hand pulse sensors for monitoring target heart rate.\n\n" +
                " ~~ WORK OUT STEP ~~\n" +
                " STEP RIGHT PEDAL !\n" +
                " STEP LEFT PEDAL !\n" +
                " LEVEL UP !\n" +
                " LEVEL DOWN !";
            
                Area.setText(data);
            }
            else if(b2.getText().equals("Gas")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/Gas.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data2= "****************************************************************************************\n" +
                "                                ~~ Gas Rice Cooker ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : PANASONIC\n" +
                " PRICE      : RM 480.00\n\n" +
                " ~~ Functions//Features ~~\n" +
                " 1. Cook plain rice\n" +
                " 2. Heat Retention \n" +
                " 3. Heat setting (Automatic two-stage burner)\n" +
                " 4. Simmer (Automatically turn on)\n" +
                " 5. Uses material (natural gas // propane)\n";
                            
                Area.setText(data2);
            }
            else if(b2.getText().equals("Side By Side")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/r2.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(145, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data3= "****************************************************************************************\n" +
                "                              ~~ Side By Side Refrigerator~~\n" +
                "****************************************************************************************\n" +
                " BRAND          : SHARP\n" +
                " PRICE          : RM 2759.00\n" +
                " NUMBER OF DOOR : 2\n\n" +
                " ~~ FUNCTION ~~\n" +
                " 1. Making Ais\n" +
                " 2. Help food stay fresh longer\n\n" +
                " ~~ SPECIAL OF FRENCH DOOR REFRIGERATOR ~~\n" +
                " 1. Some of this refrigerator has exterior ice and water dispenser in the door\n";
                                                            
                Area.setText(data3);
            }
            else if(b2.getText().equals("BMW M850i")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/BMW.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(310, 174, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data4= "****************************************************************************************\n" +
                "                                   ~~ BMW M850i ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : BMW\n" +
                " PRICE      : RM 1088800.00\n\n" +
                " ~~ INFO ~~\n" +
                " 1. Engine Tech   : 32-valve DOHC, twin-turbo with variable valve timing,\n" +
                "                    direct fuel injection\n" +
                " 2. Capacity      : 4395 cc\n" +
                " 3. Power         : 530 hp at 5,500 rpm\n" +
                " 4. Bore x Stroke : 88.3mm x 89mm\n";
                            
                Area.setText(data4);
            }            
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        if (evt.getSource()== b3){
            
            if(b3.getText().equals("Incline Bench Press")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/c2.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(255, 356, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data= "****************************************************************************************\n" +
                "                               ~~ INCLINE BENCH PRESS ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : BODY CHAMP\n" +
                " COLOR      : dark grey\n" +
                " PRICE      : RM 400.00\n\n" +
                " ~~ INFO ~~\n" +
                " INTRO      : A device for trainee presses a weight upwards while lying on a bench.\n" +
                " FUNCTION   : can help to muscular chest, triceps, deltoids and build strength.\n" +
                " 1. Suitable for intermediate.\n" +
                " 2. Involves strength training system and the upper body.\n" +
                " 3. Has adjustable backrest, weight racks and squat rack.\n\n" +
                " ~~ WORK OUT STEP ~~\n" +
                " WEIGHT UP !\n" +
                " LIFT UP !\n" +
                " LIFT DOWN !\n" +
                " WEIGHT DOWN !";
                   
                Area.setText(data);
            }
            else if(b3.getText().equals("Micro-computerized")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/Mi.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data2= "****************************************************************************************\n" +
                "                          ~~ Micro-computerized Rice Cooker ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : TEFAL\n" +
                " PRICE      : RM 400.00\n\n" +
                " ~~ FUNCTION//FEARTURE ~~\n" +
                " 1. Cook plain rice\n" +
                " 2. Heat Retention\n" +
                " 3. Adjust timer\n" +
                " 4. Rice cooking function \n" +
                "     - Expert rice \n" +
                "     - Quick rice\n" +
                " 5. Other function \n" +
                "     - Cook brown rice\n" +
                "     - Cook porridge\n" +
                "     - Cook soup\n" +
                "     - Bake cake\n" +
                " 6. Other cooking mode \n" +
                "     - Steaming \n" +
                "     - Stewing\n";
                                
                Area.setText(data2);
            }
            else if(b3.getText().equals("Top Mount")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/r3.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(173, 300, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data3= "****************************************************************************************\n" +
                "                             ~~ Top Mount Refrigerator ~~\n" +
                "****************************************************************************************\n" +
                " BRAND          : SAMSUNG\n" +
                " PRICE          : RM 999.00\n" +
                " NUMBER OF DOOR : 2\n\n" +
                " ~~ FUNCTION ~~\n" +
                " 1. Making Ais\n" +
                " 2. Help food stay fresh longer\n\n" +
                " ~~ SPECIAL OF FRENCH DOOR REFRIGERATOR ~~\n" +
                " 1. Cheaper\n" +
                " 2. The top compartment is the freezer\n" +
                " 3. The lower compartment is for fresh food\n" +
                " 4. Top Mount Refrigerator are the most common type of refrigerator\n";
                                                               
                Area.setText(data3);
            }
            else if(b3.getText().equals("HONDA CIVIC")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/HondaC.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(265, 141, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data4= "****************************************************************************************\n" +
                "                                  ~~ HONDA CIVIC ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : HONDA\n" +
                " PRICE      : RM 330002.00\n\n" +
                " ~~ INFO ~~\n" +
                " 4. Engine Tech   : 16-valve DOHC, turbocharged with variable valve timing\n" +
                " 3. Capacity      : 1996 cc\n" +
                " 2. Power         : 306 hp at 6,500 rpm\n" +
                " 1. Bore x Stroke : 86mm x 85.9mm\n";
                                
                Area.setText(data4);
            }
        }           
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        if (evt.getSource()== b4){
            
            if(b4.getText().equals("Dumbbells Set")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/F1.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(260, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data= "****************************************************************************************\n" +
                "                                  ~~ DUMBBELLS SET ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : BOWFLEX\n" +
                " COLOR      : red\n" +
                " PRICE      : RM 400.00\n" +
                " SHAPE      : roman letters I\n" +
                " SIZE       : small\n\n" +  
                " ~~ INFO ~~\n" +
                " INTRO      : A short bar with weights on either side.\n" +
                " FUNCTION   : can help to lose weight and build strength.\n" +
                " 1. Suitable for beginners.\n" +
                " 2. Used individually or in pairs\n" +
                " 3. Involves strength training and the upper body.\n" +
                " 4. Has adjustable dumbbells with differing weights.\n\n" +
                " ~~ WORK OUT STEP ~~\n" +
                " WEIGHT UP !\n" +
                " LIFT UP !\n" +
                " LIFT DOWN !\n" +
                " WEIGHT DOWN !";

                Area.setText(data);
            }
            else if(b4.getText().equals("Bottom Mount")){
                
                 ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/r4.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(165, 260, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data2= "****************************************************************************************\n" +
                "                           ~~ Bottom Mount Refrigerator ~~\n" +
                "****************************************************************************************\n" +
                " BRAND          : SAMSUNG\n" +
                " PRICE          : RM 1699.00\n" +
                " NUMBER OF DOOR : 2\n\n" +
                " ~~ FUNCTION ~~\n" +
                " 1. Making Ais\n" +
                " 2. Help food stay fresh longer\n\n" +
                " ~~ SPECIAL OF FRENCH DOOR REFRIGERATOR ~~\n" +
                " 1. The top compartment is for fresh food\n" +
                " 2. The lower compartment is the freezer\n";
                                                
                Area.setText(data2);
            }
            else if(b4.getText().equals("MAZDA BIANTE")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/MazdaB.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(280, 186, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data3= "****************************************************************************************\n" +
                "                                  ~~ MAZDA BIANTE ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : MAZDA\n" +
                " PRICE      : RM 145719.00\n\n" +
                " ~~ INFO ~~\n" +
                " 1. Engine Tech   : 16-valve DOHC, naturally-aspirated with variable valve timing,\n" +
                "                    direct fuel injection\n" +
                " 2. Capacity      : 1998 cc\n" +
                " 3. Power         : 149 hp at 6,000 rpm\n" +
                " 4. Bore x Stroke : 83.5mm x 91.2mm\n";
                
                Area.setText(data3);
            }
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        if (evt.getSource()== b5){
            
            if(b5.getText().equals("Barbells Set")){
                
                ImageIcon imageIcon = new javax.swing.ImageIcon(getClass().getResource("/project/E.jpg"));
                Image image = imageIcon.getImage();
                Image newimg = image.getScaledInstance(255, 356, java.awt.Image.SCALE_SMOOTH);
                imageIcon=new javax.swing.ImageIcon(newimg);
                photo.setIcon(imageIcon);
            
                String data= "****************************************************************************************\n" +
                "                                  ~~ BARBELLS SET ~~\n" +
                "****************************************************************************************\n" +
                " BRAND      : TECHNOGYM\n" +
                " COLOR      : black\n" +
                " PRICE      : RM 600.00\n" +
                " SHAPE      : roman letters I\n" +
                " SIZE       : big\n" +
                " ~~ INFO ~~\n" +
                " INTRO      : A long metal bar with varying weights are attached at each end.\n" +
                " FUNCTION   : can help to lose weight and build strength.\n" +
                " 1. Suitable for intermediate.\n" +
                " 2. Used in weight training, bodybuilding, weightlifting and powerlifting.\n" +
                " 3. Involves strength training and the upper body.\n" +
                " 4. Has adjustable weight.\n\n" +
                " ~~ WORK OUT STEP ~~\n" +
                " WEIGHT UP !\n" +
                " LIFT UP !\n" +
                " LIFT DOWN !\n" +
                " WEIGHT DOWN !";
            
                Area.setText(data);
            }
        }         
    }//GEN-LAST:event_b5ActionPerformed

    private void boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxActionPerformed
        
        String pp = box.getSelectedItem().toString();
        photo.setIcon(null);
        Area.setText("");

        switch(pp){

            case "Gym Equipment":
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(true);
                b1.setText("Treadmill");
                b2.setText("Stationary Bike");
                b3.setText("Incline Bench Press");
                b4.setText("Dumbbells Set");
                b5.setText("Barbells Set");
            break;

            case "Rice Cooker":
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(false);
                b5.setVisible(false);

                b1.setText("Classic Electric");
                b2.setText("Gas");
                b3.setText("Micro-computerized");
            break;

            case "Refrigerator":
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(false);

                b1.setText("French Door");
                b2.setText("Side By Side");
                b3.setText("Top Mount");
                b4.setText("Bottom Mount");
            break;

            case "Vehicle":
                b1.setVisible(true);
                b2.setVisible(true);
                b3.setVisible(true);
                b4.setVisible(true);
                b5.setVisible(false);
                
                b1.setText("AUDI A1");
                b2.setText("BMW M850i");
                b3.setText("HONDA CIVIC");
                b4.setText("MAZDA BIANTE");
            break;
        }
    }//GEN-LAST:event_boxActionPerformed

    private void goActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goActionPerformed
        this.setVisible(false);
        Cart info = new Cart();
        info.setVisible(true);
    }//GEN-LAST:event_goActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed
                                 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Area;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JLabel background9;
    private javax.swing.JComboBox<String> box;
    private javax.swing.JLabel close;
    private javax.swing.JButton exit;
    private javax.swing.JButton go;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel reForm;
    private javax.swing.JLabel shop;
    // End of variables declaration//GEN-END:variables
}
