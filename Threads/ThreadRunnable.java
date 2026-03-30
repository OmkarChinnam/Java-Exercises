/*
Key Concepts:

1. Runnable = Task (what work to do)
2. Thread = Worker (who does the work)
3. start() → creates a new thread and calls run()
4. run() → contains the actual logic
5. Output order is not fixed because threads run concurrently
*/


// Class A defines a task (not a thread)
// It implements Runnable interface
class A implements Runnable {
    // run() contains the code that will be executed by a thread
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("hi");
        }
    }
}

// Another task class
class B implements Runnable {
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println("hello");
        }
    }
}

class ThreadRunnable {
    public static void main(String[] args) {
        // Creating task objects (these are NOT threads)
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        // Creating Thread objects and assigning tasks to them
        Thread t1 = new Thread(obj1); // Thread t1 will execute task A
        Thread t2 = new Thread(obj2); // Thread t2 will execute task B

        // start() creates a new thread and internally calls run()
        // DO NOT call run() directly, it will behave like a normal method
        t1.start();
        t2.start();
    }
}
