class A {

    int num = 10;

    public void display() {
        System.out.println("Outer class method");
    }

    // Non-static inner class
    class B {
        public void show() {
            System.out.println("Inner class method");
            System.out.println("Accessing outer variable: " + num);
        }
    }

    // Static nested class
    static class C {
        public static void showc() {
            System.out.println("Static Inner class method");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        A obj = new A();
        obj.display();

        // Non-static inner class
        A.B obj1 = obj.new B();
        obj1.show();

        // Static nested class
//        A.C obj2 = new A.C();
        A.C.showc();
    }
}
