package UI;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author MUHAMMAD SHAHZEB
 */
public class checkattendance extends javax.swing.JFrame {

    /**
     * Creates new form checkattendance
     */
    public checkattendance() {
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

        sidepael = new javax.swing.JPanel();
        CApanel = new javax.swing.JPanel();
        CAbutton = new javax.swing.JButton();
        CApanel1 = new javax.swing.JPanel();
        CAbutton1 = new javax.swing.JButton();
        CApanel2 = new javax.swing.JPanel();
        CAbutton2 = new javax.swing.JButton();
        CApanel3 = new javax.swing.JPanel();
        CAbutton3 = new javax.swing.JButton();
        panelhome = new javax.swing.JPanel();
        buttonhome = new javax.swing.JButton();
        mapanel = new javax.swing.JPanel();
        mabutton = new javax.swing.JButton();
        SSpanel = new javax.swing.JPanel();
        SSbutton = new javax.swing.JButton();
        Ccpanel = new javax.swing.JPanel();
        CCbutton = new javax.swing.JButton();
        logoutpanel = new javax.swing.JPanel();
        logoutbutton = new javax.swing.JButton();
        sidepanel = new javax.swing.JPanel();
        crnamefield1 = new javax.swing.JTextField();
        newnamefield1 = new javax.swing.JTextField();
        crpasswordefield1 = new javax.swing.JTextField();
        newpasswordefield1 = new javax.swing.JTextField();
        cenamelabel = new javax.swing.JLabel();
        newnamelabel1 = new javax.swing.JLabel();
        crpassword1 = new javax.swing.JLabel();
        newpassword1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepael.setBackground(new java.awt.Color(0, 102, 102));
        sidepael.setRequestFocusEnabled(false);
        sidepael.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CApanel.setBackground(new java.awt.Color(0, 102, 102));
        CApanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        CApanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CAbutton.setBackground(new java.awt.Color(0, 101, 101));
        CAbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CAbutton.setForeground(new java.awt.Color(255, 255, 255));
        CAbutton.setText("Check Attendance");
        CAbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAbuttonActionPerformed(evt);
            }
        });
        CApanel.add(CAbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        CApanel1.setBackground(new java.awt.Color(0, 102, 102));
        CApanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        CApanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CAbutton1.setBackground(new java.awt.Color(0, 101, 101));
        CAbutton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CAbutton1.setForeground(new java.awt.Color(255, 255, 255));
        CAbutton1.setText("Check Attendance");
        CAbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAbutton1ActionPerformed(evt);
            }
        });
        CApanel1.add(CAbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        CApanel.add(CApanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 50));

        CApanel2.setBackground(new java.awt.Color(0, 102, 102));
        CApanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        CApanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CAbutton2.setBackground(new java.awt.Color(0, 101, 101));
        CAbutton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CAbutton2.setForeground(new java.awt.Color(255, 255, 255));
        CAbutton2.setText("Check Attendance");
        CAbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAbutton2ActionPerformed(evt);
            }
        });
        CApanel2.add(CAbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        CApanel3.setBackground(new java.awt.Color(0, 102, 102));
        CApanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        CApanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CAbutton3.setBackground(new java.awt.Color(0, 101, 101));
        CAbutton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CAbutton3.setForeground(new java.awt.Color(255, 255, 255));
        CAbutton3.setText("Check Attendance");
        CAbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAbutton3ActionPerformed(evt);
            }
        });
        CApanel3.add(CAbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        CApanel2.add(CApanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 280, 50));

        CApanel.add(CApanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 280, 50));

        sidepael.add(CApanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 50));

        panelhome.setBackground(new java.awt.Color(0, 102, 102));
        panelhome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        panelhome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonhome.setBackground(new java.awt.Color(0, 101, 101));
        buttonhome.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        buttonhome.setForeground(new java.awt.Color(255, 255, 255));
        buttonhome.setText("Home");
        buttonhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonhomeActionPerformed(evt);
            }
        });
        panelhome.add(buttonhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 100, -1));

        sidepael.add(panelhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 200, 50));

        mapanel.setBackground(new java.awt.Color(0, 102, 102));
        mapanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        mapanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mabutton.setBackground(new java.awt.Color(0, 101, 101));
        mabutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mabutton.setForeground(new java.awt.Color(255, 255, 255));
        mabutton.setText("Mark Attendance");
        mabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mabuttonActionPerformed(evt);
            }
        });
        mapanel.add(mabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        sidepael.add(mapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 210, 50));

        SSpanel.setBackground(new java.awt.Color(0, 102, 102));
        SSpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        SSpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SSbutton.setBackground(new java.awt.Color(0, 101, 101));
        SSbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SSbutton.setForeground(new java.awt.Color(255, 255, 255));
        SSbutton.setText("Search Student");
        SSbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSbuttonActionPerformed(evt);
            }
        });
        SSpanel.add(SSbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        sidepael.add(SSpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 210, 50));

        Ccpanel.setBackground(new java.awt.Color(0, 102, 102));
        Ccpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        Ccpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CCbutton.setBackground(new java.awt.Color(0, 101, 101));
        CCbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CCbutton.setForeground(new java.awt.Color(255, 255, 255));
        CCbutton.setText("Check Class");
        CCbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCbuttonActionPerformed(evt);
            }
        });
        Ccpanel.add(CCbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        sidepael.add(Ccpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 50));

        logoutpanel.setBackground(new java.awt.Color(0, 102, 102));
        logoutpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        logoutpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbutton.setBackground(new java.awt.Color(0, 101, 101));
        logoutbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(255, 255, 255));
        logoutbutton.setText("Logout");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        logoutpanel.add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, -1));

        sidepael.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 210, 50));

        getContentPane().add(sidepael, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 630));

        sidepanel.setBackground(new java.awt.Color(0, 153, 153));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        sidepanel.add(crnamefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 270, 30));
        sidepanel.add(newnamefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 270, 30));
        sidepanel.add(crpasswordefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 270, 30));
        sidepanel.add(newpasswordefield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 270, 30));

        cenamelabel.setBackground(new java.awt.Color(255, 255, 255));
        cenamelabel.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        cenamelabel.setText("Class ");
        sidepanel.add(cenamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, 30));

        newnamelabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        newnamelabel1.setText("Section");
        sidepanel.add(newnamelabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 60, 30));

        crpassword1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        crpassword1.setText("Student Name");
        sidepanel.add(crpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 120, 30));

        newpassword1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        newpassword1.setText("Registration");
        sidepanel.add(newpassword1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 110, 30));

        update.setBackground(new java.awt.Color(0, 153, 153));
        update.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Check");
        sidepanel.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 510, -1, -1));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 750, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbuttonActionPerformed

    private void CAbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton1ActionPerformed

    private void CAbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton2ActionPerformed

    private void CAbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton3ActionPerformed

    private void buttonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhomeActionPerformed
        // TODO add your handling code here:
        Dashboard d = new Dashboard();
        d.show();
        dispose();
    }//GEN-LAST:event_buttonhomeActionPerformed

    private void mabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mabuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mabuttonActionPerformed

    private void SSbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SSbuttonActionPerformed

    private void CCbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAbutton;
    private javax.swing.JButton CAbutton1;
    private javax.swing.JButton CAbutton2;
    private javax.swing.JButton CAbutton3;
    private javax.swing.JPanel CApanel;
    private javax.swing.JPanel CApanel1;
    private javax.swing.JPanel CApanel2;
    private javax.swing.JPanel CApanel3;
    private javax.swing.JButton CCbutton;
    private javax.swing.JPanel Ccpanel;
    private javax.swing.JButton SSbutton;
    private javax.swing.JPanel SSpanel;
    private javax.swing.JButton buttonhome;
    private javax.swing.JLabel cenamelabel;
    private javax.swing.JTextField crnamefield1;
    private javax.swing.JLabel crpassword1;
    private javax.swing.JTextField crpasswordefield1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JButton mabutton;
    private javax.swing.JPanel mapanel;
    private javax.swing.JTextField newnamefield1;
    private javax.swing.JLabel newnamelabel1;
    private javax.swing.JLabel newpassword1;
    private javax.swing.JTextField newpasswordefield1;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel sidepael;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
