package MainPac;

import ActionPerformClasses.UserNotesClass;
import ActionPerformClasses.UserTestClass;
import java.awt.Point;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class OutlineLook extends javax.swing.JFrame {

    String heading[] = {"Ques No.", "Questions", "Answer"};
    DefaultTableModel df = new DefaultTableModel(heading, 0);
    int selectedrow;
    TakeTest taketest_obj;
    String[] answer;
    String[][] question;

    public OutlineLook() {
        initComponents();

    }

    public OutlineLook(String[][] question, String[] ans, TakeTest obj, String[] answer) {
        initComponents();

        this.taketest_obj = obj;
        this.answer = answer;
        this.question = question;
        String temp[] = new String[3];
        int i = 0;
        while (i < 10) {
            temp[0] = (i + 1) + "";
            temp[1] = question[i][0];
            temp[2] = ans[i];
            i++;
            df.addRow(temp);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Outline = new javax.swing.JTable();
        Outline.setModel(df);
        jLabel1 = new javax.swing.JLabel();

        jMenuItem1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        Outline.setAutoCreateRowSorter(true);
        Outline.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Outline.setModel(df);
        Outline.setEnabled(false);
        Outline.setRowHeight(30);
        Outline.setRowMargin(5);
        Outline.setSelectionBackground(new java.awt.Color(170, 186, 251));
        Outline.setUpdateSelectionOnSort(false);
        Outline.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OutlineMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Outline);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Out Look");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OutlineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OutlineMouseClicked

        Point p = evt.getPoint();
        selectedrow = Outline.rowAtPoint(p);
        if (evt.getModifiers() == 4) {
            Point pt = getMousePosition();

            jPopupMenu1.show(this, (int) pt.getX(), (int) pt.getY());
        }
        // JOptionPane.showMessageDialog(null, Outline.getValueAt(selectedrow, 0).toString() + Outline.getValueAt(selectedrow, 2).toString());
    }//GEN-LAST:event_OutlineMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked


    }//GEN-LAST:event_formMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        String option = Outline.getValueAt(selectedrow, 2).toString();
        taketest_obj.jLabel15.setText(Outline.getValueAt(selectedrow, 0).toString());
        taketest_obj.question_show.setText(this.question[selectedrow][0]);
        taketest_obj.option1.setText(this.question[selectedrow][1]);
        taketest_obj.option2.setText(this.question[selectedrow][2]);
        taketest_obj.option3.setText(this.question[selectedrow][3]);
        taketest_obj.option3.setText(this.question[selectedrow][4]);

        taketest_obj.temp = Integer.parseInt(Outline.getValueAt(selectedrow, 0).toString())-1;

        if (question[selectedrow][1].equalsIgnoreCase(option)) {
            taketest_obj.option1.setSelected(true);
        } else if (question[selectedrow][2].equalsIgnoreCase(option)) {
            taketest_obj.option2.setSelected(true);
        } else if (question[selectedrow][3].equalsIgnoreCase(option)) {
            taketest_obj.option3.setSelected(true);
        } else if (question[selectedrow][4].equalsIgnoreCase(option)) {
            taketest_obj.option4.setSelected(true);
        }

        if (Integer.parseInt(Outline.getValueAt(selectedrow, 0).toString()) == 1) {
            taketest_obj.previous.setSelected(false);
            taketest_obj.next.setSelected(true);
        } else if (Integer.parseInt(Outline.getValueAt(selectedrow, 0).toString()) == 10) {
            taketest_obj.previous.setSelected(true);
            taketest_obj.next.setSelected(false);
        } else {
            taketest_obj.previous.setSelected(true);
            taketest_obj.next.setSelected(true);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public void setQuestions() {

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
            java.util.logging.Logger.getLogger(OutlineLook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutlineLook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutlineLook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutlineLook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OutlineLook out = new OutlineLook();
                out.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Outline;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
