// Parent class (common class)
class Com {
    int counter;

    // Method to increment counter
    public void increment() {
        counter++;
    }
}

class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {

        // shared object
        Com com = new Com();

        // Task 1
        Runnable obj1 = () -> {
            for(int i = 0; i<10000; i++){
                com.increment();
            }
        };
        // Task 2
        Runnable obj2 =  () -> {
            for (int i = 0; i < 10000; i++) {
                com.increment();
            }
        };
        // Creating threads
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Start both threads
        t1.start();
        t2.start();

        // Wait for both to finish
        t1.join();  // <-- important concept
        t2.join();

        // Now safe to print final value
        System.out.println(com.counter);


//        Even if we use join() to wait for threads, we still need synchronization to avoid race conditions when multiple threads modify shared data.

    }
}