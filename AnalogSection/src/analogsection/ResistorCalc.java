/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author Stephen
 * 
 * Details:
 *     There is going to be a drop down menu which allows you to chose 
 *     4 band resistor calculator, 5 band resistor calc and 
 *     maybe a 6 band resistor calc
 */
public class ResistorCalc {
    //variables
    private String color1,color2,color3,toloerance, totalgusse;
    private int value,tolerance,totalColorVaule,multi;
    
    
    //mehods to set the variables
    
    public void setColor1(String color1){
        this.color1 = color1;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    public void setToloerance(String toloerance) {
        this.toloerance = toloerance;
    }
    
    // assign a value for the different colors 
    public void setColorValues(){
        
        
      if(totalgusse.equals("black")){
            value = 0;
        }
         else if(totalgusse.equals("brown")){
             value = 1;
          }
           else if(totalgusse.equals("red")){
               value = 2;
              }
             else if(totalgusse.equals("orange")){
                 value = 3;
                }
               else if(totalgusse.equals("yellow")){
                    value = 4;
                   }
                 else if(totalgusse.equals("green")){
                     value = 5;
                   }
                  else if(totalgusse.equals("blue")){
                      value = 6;
                    }
                   else if(totalgusse.equals("purple")){
                      value = 7;
                    }
                   else if(totalgusse.equals("grey")){
                       value = 8;
                   }
                   else if(totalgusse.equals("white")){
                       value = 8;
                   }
        /*
            Could append the three anwsers to an array of strings then when settting values 
            loop through the array and use a condition of if statements to set the values 
            then when the string is complete add the values together and / them by the totlerance.
        */
    }
    
    public void AssignTolerance(){
        
    }
    
    public void compute(){
        
        totalgusse = totalgusse + value;
        
       //multiply
         totalColorVaule = (value* multi);
        
        
    }
}
