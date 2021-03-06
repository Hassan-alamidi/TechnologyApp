/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;
import java.awt.LayoutManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hassan
 */
public class QuizScreen extends javax.swing.JPanel {
    //declare variables
     protected String answer, question, userAns, sentance, name; 
    protected String[] userAnswer;
    private static String[] randomizedQuestion;
    protected int correct, incorrect;
    private boolean chckRightorWrong;
    public QuestionObj obj;
    public static ArrayList <QuestionObj> objArr;
    public int counter , random;
    public static int page;
    int btntrack;
    protected Random rand;
    String gamemode;
    String message;
    int CompPlays;
    AILogic myAILogic = new AILogic();
    
        
    /**
     * Creates new form QuizGUIPanel
     */
    public QuizScreen() {
        initComponents();
        this.setSize(400,450);
        //initialize variables
        obj = new QuestionObj();
        objArr = new ArrayList<>();
        randomizedQuestion = new String[10];
        counter = 0;
        userAnswer = new String[10];
        btntrack = 0;
        random = 0;
        rand = new Random();
        CompPlays = 1;
        message = "";
        //set unneeded screen components to invisible
       Submitbtn.setVisible(false);
        Savebtn.setVisible(false);
        Nametf.setVisible(false);
    }
    //set object array
     public void setobjarr(ArrayList<QuestionObj> objArr){
        QuizScreen.objArr = objArr;
       
    }
   public void setpage(int page){
       this.page = page;
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        headingLbl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        Startbtn = new javax.swing.JButton();
        Savebtn = new javax.swing.JButton();
        Submitbtn = new javax.swing.JButton();
        scorebtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        Nametf = new javax.swing.JTextField();
        titleLbl = new javax.swing.JLabel();
        levelCB = new javax.swing.JComboBox();
        backgroundLbl = new javax.swing.JLabel();

        setLayout(null);

        headingLbl.setText("Question:");
        add(headingLbl);
        headingLbl.setBounds(10, 120, 80, 14);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        add(jLabel3);
        jLabel3.setBounds(10, 150, 370, 30);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        add(jLabel2);
        jLabel2.setBounds(10, 180, 370, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        add(jRadioButton1);
        jRadioButton1.setBounds(20, 231, 370, 30);

        buttonGroup1.add(jRadioButton2);
        add(jRadioButton2);
        jRadioButton2.setBounds(20, 290, 370, 30);

        buttonGroup1.add(jRadioButton3);
        add(jRadioButton3);
        jRadioButton3.setBounds(20, 340, 370, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chose one of the following anwser's then press next to submit:");
        add(jLabel1);
        jLabel1.setBounds(10, 210, 380, 14);

        Startbtn.setText("Start");
        Startbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartbtnActionPerformed(evt);
            }
        });
        add(Startbtn);
        Startbtn.setBounds(20, 390, 150, 40);

        Savebtn.setText("Save");
        Savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SavebtnActionPerformed(evt);
            }
        });
        add(Savebtn);
        Savebtn.setBounds(110, 390, 150, 40);

        Submitbtn.setBackground(new java.awt.Color(0, 102, 255));
        Submitbtn.setText("submit");
        Submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitbtnActionPerformed(evt);
            }
        });
        add(Submitbtn);
        Submitbtn.setBounds(110, 390, 150, 40);

        scorebtn.setText("View previous score");
        scorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scorebtnActionPerformed(evt);
            }
        });
        add(scorebtn);
        scorebtn.setBounds(220, 390, 150, 40);

        exitBtn .setOpaque(false);
        exitBtn .setContentAreaFilled(false);
        exitBtn .setBorderPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        add(exitBtn);
        exitBtn.setBounds(0, 0, 70, 40);

        Nametf.setText("Enter name here");
        add(Nametf);
        Nametf.setBounds(110, 260, 210, 30);

        titleLbl.setFont(new java.awt.Font("Apple Chancery", 1, 18)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleLbl.setText("Test your knowledge");
        add(titleLbl);
        titleLbl.setBounds(90, 0, 200, 40);

        levelCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Easy", "Medium", "Hard" }));
        add(levelCB);
        levelCB.setBounds(290, -3, 110, 50);

        backgroundLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/analogsection/QuizGUI3.png"))); // NOI18N
        add(backgroundLbl);
        backgroundLbl.setBounds(0, 0, 400, 450);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
        //deletes all objects in array list
        objArr.clear();
        //resets screen incase user decides to return to Quiz
        Submitbtn.setVisible(false);
        Savebtn.setVisible(false);
        Nametf.setVisible(false);
        jRadioButton3.setVisible(true);
        jRadioButton2.setVisible(true);
        jRadioButton1.setVisible(true);
        Startbtn.setVisible(true);
        scorebtn.setVisible(true);
        counter = 0;
        if(page == 1)
        {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "DigitalSectionScreen");
        }
        }
        else if(page == 2){
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "AnalogMainScreen");
        }
        }
        else if(page == 3)
        {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "PlasticMainScreen");
        }
        }
        else if(page == 4)
        {
            LayoutManager layout = getParent().getLayout();
            if (layout instanceof java.awt.CardLayout) {
            java.awt.CardLayout cl = (java.awt.CardLayout)layout;
            cl.show(getParent(), "PlasticMainScreen");
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "something has gone when deciding what screen to send user back to");
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void SubmitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitbtnActionPerformed
        // TODO add your handling code here:
          Quiz playQuiz = new Quiz();
           int i =0;
         //objArr = playQuiz.getarrlist();
        //String[] temp = playQuiz.choseRandomQuestion();
        
        
           //JOptionPane.showMessageDialog(null,objArr.get(0).getquestion()+ objArr.get(1).getquestion());
           if(counter < 10){
            random = rand.nextInt(3);
               
            if(jRadioButton1.isSelected()){
                userAnswer[counter] = "a";
          
           }
           else if(jRadioButton2.isSelected()){
                userAnswer[counter] = "b";
            
           }
           else if(jRadioButton3.isSelected()){
                userAnswer[counter] = "c";
           }
            else{
                   jLabel3.setText("please select a radio buttion " + objArr.get(counter).getquestion());
                    counter = -1;
                 }
           //if counter is less than 9 then display question and answers depending on if statements nested within this if
           if(counter < 9){
               //display question in jLabel3 stored in index of array depening on counter + 1
           jLabel3.setText(objArr.get(counter + 1).getquestion());
            //if the correct answer is equal to "a" then the assigned radio button is jRadioButton1 and the incorrect answers get the remaining radiobutton
        if(objArr.get(counter + 1).getrad().equals("a")){
        jRadioButton1.setText(objArr.get(counter + 1).getanswer());
        jRadioButton2.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton3.setText(objArr.get(counter + 1).getincorrect2());
        }
         //else if the correct answer is equal to "b" then the assigned radio button is jRadioButton2 and the incorrect answers get the remaining radiobutton
        else if(objArr.get(counter + 1).getrad().equals("b")){
        jRadioButton2.setText(objArr.get(counter + 1).getanswer());
        jRadioButton1.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton3.setText(objArr.get(counter + 1).getincorrect2());
        }
         //else if the correct answer is equal to "c" then the assigned radio button is jRadioButton3 and the incorrect answers get the remaining radiobutton
        else if(objArr.get(counter + 1).getrad().equals("c")){
         jRadioButton3.setText(objArr.get(counter + 1).getanswer());
        jRadioButton2.setText(objArr.get(counter + 1).getincorrect1());
        jRadioButton1.setText(objArr.get(counter + 1).getincorrect2());
        }
        //else display error
        else{
        JOptionPane.showMessageDialog(null, "something has gone wrong one of the devlopers has assigned the answer to an invalid value");
        }
       
           }
            //if counter is equal to 9 change button text to get result
            if(counter == 9){
           Submitbtn.setText("get results");
            
             
           }
           //increase counter by one at the end of if state
           counter++;
          
           }
           //if counter is more than 9 the else runs
           else{
               //set answers to be compared in Quiz class
                playQuiz.setAnswer(userAnswer);
                //set object to be compared in Quiz class
                playQuiz.setobj(objArr);
                //runs checkAnswer to compare object array against userAnswer
                playQuiz.checkAnwsers();
                //get the amount of correct answers user inputted
                correct = playQuiz.getcorrect();
                //get the amount of incorrect answers the user inputted
                incorrect = playQuiz.getIncorrect();
                //gets message from AILogic
                message = myAILogic.getMessage();
                //displays the values recieved from the quiz class
                jLabel3.setText("The number of correct anwsers is:" + " "+correct );
                jLabel2.setText("The number of incorrect question is:" + " "+ incorrect);
                //displays message recieved from AILogic
                JOptionPane.showMessageDialog(null,message);
                //sets all radio buttons to invisible
                jRadioButton3.setVisible(false);
                jRadioButton2.setVisible(false);
                jRadioButton1.setVisible(false);
                //sets Nametf to visible
                Nametf.setVisible(true);
                //sets Savebtn to visible
                Savebtn.setVisible(true);
                //changes text in jLabel1
                jLabel1.setText("To save your score please enter your name and press save");
       //JOptionPane.showMessageDialog(null,"The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect);
           
        
        //end of else
           }
            if(CompPlays == 1){
            gamemode = levelCB.getSelectedItem().toString().toLowerCase();
            myAILogic.setGamemode(gamemode);
            myAILogic.calRight();
            myAILogic.whatQuestions();
            CompPlays ++;
           }
         
        
    }//GEN-LAST:event_SubmitbtnActionPerformed

    private void StartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartbtnActionPerformed
        // TODO add your handling code here:
        //this code sets up the quiz
        //sets unneeded buttons to invisible
         Startbtn.setVisible(false);
         scorebtn.setVisible(false);
         //set needed button to visible
         Submitbtn.setVisible(true);
         //displays the first question in jLabel3
        jLabel3.setText(objArr.get(counter).getquestion());
        //this check what button the correct answer is set to in the array then displayes them in their assigned jRadioButton
        //if the correct answer is equal to "a" then the assigned radio button is jRadioButton1 and the incorrect answers get the remaining radiobutton
        if(objArr.get(counter).getrad().equals("a")){
        jRadioButton1.setText(objArr.get(counter).getanswer());
        jRadioButton2.setText(objArr.get(counter).getincorrect1());
        jRadioButton3.setText(objArr.get(counter).getincorrect2());
        }
         //else if the correct answer is equal to "b" then the assigned radio button is jRadioButton2 and the incorrect answers get the remaining radiobutton
        else if(objArr.get(counter).getrad().equals("b")){
        jRadioButton2.setText(objArr.get(counter).getanswer());
        jRadioButton1.setText(objArr.get(counter).getincorrect1());
        jRadioButton3.setText(objArr.get(counter).getincorrect2());
        }
         //else if the correct answer is equal to "c" then the assigned radio button is jRadioButton3 and the incorrect answers get the remaining radiobutton
        else if(objArr.get(counter).getrad().equals("c")){
         jRadioButton3.setText(objArr.get(counter).getanswer());
        jRadioButton2.setText(objArr.get(counter).getincorrect1());
        jRadioButton1.setText(objArr.get(counter).getincorrect2());
        }
        //else display error
        else{
        JOptionPane.showMessageDialog(null, "Error something has gone wrong one of the devlopers has assigned the answer to an invalid value");
        }
        
        
            
        
        
        
        
    }//GEN-LAST:event_StartbtnActionPerformed

    private void difficultyCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_difficultyCBActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_difficultyCBActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void SavebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SavebtnActionPerformed
        // TODO add your handling code here:
        name = Nametf.getText();
        UserScoreObj save = new UserScoreObj();
        save.setName(name);
        save.setIncorrect(incorrect);
        save.setcorrect(correct);
        
        File outFile;
        FileOutputStream fStream;
        ObjectOutputStream oStream;
        try{
        outFile = new File("userScore.data");
        fStream = new FileOutputStream(outFile);
        oStream = new ObjectOutputStream(fStream);
        
        oStream.writeObject(save);
        JOptionPane.showMessageDialog(null,"your score has been saved");
        oStream.close();
        
        }
        catch(IOException e){
        JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_SavebtnActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void scorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scorebtnActionPerformed
        // TODO add your handling code here:
        File inFile;
        FileInputStream fStream;
        ObjectInputStream oStream;
        
        try{
        inFile = new File("userScore.data");
        fStream = new FileInputStream(inFile);
        oStream = new ObjectInputStream(fStream);
        UserScoreObj readPrev;
        
        readPrev = (UserScoreObj)oStream.readObject();
        
        JOptionPane.showMessageDialog(null, "Name:" + readPrev.getName() + "Correct answers: " + readPrev.getCorrect() + "Incorrect answers: " + readPrev.getIncorrect());
        oStream.close();
        }
        catch(IOException e){
        JOptionPane.showMessageDialog(null, e + "cannot find save file");
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(QuizScreen.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, ex + "cannot find class");
         }
    }//GEN-LAST:event_scorebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nametf;
    private javax.swing.JButton Savebtn;
    private javax.swing.JButton Startbtn;
    private javax.swing.JButton Submitbtn;
    private javax.swing.JLabel backgroundLbl;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel headingLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JComboBox levelCB;
    private javax.swing.JButton scorebtn;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
