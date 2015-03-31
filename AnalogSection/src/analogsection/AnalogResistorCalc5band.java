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
public class AnalogResistorCalc5band extends javax.swing.JPanel {

    /**
     * Creates new form AnalogResistorCalc5band
     */
    public AnalogResistorCalc5band() {
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

        frstnumLbl = new javax.swing.JLabel();
        thridcolorLbl = new javax.swing.JLabel();
        Color1CB = new javax.swing.JComboBox();
        Color2CB = new javax.swing.JComboBox();
        secondcolorLbl = new javax.swing.JLabel();
        toloeranceLbl = new javax.swing.JLabel();
        Color3CB = new javax.swing.JComboBox();
        ToloeranceCB = new javax.swing.JComboBox();
        value5Lbl = new javax.swing.JLabel();
        Value5CB = new javax.swing.JComboBox();
        addBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        headingLbl = new javax.swing.JLabel();
        anwserLbl = new javax.swing.JLabel();
        typesCB = new javax.swing.JComboBox();
        TitleLbl = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        frstnumLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        frstnumLbl.setForeground(new java.awt.Color(255, 255, 255));
        frstnumLbl.setText("First color:");
        add(frstnumLbl);
        frstnumLbl.setBounds(20, 240, 90, 30);

        thridcolorLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        thridcolorLbl.setForeground(new java.awt.Color(255, 255, 255));
        thridcolorLbl.setText("Third color:");
        add(thridcolorLbl);
        thridcolorLbl.setBounds(280, 240, 90, 30);

        Color1CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        add(Color1CB);
        Color1CB.setBounds(10, 270, 101, 20);

        Color2CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        add(Color2CB);
        Color2CB.setBounds(140, 270, 101, 27);

        secondcolorLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        secondcolorLbl.setForeground(new java.awt.Color(255, 255, 255));
        secondcolorLbl.setText("Second color:");
        add(secondcolorLbl);
        secondcolorLbl.setBounds(140, 240, 90, 30);

        toloeranceLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        toloeranceLbl.setForeground(new java.awt.Color(255, 255, 255));
        toloeranceLbl.setText("Toloerance:");
        add(toloeranceLbl);
        toloeranceLbl.setBounds(280, 290, 80, 40);

        Color3CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White" }));
        add(Color3CB);
        Color3CB.setBounds(270, 270, 101, 27);

        ToloeranceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Brown", "Red", "Green", "Blue", "Violet", "Grey", "Gold", "Silver", "None" }));
        add(ToloeranceCB);
        ToloeranceCB.setBounds(270, 320, 94, 27);

        value5Lbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        value5Lbl.setForeground(new java.awt.Color(255, 255, 255));
        value5Lbl.setText("Fifth Value:");
        add(value5Lbl);
        value5Lbl.setBounds(20, 300, 80, 20);

        Value5CB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Black", "Brown", "Red", "Orange", "Yellow", "Green", "Blue", "Violet", "Grey", "White", " " }));
        add(Value5CB);
        Value5CB.setBounds(10, 320, 101, 27);

        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        addBtn.setForeground(new java.awt.Color(0, 102, 255));
        addBtn.setText("Calculate");
        add(addBtn);
        addBtn.setBounds(0, 420, 180, 30);

        ResetBtn.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(0, 102, 255));
        ResetBtn.setText("Reset");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });
        add(ResetBtn);
        ResetBtn.setBounds(230, 420, 170, 30);

        headingLbl.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        headingLbl.setForeground(new java.awt.Color(255, 255, 255));
        headingLbl.setText("Resistor Value:");
        add(headingLbl);
        headingLbl.setBounds(10, 350, 130, 30);

        anwserLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        anwserLbl.setForeground(new java.awt.Color(255, 255, 255));
        anwserLbl.setText(" = 365ohm");
        add(anwserLbl);
        anwserLbl.setBounds(90, 370, 270, 40);

        typesCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4 Band", "5 Band", "6 Band" }));
        typesCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typesCBItemStateChanged(evt);
            }
        });
        typesCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typesCBActionPerformed(evt);
            }
        });
        add(typesCB);
        typesCB.setBounds(290, 0, 110, 30);

        TitleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 19)); // NOI18N
        TitleLbl.setForeground(new java.awt.Color(255, 255, 255));
        TitleLbl.setText("Resistor value calculator ");
        add(TitleLbl);
        TitleLbl.setBounds(80, 0, 310, 30);

        exitBtn .setOpaque(false);
        exitBtn .setContentAreaFilled(false);
        exitBtn .setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(0, 0, 75, 30);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/Calc5band.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 610, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
        AnalogResistorCalcPanel reset = new AnalogResistorCalcPanel();
        anwserLbl.setText("");

    }//GEN-LAST:event_ResetBtnActionPerformed

    private void typesCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typesCBItemStateChanged
        // TODO add your handling code here:

        String selectedValue;
        selectedValue = typesCB.getSelectedItem().toString();

        if (selectedValue.equals("4 Band")) {
            //display 4 band screen

            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "AnalogCalcScreen");
            }
        } else if (selectedValue.equals("5 Band")) {
            //display 5 band screen
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "Analog5bandCalcScreen");
            }
        } else {
            //display 6 band screen
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
                java.awt.CardLayout cl = (java.awt.CardLayout) layout;
                cl.show(getParent(), "Analog6bandCalcScreen");
            }
        }
    }//GEN-LAST:event_typesCBItemStateChanged

    private void typesCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typesCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typesCBActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Color1CB;
    private javax.swing.JComboBox Color2CB;
    private javax.swing.JComboBox Color3CB;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel TitleLbl;
    private javax.swing.JComboBox ToloeranceCB;
    private javax.swing.JComboBox Value5CB;
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel anwserLbl;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel frstnumLbl;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel secondcolorLbl;
    private javax.swing.JLabel thridcolorLbl;
    private javax.swing.JLabel toloeranceLbl;
    private javax.swing.JComboBox typesCB;
    private javax.swing.JLabel value5Lbl;
    // End of variables declaration//GEN-END:variables
}