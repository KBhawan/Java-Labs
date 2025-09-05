/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author kevinbhawan
 */
public class VoltageSource {
    private double voltage; // voltage value of the source
    private int node1; // first connected node
    private int node2; // second connected node
    private int id; // identifier for the voltage source
    private static int counter = 1; // counter to assign IDs to each source

    // constructor to initialize a voltage source 
    public VoltageSource(double voltage, int node1, int node2) {
        this.voltage = voltage;
        this.node1 = node1;
        this.node2 = node2;
        this.id = counter;
        counter++;
    }

    // getter method for node 1
    public int getNode1() {
        return node1;
    }

    // getter method for node 2
    public int getNode2() {
        return node2;
    }

    // formats the voltage source information in SPICE notation
    public String toSpice() {
        return String.format("V%d %d %d DC %.2f", id, node1, node2, voltage);
    }

    // toString representation of the voltage source
    @Override
    public String toString() {
        return String.format("VoltageSource V%d between nodes %d and %d with voltage %.2f V.", 
                             id, node1, node2, voltage);
    }
}
