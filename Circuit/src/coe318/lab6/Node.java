/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab6;

/**
 *
 * @author kevinbhawan
 */
public class Node {
    
    private int nodeID;
    private static int node_counter = 0;
    
    public Node(){
        this.nodeID = node_counter;
        node_counter++;
    }

    @Override
    public String toString() {
        return ("" + this.nodeID);
    }
    
    
    
}
