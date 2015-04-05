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
//this class is used for calling meathods from superclass to subclass
public class Agent {
    LogicGateSim log = new LogicGateSim();
    
    public void calllogic(){
    log.generateoutput();
    }
}
