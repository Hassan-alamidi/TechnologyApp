/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Hassan
 */
public class QuestionObj {
    
    public String questionobj;
    public String Answerobj;
    public String incorrectans1;
    public String incorrectans2;
    public String radbutton;
    
    public QuestionObj(){
    questionobj = new String();
    Answerobj = new String();
    incorrectans1 = new String();
    incorrectans2 = new String();
    radbutton = new String();
    }
    
    public String getincorrect1(){
    return incorrectans1;
    }
    public void setincorrect1(String incorrectans1){
    this.incorrectans1 = incorrectans1;
    }
    public String getincorrect2(){
    return incorrectans2;
    }
    public void setincorrect2(String incorrectans2){
    this.incorrectans2 = incorrectans2;
    }
  public String getquestion(){
     return questionobj;
     }
  public String getanswer(){
      return Answerobj;
  }
 public void setquestion(String questionobj){
     this.questionobj = questionobj;
 }
 public void setanswer(String Answerobj){
     this.Answerobj = Answerobj;
 }
 public void setrad(String radbutton){
 this.radbutton = radbutton;
 }
 public String getrad(){
 return radbutton;
 }
    //to turn this into an array i need to setup array as QuestionObj obj; ,QuestionObj[] objarr;
    // obj = new Question();, objarr = new QuestionObj[100];
    //set counter up to change index
    //add stuff like this obj.setname(); 
    //when you want to change index objarr[i]= obj;
}
