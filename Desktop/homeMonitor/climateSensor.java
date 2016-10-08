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
class climateSensor {
    private climateState cur_state;
    
    public climateSensor(){
        cur_state = new off();
    }
    public void set_state(climateState s){
        cur_state = s;
    }
    public void change(){
        cur_state.change(this);
    }
    
}
interface climateState{
   void change(climateSensor wrapper);
      
}

class heating implements climateState {
    public void change(climateSensor wrapper){
        wrapper.set_state(new off());
        System.out.println(this.toString()+" Off");
    }
}
class off implements climateState {
    public void change(climateSensor wrapper){
        wrapper.set_state(new heating());
        System.out.println(this.toString()+" Heating");
    }
}
