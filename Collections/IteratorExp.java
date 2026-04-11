import java.util.List;        // List interface (ordered collection, allows duplicates)
import java.util.LinkedList;  // LinkedList class (implementation of List)
import java.util.Iterator;    // Iterator interface (used to traverse elements)

public class IteratorExp {
    public static void main(String[] args) {

        // Creating a LinkedList of Strings
        // LinkedList:
        // - Maintains insertion order
        // - Allows duplicates
        List<String> linkedList = new LinkedList<>();

        // Adding elements to the list
        linkedList.add("omkar");
        linkedList.add("hello");
        linkedList.add("Vegetables");
        linkedList.add("fruits");
        linkedList.add("meat");

        // Getting an Iterator from the list
        // iterator() method comes from Iterable interface
        Iterator<String> ite = linkedList.iterator();

        // Traversing the list using Iterator
        // hasNext() → checks if next element exists
        // next() → returns next element
        while (ite.hasNext()) {
            String something = ite.next();  // get next element
            System.out.println(something);  // print it
        }
    }
}