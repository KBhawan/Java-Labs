/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.ArrayList;

/**
 *
 * @author kevinbhawan
 */
import java.util.ArrayList;

public class Circuit {
    private ArrayList<Resistor> resistors; // list of resistors 
    private ArrayList<VoltageSource> voltageSources; // ist of voltage sources 
    private static Circuit instance = null; // instance of circuit

    // constructor to enforce pattern
    private Circuit() {
        resistors = new ArrayList<>();
        voltageSources = new ArrayList<>();
    }

    // returns the instance of the circuit, creates one if it doesn't exist
    public static Circuit getInstance() {
        if (instance == null) {
            instance = new Circuit();
        }
        return instance;
    }

    // adds resistor to the circuit
    public void addResistor(Resistor r) {
        resistors.add(r);
    }

    // adds voltage source to the circuit
    public void addVoltageSource(VoltageSource v) {
        voltageSources.add(v);
    }

    // generates  SPICE-compatible description of the circuit components
    public String toSpice() {
        StringBuilder sb = new StringBuilder();

        for (Resistor r : resistors) {
            sb.append(r.toSpice()).append("\n");
        }

        for (VoltageSource v : voltageSources) {
            sb.append(v.toSpice()).append("\n");
        }

        return sb.toString();
    }

    // toString representation of the circuit components
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Resistor r : resistors) {
            sb.append(r.toString()).append("\n");
        }

        for (VoltageSource v : voltageSources) {
            sb.append(v.toString()).append("\n");
        }

        return sb.toString().trim();
    }
}
