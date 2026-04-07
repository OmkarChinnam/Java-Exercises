import java.util.Collection;   // Importing Collection interface (parent interface)
import java.util.ArrayList;   // Importing ArrayList class (implementation class)

public class ArrayListGeneric {
    public static void main(String[] args) {

        // Creating a Collection that can store ONLY Integer values
        // <Integer> is called a "generic type"
//        Generics in Java provide type safety, eliminate casting, and help detect errors at compile time instead of runtime.
        // It provides type safety (only Integer objects are allowed)
        // List allows duplicate elements and maintains insertion order
        Collection<Integer> list = new ArrayList<Integer>();

        // Adding elements into the collection
        // Here, only integers are allowed (no String, no Double)
        list.add(10);   // int → automatically converted to Integer (autoboxing)
        list.add(62);
        list.add(23);
        list.add(10);
        list.add(78);
        list.add(65);
        list.add(62);

        // list.add("hello"); ❌ Compile-time error (Type safety enforced)

        // Using enhanced for loop to iterate through collection
        // Now we can directly use 'int' or 'Integer'
        // Because we told Java this collection stores only Integers
        for (int numsList : list) {

            // Java automatically converts Integer → int (auto-unboxing)
            System.out.println(numsList);
        }
    }
}