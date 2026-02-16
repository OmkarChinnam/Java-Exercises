public class Calculator{

    // Method Overloading (Compile-time Polymorphism)
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public void show() {
        System.out.println("Basic Calculator");
    }


}