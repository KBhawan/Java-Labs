/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

import java.util.Scanner;

/**
 * Main class implementing the UserInterface.
 *  * @author kevinbhawan

 */
public class Main {
    private String input = ""; // sotres user input
    private Circuit circuit; // single instance of the Circuit class
    private Scanner userIn = new Scanner(System.in); // scanner for reading user input

    // constructor to initialize the circuit instance
    public Main() {
        this.circuit = Circuit.getInstance();
    }

    // starts the application 
    public void start() {
        display();
        run();
    }

    // loop to process user commands
    public void run() {
        while (true) {
            input = userIn.nextLine().trim();

            if (input.equalsIgnoreCase("end")) {
                end();
                break;
            } else if (input.equalsIgnoreCase("spice")) {
                spice();
            } else {
                processInput(input);
            }
        }
    }

    // displays instructions to the user
    public void display() {
        System.out.println("Enter your input (e.g., 'r 1 2 10.0' or 'v 1 0 5.0'):");
        System.out.println("Commands: 'spice' to display SPICE format, 'end' to terminate.");
    }

    // processes the user's input to create circuit components
    public void processInput(String input) {
        String[] value = input.split(" ");
        if (value.length != 4) {
            System.out.println("Invalid format. Use 'r node1 node2 resistance' or 'v node1 node2 voltage'.");
            return;
        }

        try {
            char componentType = value[0].toLowerCase().charAt(0);
            int node1 = Integer.parseInt(value[1]);
            int node2 = Integer.parseInt(value[2]);
            double valueParam = Double.parseDouble(value[3]);

            switch (componentType) {
                case 'r': // adds resistor to the circuit
                    Resistor r = new Resistor(valueParam, node1, node2);
                    circuit.addResistor(r);
                    break;
                case 'v': // adds voltage source to the circuit
                    VoltageSource v = new VoltageSource(valueParam, node1, node2);
                    circuit.addVoltageSource(v);
                    break;
                default:
                    System.out.println("Unknown component type. Use 'r' for resistor or 'v' for voltage source.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Node identifiers and values must be numeric.");
        }
    }

    // displays the SPICE format 
    public void spice() {
        System.out.println("SPICE Description:");
        System.out.println(circuit.toSpice());
    }

    
    public void end() {
        System.out.println("All done.");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.start();
    }
}
