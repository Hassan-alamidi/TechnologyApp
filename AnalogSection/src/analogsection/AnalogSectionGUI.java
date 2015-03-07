/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Stephen Kearns
 */
public class AnalogSectionGUI extends javax.swing.JFrame {
     //variables
    private String anwser, question, userAns, sentance; 
    private  int correct, incorrect;
    private  boolean chckRightorWrong;
    JPanel cardsContainer;
    
     
    /**
     * Creates new form AnalogSectionGUI
     */
    public AnalogSectionGUI() {
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

        jPopupMenu1 = new javax.swing.JPopupMenu();
        QuizBtn = new javax.swing.JButton();
        HangmanBtn = new javax.swing.JButton();
        InformationBtn = new javax.swing.JButton();
        FormulasBtn = new javax.swing.JButton();
        ResistorCalcLbl = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        QuizBtn.setBackground(new java.awt.Color(0, 204, 102));
        QuizBtn.setText("Quiz");
        QuizBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuizBtnActionPerformed(evt);
            }
        });
        getContentPane().add(QuizBtn);
        QuizBtn.setBounds(130, 110, 166, 29);

        HangmanBtn.setBackground(new java.awt.Color(0, 102, 255));
        HangmanBtn.setText("Hangman");
        HangmanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HangmanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HangmanBtn);
        HangmanBtn.setBounds(70, 40, 156, 18);

        InformationBtn.setBackground(new java.awt.Color(255, 153, 0));
        InformationBtn.setText("Information");
        InformationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformationBtnActionPerformed(evt);
            }
        });
        getContentPane().add(InformationBtn);
        InformationBtn.setBounds(180, 200, 166, 21);

        FormulasBtn.setBackground(new java.awt.Color(0, 153, 153));
        FormulasBtn.setText("Diganostic");
        getContentPane().add(FormulasBtn);
        FormulasBtn.setBounds(160, 290, 166, 29);

        ResistorCalcLbl.setText("Resistor calculator");
        ResistorCalcLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResistorCalcLblActionPerformed(evt);
            }
        });
        getContentPane().add(ResistorCalcLbl);
        ResistorCalcLbl.setBounds(80, 380, 156, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/Sean/Pictures/AnalogGUI.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 410, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HangmanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HangmanBtnActionPerformed
        // TODO add your handling code here:
       LayoutManager layout = getParent().getLayout();
//        if (layout instanceof CardLayout) {
//            CardLayout cl = (CardLayout)layout;
//            cl.show(getParent(), "SCREEN1"); 
//        } 
        //instan the object
       /*  HangmanAnalog playHangman = new HangmanAnalog();
         
          sentance = playHangman.ChoseRandSentance();
            
            JOptionPane.showMessageDialog(null, sentance);
            
            for(int counter = 0; counter < 5; counter++){
                  userAns = JOptionPane.showInputDialog(null,"enter your gusee of the blank word");
                  playHangman.setUserAns(userAns);
                  
                  playHangman.AsignAnwsers();
                  
                 chckRightorWrong =  playHangman.compute();
                  
                  if(chckRightorWrong == true){
                      JOptionPane.showMessageDialog(null,"Congradulations you have gussed the word right");
                       break;
                     
                   }
                    else if(chckRightorWrong == false){
                         //this is where each time the user gusses the word wrong
                        // a frame of the animation will be called in 
                       // to simulate the the hanging of the man 
                        
                        //error checker 
                        System.out.println("incorrect gusse");
                    }
                
                }
         */
    }//GEN-LAST:event_HangmanBtnActionPerformed

    private void QuizBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuizBtnActionPerformed
        // TODO add your handling code here:
        
        //instan objects
        Quiz playQuiz = new Quiz();
        
        
       for(int counter = 0; counter < 10; counter++){
        
           //playQuiz.dontChoseExistQuestion();
           question = playQuiz.choseRandomeQuestion();
           
           anwser = JOptionPane.showInputDialog(null,"The Question is:" + " "+ question + "Please enter your anwser");
           playQuiz.setAnwser(anwser);
           
           playQuiz.compute();
       }
        
       correct = playQuiz.getCorrect();
       incorrect = playQuiz.getIncorrect();
       
       JOptionPane.showMessageDialog(null,"The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect);
          
    }//GEN-LAST:event_QuizBtnActionPerformed

    private void ResistorCalcLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResistorCalcLblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResistorCalcLblActionPerformed

    private void InformationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformationBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InformationBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AnalogSectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnalogSectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnalogSectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnalogSectionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnalogSectionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FormulasBtn;
    private javax.swing.JButton HangmanBtn;
    private javax.swing.JButton InformationBtn;
    private javax.swing.JButton QuizBtn;
    private javax.swing.JButton ResistorCalcLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
