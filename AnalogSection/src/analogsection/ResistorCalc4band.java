/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Stephen 
 */

public class ResistorCalc4band {

    //variables 

    protected String band1, band2, band3, band4, resistorDigits, conversion, substrK, substrH, convertkilohm,maxConverKilohm,minConverKilohm;
    protected int digit1, digit2, percent, resistorColorVals;
    protected double maxValue, minValue, toloerance, tolrancPercent, multiplier;
    protected double valueResistor;

    public ResistorCalc4band(){
        resistorDigits = "";
        conversion = "";
        substrK = "";
        substrH = "";
        convertkilohm = "";
        digit1 = 0;
        digit2 = 0;
        percent = 100;
        resistorColorVals = 0;
        maxValue = 0.0;
        minValue = 0.0;
        toloerance = 0.0;
        tolrancPercent = 0.0;
        multiplier = 0.0;
        valueResistor = 0.0; 
        band1 = "";
        band2 = "";
        band3 = "";
        band4 = "";
     }
    
    //constructor which is invoked bu the subclasses 

    /* public ResistorCalc4band(){
        resistorDigits = "";
        conversion = "";
        substrK = "";
        substrH = "";
        convertkilohm = "";
        digit1 = 0;
        digit2 = 0;
        percent = 100;
        resistorColorVals = 0;
        maxValue = 0.0;
        minValue = 0.0;
        toloerance = 0.0;
        tolrancPercent = 0.0;
        multiplier = 0.0;
        valueResistor = 0.0; 
        band1 = "";
        band2 = "";
        band3 = "";
        band4 = "";
     }*/


    

    //setters to set the band values 
    public void setBand1(String band1) {
        this.band1 = band1;
    }

    public void setBand2(String band2) {
        this.band2 = band2;
    }

    public void setBand3(String band3) {
        this.band3 = band3;
    }

    public void setBand4(String band4) {
        this.band4 = band4;
    }
     //methods to assign values for each of the color bands 
    public void AssignValues() {

        switch (band1) {
            case "black":
                digit1 = 0;
                break;
            case "brown":
                digit1 = 1;
                break;
            case "red":
                digit1 = 2;
                break;
            case "orange":
                digit1 = 3;
                break;
            case "yellow":
                digit1 = 4;
                break;
            case "green":
                digit1 = 5;
                break;
            case "blue":
                digit1 = 6;
                break;
            case "violet":
                digit1 = 7;
                break;
            case "grey":
                digit1 = 8;
                break;
            case "white":
                digit1 = 9;
                break;
        }

    }

    public void AssignBand2Values() {
        if (band2.equals("black")) {
            digit2 = 0;

        } else if (band2.equals("brown")) {

            digit2 = 1;

        } else if (band2.equals("red")) {

            digit2 = 2;

        } else if (band2.equals("orange")) {

            digit2 = 3;

        } else if (band2.equals("yellow")) {

            digit2 = 4;


        } else if (band2.equals("green")) {

            digit2 = 5;

        } else if (band2.equals("blue")) {

            digit2 = 6;

        } else if (band2.equals("violet")) {

            digit2 = 7;

        } else if (band1.equals("grey")) {

            digit2 = 8;

        } else if (band1.equals("white")) {

            digit2 = 9;
        }
    }

    public void assignMulitiplier() {
        switch (band3) {
            case "black":
                multiplier = 1;
                break;
            case "brown":
                multiplier = 10;
                break;
            case "red":
                multiplier = 100;
                break;
            case "orange":
                multiplier = 1000;
                break;
            case "yellow":
                multiplier = 10000;
                break;
            case "green":
                multiplier = 100000;
                break;
            case "blue":
                multiplier = 1000000;
                break;
            case "violet":
                multiplier = 10000000;
                break;
            case "grey":
                multiplier = 1000000000;
                break;
            case "gold":
                multiplier = 0.1;
                break;
            case "silver":
                multiplier = 0.01;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }

    public void assignToloerance() {

        switch (band4) {
            case "brown":
                toloerance = 1;
                break;
            case "red":
                toloerance = 2;
                break;
            case "green":
                toloerance = 0.5;
                break;
            case "blue":
                toloerance = 0.25;
                break;
            case "violet":
                toloerance = 0.1;
                break;
            case "gold":
                toloerance = 5;
                break;
            case "silver":
                toloerance = 10;
                break;
            case "none":
                toloerance = 20;
                break;
            default:
                System.out.println("an error occoured");
                break;
        }
    }

    public void compute() {

        //resistorDigits = Integer.toString(digit1+digit2);
        //resistorColorVals = Integer.parseInt(resistorDigits);
        resistorColorVals = Integer.valueOf(String.valueOf(digit1) + String.valueOf(digit2));

        //error checker 
        System.out.println(resistorColorVals);

        //gives resistors vlaue has to be given in ohms
        valueResistor = (resistorColorVals * multiplier);

    }

    public void CalcToloerance() {
        try {
            tolrancPercent = (valueResistor * (toloerance / percent));

        } catch (ArithmeticException e) {
            System.out.println("error" + "\n" + e);
        }
        //calcs the maxValue, return values in ohms
        maxValue = tolrancPercent + valueResistor;
        //calcs the minValue, return values in ohms
        minValue = valueResistor - tolrancPercent;
    }

    public void convertToKilohm() {
        if(valueResistor  < 100){
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(2, 3);
            convertkilohm = substrK + "." + substrH + "" + "ohms";
        }else if(valueResistor  > 99 && valueResistor < 1000) {
            conversion = String.valueOf(valueResistor);
           // substrK = conversion.substring(0, 1);
           // substrH = conversion.substring(1, 3);
          //  convertkilohm = substrK + "." + substrH + "" + "ohms";
             convertkilohm =  conversion + "ohms";
        }else if (valueResistor > 999 && valueResistor < 10000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 9999 && valueResistor < 100000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 100000 && valueResistor < 1000000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            convertkilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (valueResistor > 999999 && valueResistor < 10000000) {
            conversion = String.valueOf(valueResistor);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        } // number is greater to larger so getting 1.2E7
        //which i will have to try to revert to digital repersentation
        else if (valueResistor >= 10000000 && valueResistor < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", valueResistor));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (valueResistor >= 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", valueResistor));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            convertkilohm = substrK + "." + substrH + "M" + "ohms";

        }

        // converts maximun resistor value to kilohmz
         if(maxValue < 100){
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(2, 3);
            maxConverKilohm = substrK + "." + substrH + "" + "ohms";
        }else if(maxValue > 99 && maxValue < 1000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            maxConverKilohm = substrK + "." + substrH + "" + "ohms";
        } else if (maxValue > 999 && maxValue < 10000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 9999 && maxValue < 100000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 100000 && maxValue < 1000000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            maxConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (maxValue > 999999 && maxValue < 10000000) {
            conversion = String.valueOf(maxValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            maxConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } // number is to larger to be repersented in digital form
         //so it's store it in a decimal format and then converted to a string  
        else if (maxValue >= 10000000 && maxValue < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f",maxValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            maxConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (maxValue >= 100000000) {
            // number is to larger to be repersented in digital form
           //so it's store it in a decimal format and then converted to a string  
            long number;
            number = Long.parseLong(String.format("%.0f",maxValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            maxConverKilohm= substrK + "." + substrH + "M" + "ohms";

        }
        // error first if index out of range 
        //converts the minium resistor value to kiloohmz
         if(minValue  < 100){
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(2, 3);
            minConverKilohm = substrK + "." + substrH + "" + "ohms";
        }else if (minValue > 99 && minValue < 1000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            minConverKilohm = substrK + "." + substrH + "" + "ohms";
        } else if (minValue > 999 && minValue < 10000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 9999 && minValue < 100000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 100000 && minValue < 1000000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            minConverKilohm = substrK + "." + substrH + "K" + "ohms";

        } else if (minValue > 999999 && minValue < 10000000) {
            conversion = String.valueOf(minValue);
            substrK = conversion.substring(0, 1);
            substrH = conversion.substring(1, 3);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } // number is to larger so getting 1.2E7
        //which i will have to try to revert to digital repersentation
        else if (minValue >= 10000000 && minValue < 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", minValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 2);
            substrH = conversion.substring(3, 5);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        } else if (minValue >= 100000000) {
            long number;
            number = Long.parseLong(String.format("%.0f", minValue));
            conversion = String.valueOf(number);
            substrK = conversion.substring(0, 3);
            substrH = conversion.substring(4, 6);
            minConverKilohm = substrK + "." + substrH + "M" + "ohms";

        }
   }
   
   //returns the resistor value in ohms
    public String getValueResistor() {
        return convertkilohm; 
    }
    //returns the max resistor value in ohms
    public String getMaxValue() {
        return maxConverKilohm;
    }
    //returns the max resistor value in ohms
    public String getMinValue() {
        return minConverKilohm;
    }
    
    
    /*
    * Need to implement file I/O 
    * Also have to implememt polymorhism 
    */
    
}
