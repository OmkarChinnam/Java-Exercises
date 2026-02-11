class Employee {
    private String name;
    private int age;

    private static String company = "ABC.LTD";

//    constructor is used to call the initialize the objects and it is the coding standards that we should assign values to the instantiate variables using methods as it is the method we used to instantiate the values
    public Employee() {

    }

    public Employee(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    this  is the another way of refering the current object of the class but this java provides us this keyword insted of passing the object in the parameter
//    public void setName(String name, Employee emp) {
//        Employee emp = new Employee();
//        emp.name = name;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayDetails() {
        System.out.println(name + " : " + age + " : " + company);
    }

}


public class Encapsulation {
    static void main(String[] args) {

//        here it creates the object and instantiate the default values to the instance variable
        Employee emp1 = new Employee();
        emp1.displayDetails();

        Employee emp2 = new Employee("Omkar", 24);
        emp2.displayDetails();

//        and yes we do have another way to assign the values to the instance variables using setters
        Employee emp3 = new Employee();
        emp3.setName("ravi");
        emp3.setAge(24);
        emp3.displayDetails();


    }
}