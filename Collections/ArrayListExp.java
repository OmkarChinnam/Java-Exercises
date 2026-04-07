import java.util.Collection;   // Importing Collection interface (parent interface)
import java.util.ArrayList;   // Importing ArrayList class (implementation of List)

public class ArrayListExp {
    public static void main(String[] args) {

        // Creating a Collection reference pointing to an ArrayList object
        // This is called "upcasting" (ArrayList → Collection)
        // We are NOT using generics here (raw type), so it can store any type of object
        Collection list = new ArrayList<>();

        // Adding elements into the collection
        // Since it's a raw type, Java treats everything as Object internally
        list.add(10);        // int → autoboxed to Integer → stored as Object
        list.add(62);        // Integer
        list.add("hello");   // String
        list.add(55.78);     // double → autoboxed to Double
        list.add(23);        // Integer

        // Using enhanced for loop to iterate through collection
        // We use Object because collection stores elements as Object (raw type)
        for (Object numsList : list) {

            // Printing each element
            // JVM automatically calls toString() method
            System.out.println(numsList);
        }
    }
}