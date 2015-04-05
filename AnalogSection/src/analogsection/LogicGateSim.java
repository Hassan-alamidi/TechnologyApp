/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

;
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
public class LogicGateSim{
     protected int gate;
    protected ImageIcon ImgDisplayedLbl;
    protected BufferedImage Img;
    protected URL url;
    protected int input1;
    protected int input2;
    LogicGateSim(){
     gate = 0;
     Img = null;
     url = null;
     input1 = 0;
     input2 = 0;
    
    }
   /* public LogicGateSim(){
    //input1tgbtn.addActionListener(new MyActionListener());
    input2tgbtn.addActionListener(this);
    outputtgbtn.addActionListener(this);
    }*/
    public void setgate(int gate){
    this.gate = gate;
    }
    public void setinput1(int input1){
    this.input1 = input1;
    }
    public void setinput2(int input2){
    this.input2 = input2;
    }
    public ImageIcon generateoutput(){
        
    switch(gate){
        case 1:
            if(input1 == 1 && input2 == 1){
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
      
          }
          else if(input1 == 1 && input2 == 0 ){
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
       
          }
          else if(input1 == 0 && input2 == 1){
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
      
          }
          else if(input1 == 0 && input2 == 0){
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
       
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 2:
          if(input1 == 1 && input2 == 1){
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
       
          }
          else if(input1 == 1 && input2 == 0 ){
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
       
          }
          else if(input1 == 0 && input2 == 1){
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
      
          }
          else if(input1 == 0 && input2 == 0){
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
      
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 3:
            if(input1 == 1 && input2 == 1){
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
          }
          else if(input1 == 1 && input2 == 0 ){
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
          }
          else if(input1 == 0 && input2 == 1){
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
          }
          else if(input1 == 0 && input2 == 0){
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
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 4:
            if(input1 == 1 && input2 == 1){
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
          }
          else if(input1 == 1 && input2 == 0 ){
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
          }
          else if(input1 == 0 && input2 == 1){
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
          }
          else if(input1 == 0 && input2 == 0){
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
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 5:
            if(input1 == 1 && input2 == 1){
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
          }
          else if(input1 == 1 && input2 == 0 ){
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
          }
          else if(input1 == 0 && input2 == 1){
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
          }
          else if(input1 == 0 && input2 == 0){
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
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 6:
            if(input1 == 1){
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
          }
          else if(input1 == 0){
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
          }
       
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        case 7:
            if(input1 == 1 && input2 == 1){
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
          }
          else if(input1 == 1 && input2 == 0 ){
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
          }
          else if(input1 == 0 && input2 == 1){
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
          }
          else if(input1 == 0 && input2 == 0){
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
          }
          else{
          JOptionPane.showMessageDialog(null,"something went wrong with the simulation");
          }
            break;
        default:
            JOptionPane.showMessageDialog(null,"something has gone wrong with selecting your choice of logic gate");
            break;
    }
    
    return ImgDisplayedLbl;
    }
    
}
