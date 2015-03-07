/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;



/**
 *
 * @author Stephen 
 */
public class CardLayoutHolder extends javax.swing.JFrame {
       JPanel cardsContainer;
    /**
     * Creates new form AnalogCardHolder
     */
  
   
    public CardLayoutHolder() {
        initComponents();
       
         //declare and create objects
        
        //Welcome screen of the application goes here 
        
        // Is the main screen of the application
        MainMenuGUI mainCard = new  MainMenuGUI();
        
        // All of the screens in the analog section 
        AnalogGUIPanel screen1Card = new AnalogGUIPanel();
        AnalogHangmanPanel screen2Card = new AnalogHangmanPanel ();
        AnalogQuizGUIPanel screen3Card = new AnalogQuizGUIPanel();
        AnalogInformationGUIPanel screen4Card  = new  AnalogInformationGUIPanel();
        AnalogDiganosticGUIPanel screen5Card = new AnalogDiganosticGUIPanel();
        AnalogResistorCalcPanel screen6Card = new  AnalogResistorCalcPanel();
        
        
        //creates a variable which is new Panel with cardlayout 
        cardsContainer = new JPanel(new CardLayout());
        // adds the main screen to the container 
        cardsContainer.add(mainCard, "MAIN");
        
        //adds all of the analog cards(screens) to the contanier 
        cardsContainer.add(screen1Card,"AnalogMainScreen");
        cardsContainer.add(screen2Card, "AnalogHangmanScreen");
        cardsContainer.add(screen3Card, "AnalogQuizScreen");
        cardsContainer.add(screen4Card, "AnalogInfoScreen");
        cardsContainer.add(screen5Card, "AnalogDiagnosticScreen");
        cardsContainer.add(screen6Card, "AnalogCalcScreen");
        
        
        // add the cards container to the JFrame 
        this.setLayout(new FlowLayout());
        this.setSize(400,450);
        this.add(cardsContainer);
        java.awt.CardLayout cardlayout = (java.awt.CardLayout)(cardsContainer.getLayout());
        cardlayout.show(cardsContainer, "MAIN");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CardLayoutHolder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CardLayoutHolder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
