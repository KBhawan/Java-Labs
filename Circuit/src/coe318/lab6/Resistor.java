/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author kevinbhawan
 */

public class Resistor {
    public double resistance;
    public Node node1, node2;
    private int resistorID;
    private static int resistor_counter = 1;
    
    public Resistor(double resistance, Node node1, Node node2) {
        
        if (resistance < 0) {
            throw new IllegalArgumentException("Impossible for resistance to be zero");           
        } 
        if (node1 == null || node2 == null) {
            throw new IllegalArgumentException("Nodes are always connected");
        }
        
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorID = resistor_counter;
        resistor_counter++;
    }
    
    public Node [] getNodes() {
        Node[] nodes = {node1, node2};
        return nodes;
    }
    
    @Override
    public String toString() {
        return ("Resistor" + resistorID + "" + node1 + "" + node2 + "" + resistance);
            
    
}
}
