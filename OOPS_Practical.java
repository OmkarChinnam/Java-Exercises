// TODO: Create an class called Employee
class Employee{
// Encapsulation basics
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
class Manager extends Employee {   // Inheritance
    private String department;

    //Constructor chaining
    Manager(String name, double salary, String department) {
        super(name, salary); //super keyword
        this.department = department;
    }

    // Method overriding
    public void getDetails() {
        System.out.println("Name: " + this.name + ", Salary: " + this.salary + ", Department: " + department);
    }
}


public class OOPS_Practical {
    public static void main(String[] args) {
        // TODO: Create Employee and Manager objects
        // Runtime polymorphism
        Employee emp = new Employee("Alice", 50000); // Object creation

        // Runtime polymorphism
        Manager mng = new Manager("Bob", 80000, "IT");
        // TODO: Print their details using getDetails()
        emp.getDetails();
        mng.getDetails();
    }
}


