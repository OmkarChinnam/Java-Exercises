public class Main{
    static void main(String[] args) {
        // Inheritance + Normal Object
        AdvanceCalculator calc = new AdvanceCalculator();

        System.out.println("Addition (int): " + calc.add(10, 20));
        System.out.println("Addition (double): " + calc.add(5.5, 2.5));
        System.out.println("Multiplication: " + calc.multi(5, 4));

        calc.show();   // Overridden method


        // Anonymous Object Example
        System.out.println("Anonymous Object Result: "
                + new AdvanceCalculator().multi(3, 3));
    }
}