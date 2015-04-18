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
/*
* This class extends the 5bandCalc,
* And uses polmorphism to overide and change the functionallity 
*/
public class resistorBand6Calc extends ResistorCalc5band {
    protected String band6;
    protected int digit6, tempco;
    public resistorBand6Calc(String band1, String band2, String band3, String band4, String band5) {
        super(band1, band2, band3, band4, band5);
        band6 = "";
        digit6 = 0;
    }
    
    //retrives the band value from the user
    public void setBand6(String band6){
        this.band6 = band6;
    }
   
   public void assignTempcoValue() {

        switch (band6) {
            case "brown":
                tempco = 100;
                break;
            case "red":
                tempco = 50;
                break;
            case "yellow":
                tempco = 25;
                break;
            case "blue":
                tempco = 10;
                break;
            case "violet":
                tempco = 5;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }
   //returns the Temperature Coefficient in celius using ASCII code 
    public String getTempco() {
        final String degrees = "\u00b0";
        return "Temperature Coefficient Value:" + tempco + "ppm/" + degrees +"C";
    }
}
