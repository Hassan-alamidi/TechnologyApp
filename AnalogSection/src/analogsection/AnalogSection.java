/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Stephen
 */
import javax.swing.*;
public class AnalogSection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String anwser, question; 
       int correct, incorrect;
       
        Quiz playQuiz = new Quiz();
      
       for(int counter = 0; counter < 10; counter++){
        
           question = playQuiz.setRandomQuestion();
       
           anwser = JOptionPane.showInputDialog(null,"The Question is:" + " "+ question + "Please enter your anwser");
           playQuiz.setAnwser(anwser);
           
           playQuiz.compute();
       }
        
       correct = playQuiz.getCorrect();
       incorrect = playQuiz.getIncorrect();
       
       JOptionPane.showMessageDialog(null,"The number of correct anwsers is:" + " "+correct + " " + "The number of incorrect question is:" + " "+ incorrect);
             
       
       
    }
    
}

