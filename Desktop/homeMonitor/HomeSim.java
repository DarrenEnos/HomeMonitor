/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeMonitor;

/**
 *
 * @author darren
 */
public class HomeSim {
    public static void main (String[] args){
        lockSensor frontDoor = new lockSensor();
        lockSensor backDoor = new lockSensor();
        climateSensor houseTemp = new climateSensor();
        
        frontDoor.change();
        frontDoor.change();
        backDoor.change();
        houseTemp.change();
        houseTemp.change();
    }
}
