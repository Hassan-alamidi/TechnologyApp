/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.LayoutManager;
/**
 *
 * @author John
 */
public class WhatsItMadeOfPanel extends javax.swing.JPanel {

    /**
     * Creates new form WhatsItMadeOfPanel
     */
    public WhatsItMadeOfPanel() {
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

        TitleLbl = new javax.swing.JLabel();
        BabkNextLbl = new javax.swing.JLabel();
        BackgroundLbl = new javax.swing.JLabel();
        MenuBtn = new javax.swing.JButton();

        setLayout(null);

        TitleLbl.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("This is the section for the \"Whats it made of\"");
        add(TitleLbl);
        TitleLbl.setBounds(60, 30, 316, 20);

        BabkNextLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\resize.png")); // NOI18N
        BabkNextLbl.setText("jLabel3");
        add(BabkNextLbl);
        BabkNextLbl.setBounds(140, 220, 120, 105);

        BackgroundLbl.setIcon(new javax.swing.ImageIcon("C:\\Users\\John\\Desktop\\Wood-Background-Texture-452x336.jpg")); // NOI18N
        add(BackgroundLbl);
        BackgroundLbl.setBounds(0, 0, 450, 330);

        MenuBtn.setText("Main menu");
        MenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBtnActionPerformed(evt);
            }
        });
        add(MenuBtn);
        MenuBtn.setBounds(150, 260, 120, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBtnActionPerformed
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "WoodMainScreen");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_MenuBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BabkNextLbl;
    private javax.swing.JLabel BackgroundLbl;
    private javax.swing.JButton MenuBtn;
    private javax.swing.JLabel TitleLbl;
    // End of variables declaration//GEN-END:variables

} // fixed error Stephen 
