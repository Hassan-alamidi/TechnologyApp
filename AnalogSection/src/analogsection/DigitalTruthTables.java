/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;


import java.awt.LayoutManager;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Hassan
 */
public class DigitalTruthTables extends javax.swing.JPanel {
    //declare variables
    protected int gate;
    protected ImageIcon ImgDisplayedLbl;
    protected BufferedImage Img;
    protected URL url;
    protected int input1;
    protected int input2;
    LogicGateSim logic = new LogicGateSim();
  
   //initilizing 
    public DigitalTruthTables() {
        initComponents();
        this.setSize(400,450);
       gate = 0;
       input1tgbtn.setVisible(false);
       input2tgbtn.setVisible(false);
       Outputlbl.setVisible(false);
       Img = null;
       url = null;
       input1 = 0;
       input2 = 0;
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
        titleLbl = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notbtn = new javax.swing.JButton();
        orbtn = new javax.swing.JButton();
        norbtn = new javax.swing.JButton();
        andbtn = new javax.swing.JButton();
        nandbtn = new javax.swing.JButton();
        xorbtn = new javax.swing.JButton();
        xnorbtn = new javax.swing.JButton();
        input1tgbtn = new javax.swing.JToggleButton();
        input2tgbtn = new javax.swing.JToggleButton();
        Outputlbl = new javax.swing.JLabel();
        gatelbl = new javax.swing.JLabel();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        exitBtn.setBackground(new java.awt.Color(0, 153, 255));
        exitBtn.setText("return to menu");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(220, 390, 150, 40);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 0, 0));
        titleLbl.setText("Truth Tables");
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
        backBtn.setBounds(0, 0, 100, 50);

        nextBtn.setOpaque(false);
        nextBtn.setContentAreaFilled(false);
        nextBtn.setBorderPainted(false);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        add(nextBtn);
        nextBtn.setBounds(300, 0, 100, 50);

        jLabel1.setText("here we will run a simulation to demonstrate how different logic gates ");
        add(jLabel1);
        jLabel1.setBounds(20, 270, 370, 14);

        jLabel2.setText("work by allowing you to change the input values for the different logic gates.");
        add(jLabel2);
        jLabel2.setBounds(20, 290, 370, 14);

        jLabel3.setText("To begin please choose what logic gate you would like to simulate or");
        add(jLabel3);
        jLabel3.setBounds(20, 310, 370, 14);

        jLabel4.setText("press the arrow in the right hand corner to move through simulations.");
        add(jLabel4);
        jLabel4.setBounds(20, 330, 360, 14);

        notbtn.setText("not gate");
        notbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notbtnActionPerformed(evt);
            }
        });
        add(notbtn);
        notbtn.setBounds(210, 160, 90, 23);

        orbtn.setText("or gate");
        orbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orbtnActionPerformed(evt);
            }
        });
        add(orbtn);
        orbtn.setBounds(100, 120, 90, 23);

        norbtn.setText("nor gate");
        norbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norbtnActionPerformed(evt);
            }
        });
        add(norbtn);
        norbtn.setBounds(210, 120, 90, 23);

        andbtn.setText("and gate");
        andbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                andbtnActionPerformed(evt);
            }
        });
        add(andbtn);
        andbtn.setBounds(100, 80, 90, 23);

        nandbtn.setText("nand gate");
        nandbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nandbtnActionPerformed(evt);
            }
        });
        add(nandbtn);
        nandbtn.setBounds(210, 80, 90, 23);

        xorbtn.setText("xor gate");
        xorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xorbtnActionPerformed(evt);
            }
        });
        add(xorbtn);
        xorbtn.setBounds(100, 160, 90, 23);

        xnorbtn.setText("xnor gate");
        xnorbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xnorbtnActionPerformed(evt);
            }
        });
        add(xnorbtn);
        xnorbtn.setBounds(210, 200, 90, 23);

        input1tgbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minus.png"))); // NOI18N
        input1tgbtn.setToolTipText("");
        input1tgbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                input1tgbtnItemStateChanged(evt);
            }
        });
        input1tgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input1tgbtnActionPerformed(evt);
            }
        });
        add(input1tgbtn);
        input1tgbtn.setBounds(5, 100, 80, 80);

        input2tgbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minus.png"))); // NOI18N
        input2tgbtn.setToolTipText("");
        input2tgbtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                input2tgbtnItemStateChanged(evt);
            }
        });
        input2tgbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input2tgbtnActionPerformed(evt);
            }
        });
        add(input2tgbtn);
        input2tgbtn.setBounds(5, 210, 80, 80);

        Outputlbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/minus.png"))); // NOI18N
        add(Outputlbl);
        Outputlbl.setBounds(320, 160, 80, 80);

        gatelbl.setMaximumSize(new java.awt.Dimension(300, 300));
        gatelbl.setMinimumSize(new java.awt.Dimension(300, 300));
        add(gatelbl);
        gatelbl.setBounds(50, 50, 280, 300);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/blankbackground.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        //reset values 
        input1tgbtn.setVisible(false);
       input2tgbtn.setVisible(false);
       Outputlbl.setVisible(false);
       andbtn.setVisible(true);
        orbtn.setVisible(true);
        nandbtn.setVisible(true);
        norbtn.setVisible(true);
        notbtn.setVisible(true);
        xorbtn.setVisible(true);
        xnorbtn.setVisible(true);
        gatelbl.setIcon(null);
        input1 = 0;
        input2 = 0;
       //return to previous menu
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "DigitalInformationScreen");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_nextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void andbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_andbtnActionPerformed
        // TODO add your handling code here:
        //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 1;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
       //get and display image
       try{
       url = getClass().getResource("/resources/andgate.gif");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/andgate.gif"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
     
    }//GEN-LAST:event_andbtnActionPerformed

    private void nandbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nandbtnActionPerformed
        // TODO add your handling code here:
       //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 2;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
       
       //get and display image
       try{
       url = getClass().getResource("/resources/nand.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/nand.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_nandbtnActionPerformed

    private void orbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orbtnActionPerformed
        // TODO add your handling code here:
        //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 3;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
        //get and display image
       try{
       url = getClass().getResource("/resources/orgate.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/orgate.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
      logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_orbtnActionPerformed

    private void norbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norbtnActionPerformed
        // TODO add your handling code here:
        //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 4;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
        //get and display image
       try{
       url = getClass().getResource("/resources/nor.jpg");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/nor.jpg"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_norbtnActionPerformed

    private void xorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xorbtnActionPerformed
        // TODO add your handling code here:
        //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 5;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
        //get and display image
       try{
       url = getClass().getResource("/resources/xor.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/xor.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
      logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_xorbtnActionPerformed

    private void notbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notbtnActionPerformed
        // TODO add your handling code here:
        //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 6;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
        //get and display image
       try{
       url = getClass().getResource("/resources/not.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/not.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_notbtnActionPerformed

    private void xnorbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xnorbtnActionPerformed
        // TODO add your handling code here:
       //hide all buttons
        andbtn.setVisible(false);
        orbtn.setVisible(false);
        nandbtn.setVisible(false);
        norbtn.setVisible(false);
        notbtn.setVisible(false);
        xorbtn.setVisible(false);
        xnorbtn.setVisible(false);
        //keep track of what button was pressed
        gate = 7;
        //show all toggle buttons
        input1tgbtn.setVisible(true);
       input2tgbtn.setVisible(true);
       Outputlbl.setVisible(true);
        //get and display image
       try{
       url = getClass().getResource("/resources/xnor.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/xnor.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       logic.setgate(gate);
       ImgDisplayedLbl = new ImageIcon(Img);
       gatelbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_xnorbtnActionPerformed

    private void input2tgbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_input2tgbtnItemStateChanged
        // TODO add your handling code here:
        //if input2tgbtn is selected then set input2 to 1 and changes the logo 
         if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            input2 = 1;
             try{
       url = getClass().getResource("/resources/plus.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/plus.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       ImgDisplayedLbl = new ImageIcon(Img);
       input2tgbtn.setIcon(ImgDisplayedLbl);
           
        }
        else
        {
            input2 = 0;
              try{
       url = getClass().getResource("/resources/minus.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/minus.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       ImgDisplayedLbl = new ImageIcon(Img);
       input2tgbtn.setIcon(ImgDisplayedLbl);
           
        } 
         //sets input2 in LogicGatesim
        logic.setinput2(input2);
         //gets ImgDisplayedLbl then sets the icon for the output label
        ImgDisplayedLbl = logic.generateoutput();
        Outputlbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_input2tgbtnItemStateChanged

    private void input1tgbtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_input1tgbtnItemStateChanged
        // TODO add your handling code here:
        //if input1tgbtn is selected then set input1 to 1 and changes the logo 
         if(evt.getStateChange() == ItemEvent.SELECTED)
        {
            input1 = 1;
              try{
       url = getClass().getResource("/resources/plus.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/plus.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       ImgDisplayedLbl = new ImageIcon(Img);
       input1tgbtn.setIcon(ImgDisplayedLbl);
           
        }
        else
        {
            input1 = 0;
              try{
       url = getClass().getResource("/resources/minus.png");
       Img = ImageIO.read(url);
       }
       catch(IOException e)
               {
            System.out.println(getClass().getResource("/resources/minus.png"));
            System.out.println("An error occoured");
            System.out.print(e);
       }
       ImgDisplayedLbl = new ImageIcon(Img);
       input1tgbtn.setIcon(ImgDisplayedLbl);
           
        } 
         //sets input1 in LogicGatesim
        logic.setinput1(input1);
        //gets ImgDisplayedLbl then sets the icon for the output label
        ImgDisplayedLbl = logic.generateoutput();
        Outputlbl.setIcon(ImgDisplayedLbl);
    }//GEN-LAST:event_input1tgbtnItemStateChanged

    private void input2tgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input2tgbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input2tgbtnActionPerformed

    private void input1tgbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input1tgbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input1tgbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JLabel Outputlbl;
    private javax.swing.JButton andbtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel gatelbl;
    protected javax.swing.JToggleButton input1tgbtn;
    protected javax.swing.JToggleButton input2tgbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nandbtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton norbtn;
    private javax.swing.JButton notbtn;
    private javax.swing.JButton orbtn;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JButton xnorbtn;
    private javax.swing.JButton xorbtn;
    // End of variables declaration//GEN-END:variables
}
