package ui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MUHAMMAD SHAHZEB
 */
public class notify extends javax.swing.JFrame {

    /**
     * Creates new form notify
     */
    public notify() {
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

        rightpanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        logoutpanel1 = new javax.swing.JPanel();
        logoutbutton1 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rightpanel.setBackground(new java.awt.Color(0, 153, 153));
        rightpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Name");
        rightpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Select Class");
        rightpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 100, 80, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SMS", "E-mail", "Call" }));
        rightpanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 250, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Select ID");
        rightpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 80, -1));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 250, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("Reason");
        rightpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 80, -1));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 250, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("Notify via");
        rightpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 140, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("Guardian Name");
        rightpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 100, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 250, -1));

        logoutpanel1.setBackground(new java.awt.Color(0, 153, 153));
        logoutpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbutton1.setBackground(new java.awt.Color(0, 152, 152));
        logoutbutton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutbutton1.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton1.setText("Notify");
        logoutbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbutton1ActionPerformed(evt);
            }
        });
        logoutpanel1.add(logoutbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        rightpanel.add(logoutpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 210, 50));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSE 1A", "BCS 1A", "PHR 1A", "EEE 1A", "BSE 2A", "BCS 2A", "PHR 2A", "EEE 2A", "BSE 3A", "BCS 3A", "PHR 3A", "EEE 3A", "BSE 4A", "BCS 4A", "PHR 4A", "EEE 4A", "BSE 5A", "BCS 5A", "PHR 5A", "EEE 5A", "BSE 6A", "BCS 6A", "PHR 6A", "EEE 6A", "BSE 7A", "BCS 7A", "PHR 7A", "EEE 7A", "BSE 8A", "BCS 8A", "PHR 8A", "EEE 8A", "BSE 1B", "BCS 1B", "PHR 1B", "EEE 1B", "BSE 2B", "BCS 2B", "PHR 2B", "EEE 2B", "BSE 3B", "BCS 3B", "PHR 3B", "EEE 3B", "BSE 4B", "BCS 4B", "PHR 4B", "EEE 4B", "BSE 5B", "BCS 5B", "PHR 5B", "EEE 5B", "BSE 6B", "BCS 6B", "PHR 6B", "EEE 6B", "BSE 7B", "BCS 7B", "PHR 7B", "EEE 7B", "BSE 8B", "BCS 8B", "PHR 8B", "EEE 8B", "BSE 1C", "BCS 1C", "PHR 1C", "EEE 1C", "BSE 2C", "BCS 2C", "PHR 2C", "EEE 2C", "BSE 3C", "BCS 3C", "PHR 3C", "EEE 3C", "BSE 4C", "BCS 4C", "PHR 4C", "EEE 4C", "BSE 5C", "BCS 5C", "PHR 5C", "EEE 5C", "BSE 6C", "BCS 6C", "PHR 6C", "EEE 6C", "BSE 7C", "BCS 7C", "PHR 7C", "EEE 7C", "BSE 8C", "BCS 8C", "PHR 8C", "EEE 8C", "BSE 1D", "BCS 1D", "PHR 1D", "EEE 1D", "BSE 2D", "BCS 2D", "PHR 2D", "EEE 2D", "BSE 3D", "BCS 3D", "PHR 3D", "EEE 3D", "BSE 4D", "BCS 4D", "PHR 4D", "EEE 4D", "BSE 5D", "BCS 5D", "PHR 5D", "EEE 5D", "BSE 6D", "BCS 6D", "PHR 6D", "EEE 6D", "BSE 7D", "BCS 7D", "PHR 7D", "EEE 7D", "BSE 8D", "BCS 8D", "PHR 8D", "EEE 8D" }));
        rightpanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, -1));

        getContentPane().add(rightpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void logoutbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbutton1ActionPerformed

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
            java.util.logging.Logger.getLogger(notify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton logoutbutton1;
    private javax.swing.JPanel logoutpanel1;
    private javax.swing.JPanel rightpanel;
    // End of variables declaration//GEN-END:variables
}
