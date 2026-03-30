// Class A extends Thread -> means it becomes a thread
class A extends Thread {
    // This method is executed when the thread starts
    // We are overriding the run() method of Thread class
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

class ThreadsExample {
    public static void main(String[] args) {
        // Creating objects of thread classes
        A obj1 = new A();
        B obj2 = new B();

        // start() method creates a new thread and internally calls run()
        // DO NOT call run() directly, it will behave like a normal method
        obj1.start();
        obj2.start();

        // Output order may vary (hi/hello mixed)
    }
}