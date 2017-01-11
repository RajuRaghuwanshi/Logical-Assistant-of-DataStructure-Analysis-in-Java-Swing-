package MainPac;

import ActionPerformClasses.UserNotesClass;
import ActionPerformClasses.UserTestClass;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitendra
 */
public class TakeTest extends javax.swing.JFrame {

    String testname;
    String usrname;
    String[][] Ques = new String[10][6];
    UserTestClass utc;
    UserNotesClass unc;
    String[][] get_test;
    String[] take_answer = new String[10];
    String[] test_info;
    int temp = 0;
    int x;
    boolean userdefine = false;

    public TakeTest() {
        initComponents();
    }

    public TakeTest(String name, String usrname) {
        initComponents();
        mainImg2.setImg("C:\\ProgramData\\DataStructure\\resource\\main.jpg");
        mainImg3.setImg("C:\\ProgramData\\DataStructure\\resource\\main.jpg");

        utc = new UserTestClass();
        unc = new UserNotesClass();

        tsstname.setText(name);
        this.testname = name;
        this.usrname = usrname;
        test_info = utc.getBasicTestData(this.testname);

        tsstname.setText(test_info[0]);
        jLabel12.setText(test_info[1]);
        jLabel13.setText(test_info[2]);
        jLabel14.setText(test_info[3]);

    }

    public TakeTest(String name, String usrname, int x) {
        initComponents();
        this.x = x;
        userdefine = true;
        mainImg2.setImg("C:\\ProgramData\\DataStructure\\resource\\main.jpg");
        mainImg3.setImg("C:\\ProgramData\\DataStructure\\resource\\main.jpg");

        utc = new UserTestClass();
        unc = new UserNotesClass();

        tsstname.setText(name);
        this.testname = name;
        this.usrname = usrname;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        mainImg2 = new ImgPanel.MainImg();
        jScrollPane1 = new javax.swing.JScrollPane();
        question_show = new javax.swing.JTextArea();
        option1 = new javax.swing.JRadioButton();
        option2 = new javax.swing.JRadioButton();
        option3 = new javax.swing.JRadioButton();
        option4 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        previous = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        testimg1 = new ImgPanel.testimg();
        jLabel15 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        mainImg3 = new ImgPanel.MainImg();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tsstname = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(5, 5, 0, 0));

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setDividerSize(10);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        mainImg2.setPreferredSize(new java.awt.Dimension(1300, 600));

        question_show.setColumns(20);
        question_show.setRows(5);
        jScrollPane1.setViewportView(question_show);

        buttonGroup1.add(option1);
        option1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option1.setText("jRadioButton1");
        option1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                option1MouseClicked(evt);
            }
        });

        buttonGroup1.add(option2);
        option2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option2.setText("jRadioButton2");
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option3);
        option3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option3.setText("jRadioButton3");
        option3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(option4);
        option4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        option4.setText("jRadioButton4");
        option4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("A.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("B.");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("C.");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("D.");

        next.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        next.setText("Next >>");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        previous.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        previous.setText("<< Previous");
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Q.");
        jLabel11.setOpaque(true);

        javax.swing.GroupLayout testimg1Layout = new javax.swing.GroupLayout(testimg1);
        testimg1.setLayout(testimg1Layout);
        testimg1Layout.setHorizontalGroup(
            testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 966, Short.MAX_VALUE)
        );
        testimg1Layout.setVerticalGroup(
            testimg1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 429, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("1");
        jLabel15.setOpaque(true);

        jButton3.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jButton3.setText("Outline >>");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainImg2Layout = new javax.swing.GroupLayout(mainImg2);
        mainImg2.setLayout(mainImg2Layout);
        mainImg2Layout.setHorizontalGroup(
            mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainImg2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(option1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainImg2Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(option3, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainImg2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mainImg2Layout.createSequentialGroup()
                                .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(next))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainImg2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(option4, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainImg2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 808, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(testimg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainImg2Layout.setVerticalGroup(
            mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(option2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(option3))
                .addGap(18, 18, 18)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(option4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainImg2Layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(previous)
                        .addComponent(next)))
                .addContainerGap())
            .addGroup(mainImg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(testimg1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(mainImg2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Test Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("No of Question");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Maximam Marks");
        jLabel3.setOpaque(true);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Total Time");

        tsstname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tsstname.setText("jLabel5");
        tsstname.setOpaque(true);

        jToggleButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jToggleButton1.setText("Start >>");
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("10");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("20 ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("10:00 ");

        javax.swing.GroupLayout mainImg3Layout = new javax.swing.GroupLayout(mainImg3);
        mainImg3.setLayout(mainImg3Layout);
        mainImg3Layout.setHorizontalGroup(
            mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(tsstname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(44, 44, 44)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainImg3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainImg3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
        );
        mainImg3Layout.setVerticalGroup(
            mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainImg3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(tsstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainImg3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jToggleButton1)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(mainImg3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 968, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 531, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        if (jToggleButton1.getText().toString().equalsIgnoreCase("submit")) {

            if (JOptionPane.showConfirmDialog(null, "Warning", "Are you sure !", JOptionPane.YES_NO_OPTION) == 0) {
                int temp1 = 0;
                String[] ans = new String[10];

                for (int i = 0; i < 10; i++) {
                    ans[i] = get_test[i][5].equalsIgnoreCase("A") ? get_test[i][1] : get_test[i][5].equalsIgnoreCase("B") ? get_test[i][2] : get_test[i][5].equalsIgnoreCase("C") ? get_test[i][3] : get_test[i][5].equalsIgnoreCase("D") ? get_test[i][4] : null;
                    if (ans[i].equalsIgnoreCase(take_answer[i])) {
                        ++temp1;
                    }
                }
                new ResultFrame(this.usrname, this.testname, Integer.parseInt(test_info[1]), temp1).setVisible(true);
            }
        }
        get_test = utc.getTestData(tsstname.getText(), userdefine, unc);

        jLabel15.setText((temp + 1) + "");
        question_show.setText(get_test[0][0]);
        option1.setText(get_test[0][1]);
        option2.setText(get_test[0][2]);
        option3.setText(get_test[0][3]);
        option4.setText(get_test[0][4]);

        if (option1.isSelected()) {
            take_answer[0] = option1.getText();
        } else if (option2.isSelected()) {
            take_answer[0] = option2.getText();
        } else if (option3.isSelected()) {
            take_answer[0] = option3.getText();
        } else if (option3.isSelected()) {
            take_answer[0] = option4.getText();
        }
        next.setEnabled(true);
        previous.setEnabled(false);
        jButton3.setEnabled(false);

        jToggleButton1.setText("Submit");

    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed

        ++temp;
        if (take_answer[temp] == null) {
            buttonGroup1.clearSelection();
        } else {
            if (get_test[temp][1].equalsIgnoreCase(take_answer[temp])) {
                option1.setSelected(true);
            } else if (get_test[temp][2].equalsIgnoreCase(take_answer[temp])) {
                option2.setSelected(true);
            } else if (get_test[temp][3].equalsIgnoreCase(take_answer[temp])) {
                option3.setSelected(true);
            } else if (get_test[temp][4].equalsIgnoreCase(take_answer[temp])) {
                option4.setSelected(true);
            }
        }

        jLabel15.setText((temp + 1) + "");
        if (temp == (Integer.parseInt(test_info[1]) - 1)) {
            next.setEnabled(false);
            jButton3.setEnabled(true);

        }

        question_show.setText(get_test[temp][0]);
        option1.setText(get_test[temp][1]);
        option2.setText(get_test[temp][2]);
        option3.setText(get_test[temp][3]);
        option4.setText(get_test[temp][4]);

        previous.setEnabled(true);
    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed

        --temp;
        if (temp == 0) {
            previous.setEnabled(false);
        }
        if (temp < Integer.parseInt(jLabel12.getText().trim())) {
            next.setEnabled(true);
        }

        if (get_test[temp][1].equalsIgnoreCase(take_answer[temp])) {
            option1.setSelected(true);
        } else if (get_test[temp][2].equalsIgnoreCase(take_answer[temp])) {
            option2.setSelected(true);
        } else if (get_test[temp][3].equalsIgnoreCase(take_answer[temp])) {
            option3.setSelected(true);
        } else if (get_test[temp][4].equalsIgnoreCase(take_answer[temp])) {
            option4.setSelected(true);
        } else {
            buttonGroup1.clearSelection();
        }

        jLabel15.setText((temp + 1) + "");

        question_show.setText(get_test[temp][0]);
        option1.setText(get_test[temp][1]);
        option2.setText(get_test[temp][2]);
        option3.setText(get_test[temp][3]);
        option4.setText(get_test[temp][4]);

    }//GEN-LAST:event_previousActionPerformed


    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        new OutlineLook(get_test, take_answer, this, take_answer).setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void option1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_option1MouseClicked

        this.take_answer[temp] = option1.getText();
    }//GEN-LAST:event_option1MouseClicked

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
        this.take_answer[temp] = option2.getText();
    }//GEN-LAST:event_option2ActionPerformed

    private void option3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option3ActionPerformed
        // TODO add your handling code here:
        this.take_answer[temp] = option3.getText();
    }//GEN-LAST:event_option3ActionPerformed

    private void option4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option4ActionPerformed
        // TODO add your handling code here:
        this.take_answer[temp] = option4.getText();
    }//GEN-LAST:event_option4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void QuesInitialize() {

    }

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
            java.util.logging.Logger.getLogger(TakeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTest().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    protected javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    protected javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private ImgPanel.MainImg mainImg2;
    private ImgPanel.MainImg mainImg3;
    protected javax.swing.JButton next;
    protected javax.swing.JRadioButton option1;
    protected javax.swing.JRadioButton option2;
    protected javax.swing.JRadioButton option3;
    protected javax.swing.JRadioButton option4;
    protected javax.swing.JButton previous;
    protected javax.swing.JTextArea question_show;
    protected ImgPanel.testimg testimg1;
    private javax.swing.JLabel tsstname;
    // End of variables declaration//GEN-END:variables
}
