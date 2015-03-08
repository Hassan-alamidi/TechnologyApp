/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JPanel;

/**
 *
 * @author Stephen kearns
 */
public class AnalogGUIPanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalogGUI
     */
 
    public AnalogGUIPanel() {
        initComponents();
        this.setSize(400,450);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HangmanBtn = new javax.swing.JButton();
        QuizBtn = new javax.swing.JButton();
        InfoBtn = new javax.swing.JButton();
        DiagnosticBtn = new javax.swing.JButton();
        CalcBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        HangmanBtn.setBackground(new java.awt.Color(0, 102, 204));
        HangmanBtn.setText("Hangman");
        HangmanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HangmanBtnActionPerformed(evt);
            }
        });
        add(HangmanBtn);
        HangmanBtn.setBounds(80, 50, 190, 29);

        QuizBtn.setBackground(new java.awt.Color(0, 102, 204));
        QuizBtn.setText("Quiz");
        QuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtnActionPerformed(evt);
            }
        });
        add(QuizBtn);
        QuizBtn.setBounds(160, 140, 170, 30);

        InfoBtn.setBackground(new java.awt.Color(0, 102, 204));
        InfoBtn.setText("Information");
        InfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoBtnActionPerformed(evt);
            }
        });
        add(InfoBtn);
        InfoBtn.setBounds(190, 210, 150, 29);

        DiagnosticBtn.setBackground(new java.awt.Color(0, 102, 204));
        DiagnosticBtn.setText("Diagnostic Tools");
        DiagnosticBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiagnosticBtnActionPerformed(evt);
            }
        });
        add(DiagnosticBtn);
        DiagnosticBtn.setBounds(170, 300, 160, 29);

        CalcBtn.setBackground(new java.awt.Color(0, 102, 204));
        CalcBtn.setText("Resistor value calculator");
        CalcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcBtnActionPerformed(evt);
            }
        });
        add(CalcBtn);
        CalcBtn.setBounds(100, 380, 190, 29);

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/exit.png"))); // NOI18N
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(360, 0, 40, 40);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/AnalogGUI2.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 410, 430);
    }// </editor-fold>//GEN-END:initComponents

    private void QuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogQuizScreen");
        }
    }//GEN-LAST:event_QuizBtnActionPerformed

    private void InfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogInfoScreen");
        }
    }//GEN-LAST:event_InfoBtnActionPerformed

    private void HangmanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HangmanBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogHangmanScreen");
        }
    }//GEN-LAST:event_HangmanBtnActionPerformed

    private void DiagnosticBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiagnosticBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogDiagnosticScreen");
        }
    }//GEN-LAST:event_DiagnosticBtnActionPerformed

    private void CalcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogCalcScreen");
        }
    }//GEN-LAST:event_CalcBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalcBtn;
    private javax.swing.JButton DiagnosticBtn;
    private javax.swing.JButton HangmanBtn;
    private javax.swing.JButton InfoBtn;
    private javax.swing.JButton QuizBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    // End of variables declaration//GEN-END:variables
}
