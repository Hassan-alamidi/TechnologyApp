/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

/**
 *
 * @author stephen
 */

/* This class will inherit from the 4bandclass and just override, some of the methods 

 * to add functionallity for the 5 band calc, this will be done for the man project so that 

 * It will save lines of code and also will incorperate a key feature of java which is inheritance 

*/

//public class ResistorCalc5band extends ResistorCalc4band {
//    //variables 
//    protected String band5;
//    protected int digit3;
//    private String valueTotal,minResistorValue, maxResistorValue;
//    private String  conversion, substrK, substrH, convertkilohm, resistorDigits;
//    private int digit1, digit2, percent, resistorColorVals;
//    private double  toloerance, tolrancPercent, multiplier,valueResistor,maxValue,minValue;
//    
//    public ResistorCalc5band(){
//        resistorDigits = "";
//        conversion = "";
//        substrK = "";
//        substrH = "";
//        convertkilohm = "";
//        digit1 = 0;
//        digit2 = 0;
//        percent = 100;
//        resistorColorVals = 0;
//        maxValue = 0.0;
//        minValue = 0.0;
//        toloerance = 0.0;
//        tolrancPercent = 0.0;
//        multiplier = 0.0;
//        valueResistor = 0.0; 
//    }
//    public ResistorCalc5band(String band1, String band2, String band3,String band4,String band5,int digit1, int digit2){
//        
//        super(band1, band2, band3, band4);
//        this.band1 = band1;
//        this.band2 = band2;
//        this.band3 = band3;
//        this.band4 = band4;
//        this.band5 = band5;
//        
//        
//        
//    } // end of constructor 
//
//
//    public void setBand5(String band5) {
//        this.band5 = band5;
//    }
//
//    
//    public void AssignBand3(){
//        switch (band3) {
//            case "black":
//                digit3 = 0;
//                break;
//            case "brown":
//                digit3 = 1;
//                break;
//            case "red":
//                digit3 = 2;
//                break;
//            case "orange":
//                digit3 = 3;
//                break;
//            case "yellow":
//                digit3 = 4;
//                break;
//            case "green":
//                digit3 = 5;
//                break;
//            case "blue":
//                digit3 = 6;
//                break;
//            case "violet":
//                digit3 = 7;
//                break;
//            case "grey":
//                digit3 = 8;
//                break;
//            case "white":
//                digit3 = 9;
//                break;
//        }
//
//    }
//
//    
//   
//    @Override
//    public void assignMulitiplier() {
//        switch (band4) {
//            case "black":
//                multiplier = 1;
//                break;
//            case "brown":
//                multiplier = 10;
//                break;
//            case "red":
//                multiplier = 100;
//                break;
//            case "orange":
//                multiplier = 1000;
//                break;
//            case "yellow":
//                multiplier = 10000;
//                break;
//            case "green":
//                multiplier = 100000;
//                break;
//            case "blue":
//                multiplier = 1000000;
//                break;
//            case "violet":
//                multiplier = 10000000;
//                break;
//            case "grey":
//                multiplier = 1000000000;
//                break;
//            case "gold":
//                multiplier = 0.1;
//                break;
//            case "silver":
//                multiplier = 0.01;
//                break;
//            default:
//                System.out.println("an error occoured");
//                break;
//        }
//    }
//
//    @Override
//    public void assignToloerance() {
//
//        switch (band5) {
//            case "brown":
//                toloerance = 1;
//                break;
//            case "red":
//                toloerance = 2;
//                break;
//            case "green":
//                toloerance = 0.5;
//                break;
//            case "blue":
//                toloerance = 0.25;
//                break;
//            case "violet":
//                toloerance = 0.25;
//                break;
//            case "gold":
//                toloerance = 5;
//                break;
//            case "silver":
//                toloerance = 10;
//                break;
//            case "none":
//                toloerance = 20;
//                break;
//            default:
//                System.out.println("an error occoured");
//                break;
//        }
//    }
//    
//    @Override
// public void compute() {
//
//        //resistorDigits = Integer.toString(digit1+digit2);
//        //resistorColorVals = Integer.parseInt(resistorDigits);
//        resistorColorVals = Integer.valueOf(String.valueOf(digit1) +  String.valueOf(digit2) +  String.valueOf(digit3));
//
//        //error checker 
//        System.out.println(resistorColorVals);
//
//        //gives resistors vlaue has to be given in ohms
//        valueResistor = (resistorColorVals * multiplier);
//
//    }
// 
// 
// 
//}
