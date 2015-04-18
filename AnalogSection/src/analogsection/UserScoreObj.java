/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.io.Serializable;

/**
 *
 * @author Hassan
 */
public class UserScoreObj implements Serializable {
    public int incorrect;
    public int correct;
    public String name;
    //public int computerScore;
    public UserScoreObj(){
    incorrect = 0;
    correct = 0;
   // computerScore = 0;
    name = new String();
    }
    
    public void setName(String name){
    this.name = name;
    }
    public void setIncorrect(int incorrect){
    this.incorrect = incorrect;
    }
    public void setcorrect(int correct){
    this.correct = correct;
    }
    //public void setcomputerScore(int ComputerScore){
    //this.computerScore = computerScore;
    //}
    public String getName(){
    return name;
    }
    public int getIncorrect(){
    return incorrect;
    }
    public int getCorrect(){
    return correct;
    }
    //public int getComputerScore(){
    //return computerScore;
    //}
}
