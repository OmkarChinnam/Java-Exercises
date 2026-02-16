class Employee{
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
    }
    public double getSalary() {
        return this.salary;
    }

    public void getDetails() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary);
    }
}

// TODO: Create a class Manager that:
// - Extends Employee
class Manager extends Employee {
    private String department;

    Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    public void getDetails() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary + ", Department: " + department);
    }
}


public class Exercise {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        Employee emp = new Employee("Alice", 50000);
        Employee mng = new Manager("Bob", 80000, "IT"); // Dynamic dispatch
        // TODO: Print their details using getDetails()
        emp.getDetails();
        mng.getDetails(); // Runtime polymorphism
    }
}
