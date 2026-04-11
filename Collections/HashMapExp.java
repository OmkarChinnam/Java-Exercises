import java.util.Map;       // Map interface (stores data in key-value pairs)
import java.util.HashMap;   // HashMap class (implementation of Map)
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class HashMapExp {
    public static void main(String[] args) {

        // Creating a HashMap
        // Key → String (student name)
        // Value → Integer (marks)
        // HashMap:
        // - Does NOT allow duplicate keys
        // - Allows duplicate values
        // - Does NOT maintain insertion order
        Map<String, Integer> hashMap = new HashMap<>();

        // LinkedHashMap:
        // - Same as HashMap
        // - Maintains insertion order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // TreeMap:
        // - Same as HashMap
        // - Stores keys in sorted (natural) order
        Map<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs

        hashMap.put("omkar", 55);   // Added
        hashMap.put("ravi", 55);    // Added (duplicate value allowed)
        hashMap.put("naveen", 88);  // Added

        // Duplicate key case:
        // "omkar" already exists → value will be UPDATED (not duplicated)
        hashMap.put("omkar", 75);   // 55 → replaced with 75

        hashMap.put("kiran", 79);   // Added

        // Getting all keys from the map
        // keySet() returns a Set of keys
        System.out.println(hashMap.keySet());

        // ---------------- LinkedHashMap ----------------
        linkedHashMap.put("omkar", 55);   // Added
        linkedHashMap.put("ravi", 55);    // Added (duplicate value allowed)
        linkedHashMap.put("naveen", 88);
        linkedHashMap.put("kiran", 79);

        // ---------------- TreeMap ----------------
        treeMap.put("omkar", 55);   // Added
        treeMap.put("ravi", 55);    // Added (duplicate value allowed)
        treeMap.put("naveen", 88);
        treeMap.put("kiran", 79);


        // ---------------- Output ----------------
        // Printing the entire map
        // Format: {key=value, key=value}
        // Order is NOT guaranteed
        // HashMap → random order
        System.out.println("HashMap: " + hashMap);

        // LinkedHashMap → insertion order
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // TreeMap → sorted by keys (alphabetical)
        System.out.println("TreeMap: " + treeMap);
    }
}