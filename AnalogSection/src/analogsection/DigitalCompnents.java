/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.LayoutManager;

/**
 *
 * @author Stephen 
 */
public class DigitalCompnents extends javax.swing.JPanel {

    /**
     * Creates new form HangmanGUIPanel
     */
    public DigitalCompnents() {
        initComponents();
        this.setSize(400,450);
        imageChangeLbl.setVisible(false);
        infochangeLbl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detailsLbl = new javax.swing.JLabel();
        infoLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        imageChangeLbl = new javax.swing.JLabel();
        infochangeLbl = new javax.swing.JLabel();
        exitbtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        detailsLbl.setBackground(new java.awt.Color(255, 255, 255));
        detailsLbl.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        detailsLbl.setForeground(new java.awt.Color(51, 153, 255));
        detailsLbl.setText("Details:");
        add(detailsLbl);
        detailsLbl.setBounds(10, 190, 110, 30);

        infoLbl.setFont(new java.awt.Font("Lucida Grande", 1, 10)); // NOI18N
        infoLbl.setText("A capacitor (originally known as a condenser) is a passive two-terminal  ");
        add(infoLbl);
        infoLbl.setBounds(10, 210, 380, 130);

        exitBtn.setBackground(new java.awt.Color(0, 153, 255));
        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(220, 390, 150, 40);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setText("Components");
        add(titleLbl);
        titleLbl.setBounds(140, 0, 150, 40);

        backBtn .setOpaque(false);
        backBtn .setContentAreaFilled(false);
        backBtn.setBorderPainted(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn);
        backBtn.setBounds(0, -1, 70, 40);

        nextBtn.setOpaque(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.setBorderPainted(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        add(nextBtn);
        nextBtn.setBounds(310, 0, 90, 40);

        imageChangeLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/transistor.gif"))); // NOI18N
        add(imageChangeLbl);
        imageChangeLbl.setBounds(90, 50, 280, 140);

        infochangeLbl.setText("is a semiconductor device used to amplify signals ");
        add(infochangeLbl);
        infochangeLbl.setBounds(10, 266, 380, 20);

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/exit.png"))); // NOI18N
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        add(exitbtn);
        exitbtn.setBounds(350, 50, 40, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/InformationGUI.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(-2, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "DigitalInformationScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        imageChangeLbl.setVisible(true);
        infochangeLbl.setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        imageChangeLbl.setVisible(false);
        infochangeLbl.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JLabel detailsLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel imageChangeLbl;
    private javax.swing.JLabel infoLbl;
    private javax.swing.JLabel infochangeLbl;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
