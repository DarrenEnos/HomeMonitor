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
class lockSensor {
    
    private lockState cur_state;
    
    public lockSensor(){
        cur_state = new unlocked();
    }
    public void set_state(lockState s){
        cur_state = s;
    }
    public void change(){
        cur_state.change(this);
    }
    
}
interface lockState {
    void change(lockSensor wrapper);
}

class locked implements lockState {
    
    public void change(lockSensor wrapper){
        wrapper.set_state(new unlocked());
        System.out.println(this+" Unlocked");
    }
}

class unlocked implements lockState {
    
    public void change(lockSensor wrapper){
        wrapper.set_state(new locked());
        System.out.println(this+" Locked");
    }
}