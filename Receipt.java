package project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Receipt extends javax.swing.JFrame {

    int x,y;
    public Receipt() {
        initComponents();
        cus.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        lsystem = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        wel = new javax.swing.JLabel();
        ex = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        display = new javax.swing.JTextArea();
        SS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        display1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        cus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/x3.jpg"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        lsystem.setFont(new java.awt.Font("Cambria", 3, 18)); // NOI18N
        lsystem.setForeground(new java.awt.Color(255, 255, 51));
        lsystem.setText("RECEIPT");

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
                .addComponent(lsystem, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mini, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lsystem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(mini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        wel.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        wel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wel.setText("~Have A Nice Day~");
        jPanel2.add(wel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 510, 440, 40));

        ex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ex.setText("EXIT");
        ex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exActionPerformed(evt);
            }
        });
        jPanel2.add(ex, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 500, 140, 40));

        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        display.setLineWrap(true);
        display.setRows(5);
        display.setBorder(null);
        jScrollPane1.setViewportView(display);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 820, 440));

        SS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SS.setText("SHOW");
        SS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSActionPerformed(evt);
            }
        });
        jPanel2.add(SS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 30));

        display1.setEditable(false);
        display1.setColumns(20);
        display1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        display1.setLineWrap(true);
        display1.setRows(5);
        jScrollPane2.setViewportView(display1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, 360, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/t.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, -1, -1));

        cus.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        cus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cus.setText("CUSTOMER's INFORMATION");
        jPanel2.add(cus, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1224, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(MyFrame.ICONIFIED);
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

    private void exActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exActionPerformed

    private void SSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSActionPerformed
            
                cus.setVisible(true);
        try {
                File file = new File("/Users/Auntie Goh/Desktop/Filetxt/purchasing form.txt");
                FileReader fr = new FileReader(file);
                display.read(fr,"display");
                
                File file1 = new File("/Users/Auntie Goh/Desktop/Filetxt/register form.txt");
                FileReader fr1 = new FileReader(file1);
                display1.read(fr1,"display1");

            } catch (IOException ex) {
                Logger.getLogger(Receipt.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_SSActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Receipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SS;
    private javax.swing.JLabel close;
    private javax.swing.JLabel cus;
    private javax.swing.JTextArea display;
    private javax.swing.JTextArea display1;
    private javax.swing.JButton ex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lsystem;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel wel;
    // End of variables declaration//GEN-END:variables
}
