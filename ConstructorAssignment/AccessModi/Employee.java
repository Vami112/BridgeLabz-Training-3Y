package AccessModi;

// Base Class
class Employee {
    public int employeeID;        // public
    protected String department;  // protected
    private double salary;        // private

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public methods to access private salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Subclass
class Manager extends Employee {
    String role;

    Manager(int employeeID, String department, double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    void display() {
        System.out.println("EmployeeID: " + employeeID + 
                           ", Department: " + department + 
                           ", Salary: " + getSalary() + 
                           ", Role: " + role);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(101, "IT", 60000, "Team Lead");
        m1.display();

        // modifying salary using public method
        m1.setSalary(75000);
        m1.display();
    }
}
