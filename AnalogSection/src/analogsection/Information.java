/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*


* images added to resources as the folowing:
   
* Analog 0-9

* Digital 10 - 20

* Plastic 21 - 31 

8 Wood 31 - 41 
*/
package analogsection;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Stephen
 */

public class Information {
    //variables
    private static String infoDisplayed;
    protected ArrayList <String> info;
   // private array;
    //private String  urls;
    private ArrayList <String> urls;
    //private URL fileList;
    private String fileList;
    private ImageIcon selectedImg;
    private int imgSelector, imgSelectorDigital;
    private String imgSelectString;
    private static String statArray[];
   
   
    protected static int infoType;
    private int i;
    
    
    public Information(){
     infoDisplayed = "";
     i = 0;
     imgSelector = 42;
     imgSelectorDigital = 53;
     statArray = new String[10];
     imgSelector = 0;
     urls = new ArrayList <String>();
     info = new ArrayList <String>();
     
     }
    
    public static void InfoType(int infoType){
       Information.infoType = infoType;
    }
    
    public void setImageUsed(int imgSelector){
        this.imgSelector = imgSelector;
    }
    
    public void setUrls(){
        //going to use an array to store the file urls
         
       imgSelectString = Integer.toString(imgSelector);
       urls.add("/resources/" + imgSelectString + ".jpg");
      

    //urls = "/resources/" + imgSelector + ".jpg";
            
    }
    
    public ImageIcon AddImageUsingURLS(){
    
      //System.out.println(getClass().getResource("/resources/" + imgSelector + ".jpg"));
        
        
        BufferedImage Img = null;
     

       try{
//         Image imgIcon = new ImageIcon(getClass().getResource("/resources/" + imgSelector + ".jpg")).getImage();
//        
//         URL url = getClass().getResource(urls);
//         if (url == null){
//             System.out.println( "Could not find image!" );
//            }
//          else{
//            imgIcon = (new ImageIcon(url).getImage());
//             } 
//        
        
        
           System.out.println(getClass().getResource(urls.get(imgSelector)));
            
        
          
//         // returns null if no resource is found --- which is happing 
           // use's count which is sent from the panel to select the image
           // from an arraylist of strings
           
             URL url = getClass().getResource(urls.get(imgSelector));
//        
//           
//            //Img = new ImageIcon(getClass().getResource(urls));
//            
//          //  imgSelector is going to be externally modified by the InfoPanel
             Img = ImageIO.read(url);
//
           }//end of try
      catch (IOException e) {
           // Exception is due to the image not being found 
            System.out.println(getClass().getResource("/resources/" + imgSelector + ".jpg"));
            System.out.println("An error occoured");
            System.out.print(e);
            
        }
       selectedImg = new ImageIcon(Img);
      //  will return the image chosen 
       return selectedImg ;
    }
//    public void PopulateImageArray(){
//        for(int y = 0; y < fileList.size(); y++) {
//            String path = fileList.get(y);
//            array[y] = path;
//        }
//    }
    
//    public ImageIcon getImage(){
//        
//        selectedImg = new ImageIcon(array);
//        return selectedImg;
//    }
    
    // methods to add info to the arraylist 

   
  public void setInfo(ArrayList <String> info){
          this.info = info;
    
    }
   
     
//    public void addArrayToStaticArray(){
//     
//        for(int j = 0; j < info.length; j++ ){
//             statArray[j] = info[j];        
//          }   
//    }
    public void setCount(int count){
        i = count;
    }
    
    public String DisplayInfo() {
       
       infoDisplayed = info.get(i);

       return infoDisplayed;
    }
  // not working yet but this is where
//    public void compute(){
//           if (i < 9) {
//                    i++;
////                    Information.setCount(count);
////                    infoDisplayed = Information.DisplayInfo();
////                    infoLbl.setText(infoDisplayed);
//                }
//                
//                //image selection routine
//              if(imgSelector < 9){
//                  imgSelector++;
////                  analogInfo.setImageUsed(imgSelector);
////                  analogInfo.setUrls();
////                  ImgDisplayedLbl = analogInfo.AddImageUsingURLS();
////                  imageChangeLbl.setIcon(ImgDisplayedLbl);
//                
//                  
//                  }
//    }
    
    public static int getInfoType(){
        return infoType;
    }
    public int getCounter(){
        return i;
    }
    
    // test method to return the array to check if the values are beeing set
    public static String[] getArray(){
        return statArray;
    }
            
    
   
}
