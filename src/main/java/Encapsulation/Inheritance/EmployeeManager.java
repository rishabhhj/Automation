package Encapsulation.Inheritance;

class Employee1 {
    // Private fields
    private String name;
    private double salary;

    // Constructor
    public Employee1(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Manager subclass
class Manager extends Employee1 {
    // Private field for department
    private String department;

    // Constructor
    public Manager(String name, double salary, String department) {
        super(name, salary); // Call to the superclass constructor
        this.department = department;
    }

    // Getter for department
    public String getDepartment() {
        return department;
    }

    // Setter for department
    public void setDepartment(String department) {
        this.department = department;
    }
}

// Main class to test the program
class EmployeeTest {
    public static void main(String[] args) {
        // Create an Employee instance
        Employee1 emp = new Employee1("Rishabh", 50000);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Create a Manager instance
        Manager mgr = new Manager("Ricky", 75000, "Sales");
        System.out.println("\nManager Name: " + mgr.getName());
        System.out.println("Manager Salary: " + mgr.getSalary());
        System.out.println("Manager Department: " + mgr.getDepartment());

        // Modify manager details
        mgr.setDepartment("Marketing");
        System.out.println("\nUpdated Manager Department: " + mgr.getDepartment());
    }
}
