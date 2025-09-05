package test;

public class Employee {
    String name;
    int id;

    // Constructor
    // Initializes the instance variables name and id with the
    // specified arguments
    public Employee(String n, int i) {
        this.name = n;
        this.id = i;
    }

    // Returns a string containing the name and id of this Employee
    // object. The name and id should be separated by a comma.
    // For example, for an Employee whose name is “James” and id
    // 123, this method should return the string “James, 123”
    public String toString() {
        return name + ", " + id;
    }
}
