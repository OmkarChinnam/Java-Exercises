import java.util.Comparator;
import java.util.Collections;   // Utility class for sorting
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Creating a list of student names
        List<String> stuList = new LinkedList<>();

        // Adding elements
        stuList.add("raju");
        stuList.add("ravi");
        stuList.add("shyam");
        stuList.add("omkar");
        stuList.add("kiran");
        stuList.add("navin");

        // Creating Comparator using lambda
        // compareTo() → natural alphabetical order
        Comparator<String> com = (a, b) -> a.compareTo(b);

        // Sorting using Comparator
        Collections.sort(stuList, com);

        // Printing sorted list
        System.out.println(stuList);
    }
}