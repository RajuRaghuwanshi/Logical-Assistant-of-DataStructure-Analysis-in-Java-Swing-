/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ImgPanel;

import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 *
 * @author Hitendra
 */
public class testimg extends javax.swing.JPanel {

    /**
     * Creates new form testimg
     */
    Image im;
    public testimg() {
        initComponents();
    }

    public void paintComponent(Graphics g) {
        g.drawImage(im, 0, 0,117,143, this);
    }

    public void setImg(String path) {
        try {
            FileInputStream fi = new FileInputStream(path);
            im = ImageIO.read(fi);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "" + ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
