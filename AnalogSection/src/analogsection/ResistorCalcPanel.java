/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Sean
 */
public class ResistorCalcPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResistorCalcPanel
     */
    public ResistorCalcPanel() {
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

        frstnumLbl = new javax.swing.JLabel();
        secondcolorLbl = new javax.swing.JLabel();
        thridcolorLbl = new javax.swing.JLabel();
        toloeranceLbl = new javax.swing.JLabel();
        firstcolorLbl = new javax.swing.JTextField();
        secondcolorTf = new javax.swing.JTextField();
        thirdcolorLbl = new javax.swing.JTextField();
        toloeranceTf = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        frstnumLbl.setText("First color:");
        add(frstnumLbl);
        frstnumLbl.setBounds(10, 176, 90, 20);

        secondcolorLbl.setText("Second color:");
        add(secondcolorLbl);
        secondcolorLbl.setBounds(10, 240, 90, 30);

        thridcolorLbl.setText("Third color:");
        add(thridcolorLbl);
        thridcolorLbl.setBounds(10, 290, 90, 30);

        toloeranceLbl.setText("Toloerance:");
        add(toloeranceLbl);
        toloeranceLbl.setBounds(10, 340, 80, 30);

        firstcolorLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstcolorLblActionPerformed(evt);
            }
        });
        add(firstcolorLbl);
        firstcolorLbl.setBounds(110, 170, 110, 28);
        add(secondcolorTf);
        secondcolorTf.setBounds(110, 240, 110, 28);
        add(thirdcolorLbl);
        thirdcolorLbl.setBounds(110, 290, 110, 28);
        add(toloeranceTf);
        toloeranceTf.setBounds(110, 340, 110, 28);

        addBtn.setText("Calculate");
        add(addBtn);
        addBtn.setBounds(70, 379, 190, 50);
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 10, 400, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void firstcolorLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstcolorLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstcolorLblActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JTextField firstcolorLbl;
    private javax.swing.JLabel frstnumLbl;
    private javax.swing.JLabel secondcolorLbl;
    private javax.swing.JTextField secondcolorTf;
    private javax.swing.JTextField thirdcolorLbl;
    private javax.swing.JLabel thridcolorLbl;
    private javax.swing.JLabel toloeranceLbl;
    private javax.swing.JTextField toloeranceTf;
    // End of variables declaration//GEN-END:variables
}
