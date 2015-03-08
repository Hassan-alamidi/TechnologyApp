/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analogsection;

import javax.swing.JPanel;

/**
 *
 * @author John
 */
public class Woodnav {

    static WoodMainApp cardsContainer = new WoodMainApp();

    public static void addPanels(JPanel panel, String name) {
        cardsContainer.panel.removeAll();
        cardsContainer.panel.add(panel, name);
        cardsContainer.panel.revalidate();
        cardsContainer.panel.repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        WoodMainPanel mainCard = new WoodMainPanel();
        mainCard.setSize(400, 450);
        mainCard.setVisible(true);
        addPanels(mainCard, "MAIN");
        
        
        cardsContainer.setVisible(true);
        
        // TODO code application logic here
    }

}
