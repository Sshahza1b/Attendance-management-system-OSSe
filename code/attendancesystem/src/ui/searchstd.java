package UI;







public class searchstd extends javax.swing.JFrame {

    
    public searchstd() {
        initComponents();
    }

    Dashboard d = new Dashboard();
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
        logoutpanel = new javax.swing.JPanel();
        logoutbutton = new javax.swing.JButton();
        panelhome = new javax.swing.JPanel();
        buttonhome = new javax.swing.JButton();
        mapanel = new javax.swing.JPanel();
        mabutton = new javax.swing.JButton();
        SSpanel = new javax.swing.JPanel();
        SSbutton = new javax.swing.JButton();
        Ccpanel = new javax.swing.JPanel();
        CCbutton = new javax.swing.JButton();
        rightpanel = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
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
        CApanel.add(CAbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

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

        sidepael.add(CApanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 260, 50));

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
        logoutpanel.add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        sidepael.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 280, 50));

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
        panelhome.add(buttonhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 160, -1));

        sidepael.add(panelhome, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 260, 50));

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
        mapanel.add(mabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        sidepael.add(mapanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 50));

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
        SSpanel.add(SSbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        sidepael.add(SSpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 260, 50));

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
        Ccpanel.add(CCbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, -1));

        sidepael.add(Ccpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 260, 50));

        getContentPane().add(sidepael, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 720));

        rightpanel.setBackground(new java.awt.Color(0, 153, 153));
        rightpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        rightpanel.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 250, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "001", "002", "003", "004", "005", "006", "007", "008", "009", "010", "011", "012", "013", "014", "015", "016", "017", "018", "019", "020" }));
        rightpanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 250, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("Student name");
        rightpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Student ID");
        rightpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"01", "Shahzaib", "Software Engineering", "FA21-BSE-034"},
                {"02", "Shamsa", "Software Engineering", "FA21-BSE-145"},
                {"03", "Aqsa", "Software Engineering", "FA21-BSE-079"},
                {"04", "Ahsan Zeb", "Software Engineering", "FA21-BSE-071"},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Student Name", "Department", "Registration"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        rightpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 217, 560, 450));

        getContentPane().add(rightpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 720, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbuttonActionPerformed

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
//         login L = new login();
//        L.show();
//        dispose();
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void buttonhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonhomeActionPerformed
        // TODO add your handling code here: 
        Dashboard d = new Dashboard();
        d.show();
        dispose();
    }//GEN-LAST:event_buttonhomeActionPerformed

    private void mabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mabuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mabuttonActionPerformed

    private void CAbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton1ActionPerformed

    private void CAbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton2ActionPerformed

    private void CAbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAbutton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAbutton3ActionPerformed

    private void SSbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSbuttonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_SSbuttonActionPerformed

    private void CCbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CCbuttonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JButton mabutton;
    private javax.swing.JPanel mapanel;
    private javax.swing.JPanel panelhome;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPanel sidepael;
    // End of variables declaration//GEN-END:variables
 
    
 }

