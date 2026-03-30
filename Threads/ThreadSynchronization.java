// Shared resource class
class Com {
    int counter; // shared variable accessed by multiple threads

    // synchronized ensures only ONE thread can execute this method at a time
    public synchronized void increment() {
        counter++; // critical section (shared data modification)
    }
}

class ThreadSynchronization {
    public static void main(String[] args) throws InterruptedException {

        // Creating ONE shared object
        Com com = new Com();

        // Task 1: increments counter 10000 times
        Runnable obj1 = () -> {
            for(int i = 0; i < 10000; i++){
                com.increment(); // accessing shared resource
            }
        };

        // Task 2: increments counter 10000 times
        Runnable obj2 =  () -> {
            for (int i = 0; i < 10000; i++) {
                com.increment(); // accessing shared resource
            }
        };

        // Creating threads and assigning tasks
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start both threads (they run concurrently)
        t1.start();
        t2.start();

        // Wait for both threads to complete execution
        t1.join();
        t2.join();

        // Now it is safe to print the final result
        System.out.println(com.counter);

        /*
         Expected Output:
         Final Counter: 20000

         Explanation:
         Thread 1 → 10000 increments
         Thread 2 → 10000 increments
         Total     → 20000

         Without synchronized:
         → You may get incorrect values due to race condition
        */
    }
}