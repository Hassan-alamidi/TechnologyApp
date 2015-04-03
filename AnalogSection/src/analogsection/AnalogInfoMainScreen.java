/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import static analogsection.Information.infoType;

import java.awt.LayoutManager;

/**
 *
 * @author Stephen
 */

public class AnalogInfoMainScreen extends javax.swing.JPanel {

    /**
     * Creates new form AnalogInfoMainScreen
     */
    public AnalogInfoMainScreen() {
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

        exitBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/exit.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(360, 0, 40, 40);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/hom.png"))); // NOI18N
        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(0, 0, 50, 50);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Components");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(190, 210, 120, 29);

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setText("General Information");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(160, 139, 150, 30);

        jButton4.setBackground(new java.awt.Color(0, 153, 255));
        jButton4.setText("Analog Signals");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4);
        jButton4.setBounds(170, 300, 140, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/AnalogGUI2.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       

       // working 
        
        infoType = 1;
        int count = 0;
        //it retrives an array from the information class
        //and populates it with analog general questions
//        info = new String[]{"A capacitor stores and releases charge","Electrons are used in batteries","There are many different electronic signals","ADC are used to convert analog signals to digital repersentation","Resistors are like shiedls","Resistors are measured in ohms","breadbords are used for creating circuits","fgtd","ggffg","gfddrf"};
//        Information.setInfo(info);
        Information.InfoType(infoType);
//        Information.setCount(count);
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoScreen");
        }
        
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         
        infoType = 1;
        //it retrives an array from the information class
        //and populates it with analog general questions
//        info = new String[]{"A capacitor stores and releases charge","Electrons are used in batteries","There are many different electronic signals","ADC are used to convert analog signals to digital repersentation","Resistors are like shiedls","Resistors are measured in ohms","breadbords are used for creating circuits","fgtd","ggffg","gfddrf"};
//        Information.setInfo(info);
        Information.InfoType(infoType);
        
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogCompScreen");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogWavesScreen");
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}
