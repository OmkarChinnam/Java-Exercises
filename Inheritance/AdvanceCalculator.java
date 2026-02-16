public class AdvanceCalculator extends Calculator{
    public int multi(int num1, int num2){
        return num1 * num2;
    }
    public int div(int num1, int num2){
        return num1 / num2;
    }

    // Method Overriding (Runtime Polymorphism)
    public void show() {
        System.out.println("Advanced Calculator");
    }
}