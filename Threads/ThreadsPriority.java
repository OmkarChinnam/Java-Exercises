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

class ThreadsPriority {
    public static void main(String[] args) {
        // Creating objects of thread classes
        A obj1 = new A();
        B obj2 = new B();

        // Default priority of all threads is 5
        System.out.println(obj1.getPriority());
        // Setting max priority (10) to thread B
        obj2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(obj2.getPriority());

        // start() method creates a new thread and internally calls run()
        // DO NOT call run() directly, it will behave like a normal method
        obj1.start();
        obj2.start();

        // Note:
        // Even though B has higher priority,
        // execution order is NOT guaranteed
    }
}