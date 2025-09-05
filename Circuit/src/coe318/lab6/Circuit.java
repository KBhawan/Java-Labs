/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

import java.util.ArrayList;
/**
 *
 * @author kevinbhawan
 */
public class Circuit {
    
    ArrayList<Resistor> resistors;
    private static Circuit inst = null;
    
    public static Circuit getInstance() {
        if (inst == null) {
            inst = new Circuit();
        }
        return inst;
    }
    
    private Circuit() {
        this.resistors = new ArrayList<Resistor>();
        
    }
    
    public void add(Resistor r) {
        this.resistors.add(r);
    }
    
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i=0; i<this.resistors.size(); i++){
            circuit += this.resistors.get(i).toString() + "\n";
        }
        return(circuit);
    
}
}
