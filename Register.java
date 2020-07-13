package project;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {

    int x,y;
    
    public Register() {
        initComponents();
        confirm.setVisible(false);
        view.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        reForm = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        firstN = new javax.swing.JLabel();
        first = new javax.swing.JTextField();
        lastN = new javax.swing.JLabel();
        last = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        birthDate = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        phoneNo = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        address = new javax.swing.JLabel();
        addr = new javax.swing.JTextArea();
        email = new javax.swing.JLabel();
        ema = new javax.swing.JTextField();
        accept = new javax.swing.JCheckBox();
        reset = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        success = new javax.swing.JTextField();
        background2 = new javax.swing.JLabel();
        display = new javax.swing.JTextArea();
        view = new javax.swing.JButton();
        background2a = new javax.swing.JLabel();

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
        reForm.setText("REGISTRATION FORM");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 546, Short.MAX_VALUE)
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 30));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        firstN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        firstN.setText("First Name");
        jPanel2.add(firstN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 100, 30));

        first.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        jPanel2.add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 330, -1));

        lastN.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lastN.setText("Last Name");
        jPanel2.add(lastN, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 100, 30));

        last.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        jPanel2.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 330, -1));

        gender.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        gender.setText("Gender");
        jPanel2.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 30));

        genderGroup.add(male);
        male.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        male.setText("Male");
        jPanel2.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        genderGroup.add(female);
        female.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        female.setText("Female");
        jPanel2.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        birthDate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        birthDate.setText("Birth Date");
        jPanel2.add(birthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 30));

        date.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 180, -1));

        phoneNo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phoneNo.setText("Phone No");
        jPanel2.add(phoneNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 100, 30));

        phone.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 330, -1));

        address.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        address.setText("Address");
        jPanel2.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 30));

        addr.setColumns(20);
        addr.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        addr.setLineWrap(true);
        addr.setRows(5);
        jPanel2.add(addr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 330, 60));

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setText("Email");
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 100, 30));

        ema.setFont(new java.awt.Font("Marcellus SC", 1, 14)); // NOI18N
        jPanel2.add(ema, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, 330, 30));

        accept.setBackground(new java.awt.Color(255, 255, 51));
        accept.setFont(new java.awt.Font("Century Schoolbook", 3, 14)); // NOI18N
        accept.setForeground(new java.awt.Color(255, 0, 0));
        accept.setText(" I accept terms and conditions !");
        jPanel2.add(accept, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 510, -1, -1));

        reset.setBackground(new java.awt.Color(255, 204, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, -1, -1));

        submit.setBackground(new java.awt.Color(0, 0, 0));
        submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel2.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 120, 40));

        confirm.setBackground(new java.awt.Color(0, 0, 0));
        confirm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        confirm.setForeground(new java.awt.Color(255, 255, 255));
        confirm.setText("CONFIRM");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel2.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        success.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        success.setForeground(new java.awt.Color(255, 0, 0));
        success.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        success.setBorder(null);
        jPanel2.add(success, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 290, -1));

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/b5.jpg"))); // NOI18N
        jPanel2.add(background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 0, 440, 670));

        display.setEditable(false);
        display.setColumns(20);
        display.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        display.setLineWrap(true);
        display.setRows(5);
        jPanel2.add(display, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 10, 350, 330));

        view.setBackground(new java.awt.Color(255, 255, 51));
        view.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        view.setText("View Product");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jPanel2.add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 150, 30));

        background2a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/b7.png"))); // NOI18N
        jPanel2.add(background2a, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 0, 372, 670));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 820, 674));

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

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        
        String ch = evt.getActionCommand();
        if("SUBMIT".equals(ch)){
            if(accept.isSelected()){
                String f = first.getText();
                String l = last.getText();
                String g = "Male";
                if(female.isSelected()){
                    g = "Female";
                }
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                String d = df.format(date.getDate());
                String p = phone.getText();
                String a = addr.getText();
                String e = ema.getText();
                
                display.setText("\n Last Name\t: "+l+"\n First Name\t: "+f+
                                "\n Full Name\t: "+l+" "+f+"\n Gender\t: "+g+
                                "\n Birth Date\t: "+d+"\n Phone No\t: "+p+
                                "\n Email\t: "+e+"\n Address\t: "+a);
                JOptionPane.showMessageDialog(null, "Please Press the confirm button for confirmation !");
                confirm.setVisible(true);    
                
            }else{
                JOptionPane.showMessageDialog(null,"Please Agree Our Terms and Conditions!","Register Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_submitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        view.setVisible(false);
        confirm.setVisible(false);
        success.setVisible(false);
        first.setText(null);
        last.setText(null);
        genderGroup.clearSelection();
        date.setDate(null);
        phone.setText(null);
        addr.setText(null);
        ema.setText(null);
        accept.setSelected(false);
        display.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        
        this.setVisible(false);
        Menu info = new Menu();
        info.setVisible(true);
    }//GEN-LAST:event_viewActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed

        if(evt.getSource()==confirm){
            FileWriter writer = null;
            try {
                String dd = display.getText();
                writer = new FileWriter("/Users/Auntie Goh/Desktop/Filetxt/register form.txt");
                writer.write(dd);
                writer.close();
                JOptionPane.showMessageDialog(null, "Register Successfully !");
                success.setText("Register Successfully !");
                view.setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    writer.close();
                } catch (IOException ex) {
                    Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }else{
            success.setText("");
        }
    }//GEN-LAST:event_confirmActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox accept;
    private javax.swing.JTextArea addr;
    private javax.swing.JLabel address;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel background2a;
    private javax.swing.JLabel birthDate;
    private javax.swing.JLabel close;
    private javax.swing.JButton confirm;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextArea display;
    private javax.swing.JTextField ema;
    private javax.swing.JLabel email;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField first;
    private javax.swing.JLabel firstN;
    private javax.swing.JLabel gender;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField last;
    private javax.swing.JLabel lastN;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneNo;
    private javax.swing.JLabel reForm;
    private javax.swing.JButton reset;
    private javax.swing.JButton submit;
    private javax.swing.JTextField success;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
