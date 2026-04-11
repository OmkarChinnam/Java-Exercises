import java.util.Map;        // Map interface (key-value pairs)
import java.util.Hashtable;  // Hashtable class (thread-safe implementation)

public class HashTableExp {
    public static void main(String[] args) {

        // Creating a Hashtable
        // Hashtable:
        // - Does NOT allow duplicate keys
        // - Does NOT allow null key or null value
        // - Thread-safe (all methods are synchronized)
        // - Does NOT maintain insertion order
//        Only one thread can access it at a time
        Map<String, Integer> hashtable = new Hashtable<>();

        // Adding key-value pairs
        hashtable.put("omkar", 55);
        hashtable.put("ravi", 55);
        hashtable.put("naveen", 88);
        hashtable.put("kiran", 79);

        // hashtable.put(null, 100); ❌ NullPointerException
        // hashtable.put("test", null); ❌ NullPointerException

        // Printing the Hashtable
        // Order is NOT guaranteed
        System.out.println(hashtable);
    }
}