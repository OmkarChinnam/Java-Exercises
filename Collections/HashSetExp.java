import java.util.Set;              // Set interface (does NOT allow duplicates)
import java.util.HashSet;          // Unordered Set (uses hashing)
import java.util.LinkedHashSet;   // Maintains insertion order
import java.util.TreeSet;         // Stores elements in sorted order

public class HashSetExp {
    public static void main(String[] args) {

        // Creating a HashSet that stores only String values
        // HashSet:
        // - Does NOT allow duplicates
        // - Does NOT maintain insertion order (order may appear random)
        Set<String> names = new HashSet<String>();

        // Adding elements to the HashSet
        names.add("omkar");     // Added
        names.add("ravi");      // Added
        names.add("omkar");     // ❌ Duplicate → ignored
        names.add("santhosh");  // Added
        names.add("kiran");     // Added

        // Creating a LinkedHashSet from HashSet
        // LinkedHashSet:
        // - Maintains insertion order
        // - But here, it will preserve the order of 'names' (not original insertion order)
        Set<String> linkedSet  = new LinkedHashSet<String>();
        linkedSet.add("omkar");
        linkedSet.add("ravi");
        linkedSet.add("santhosh");
        linkedSet.add("kiran");

        // Creating a TreeSet from HashSet
        // TreeSet:
        // - Stores elements in sorted (natural/alphabetical) order
        // - Uses Red-Black Tree internally
        Set<String> treeSet  = new TreeSet<String>();
        treeSet.add("omkar");
        treeSet.add("ravi");
        treeSet.add("santhosh");
        treeSet.add("kiran");

        // Printing all sets

        // HashSet → order is random
        System.out.println(names);

        // LinkedHashSet → maintains the order it receives from 'names'
        System.out.println(linkedSet);

        // TreeSet → automatically sorted (alphabetical for Strings)
        System.out.println(treeSet);
    }
}

// HashSet uses hashing (hashCode() and equals())
// If two elements are equal, only one is stored (ensures uniqueness)