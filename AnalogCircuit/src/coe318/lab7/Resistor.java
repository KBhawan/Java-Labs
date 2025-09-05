/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author kevinbhawan
 */
public class Resistor {
    private static int resistor_count = 1; // assign unique IDs to each resistor
    private double resistance; // resistance value
    private int resistorID; // unique ID for the resistor
    private int node1; // first connected node
    private int node2; // second connected node

    // constructor for resistor object
    public Resistor(double resistance, int node1, int node2) {
        if (resistance <= 0) {
            throw new IllegalArgumentException("Resistance must be a positive value.");
        }
        this.resistance = resistance;
        this.node1 = node1;
        this.node2 = node2;
        this.resistorID = resistor_count;
        resistor_count++;
    }

    // getter method
    public double getResistance() {
        return resistance;
    }

    // formats the resistor information in SPICE notation
    public String toSpice() {
        return String.format("R%d %d %d %.2f", resistorID, node1, node2, resistance);
    }

    // toString representation of the resistor
    @Override
    public String toString() {
        return String.format("Resistor R%d between nodes %d and %d with resistance of %.2f ohms.",
                             resistorID, node1, node2, resistance);
    }
}
