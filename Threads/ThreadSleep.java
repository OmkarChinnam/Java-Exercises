// Class A extends Thread -> means it becomes a thread
class A extends Thread {
    // This method is executed when the thread starts
    // We are overriding the run() method of Thread class
    public void run() {
       // Pause current thread for 100 milliseconds
        try{
            for(int i = 0; i <= 10; i++) {
                System.out.println("hi");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

class B extends Thread {
    public void run() {
        try{
            for(int i = 0; i <= 10; i++) {
                System.out.println("hello");
                Thread.sleep(100);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}

class ThreadSleep {
    public static void main(String[] args) {
        // Creating objects of thread classes
        A obj1 = new A();
        B obj2 = new B();


        // Starting both threads
        obj1.start();
        obj2.start();

        // Both threads run simultaneously (concurrently)
        // Output order will be mixed and not predictable
    }
}