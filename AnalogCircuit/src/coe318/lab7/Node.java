/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author kevinbhawan
 */
public class Node {

    private int nodeId; // identifier for the node.
    private static int nodeCounter = 0; // counter to generate node IDs.

    /**
     */
    // constructor created to increment node counter
    public Node() {
        this.nodeId = nodeCounter++;
    }

    // setter method
    public Node(int id) {
        this.nodeId = id;
    }

    // getter method
    public int getNodeId() {
        return nodeId;
    }

    // toString representation of node
    @Override
    public String toString() {
        return String.valueOf(this.nodeId);
    }
}
