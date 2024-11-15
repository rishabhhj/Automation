package Encapsulation.Inheritance;

public class Employee {
    //private instance variables
    private int employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeId, String employeeName, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;

    }

    //Getter
    public int getEmployeeId() {
        return employeeId;
    }

    //setter
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    //Getter for employee name that returns a formatted string
    public String getEmployeeSalary() {
        return String.format("$%.2f", employeeSalary);
    }

    //Main method to test the employee class
    public static void main(String[] args) {
        Employee employee = new Employee(101,"Rishabh", 30000.00);

        //Display Employee details
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());

        employee.setEmployeeId(102);
        employee.setEmployeeName("Rishabh Joshi");

        System.out.println("Employee Id: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getEmployeeSalary());

    }

}
