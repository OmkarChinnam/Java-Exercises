import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

// Student class implementing Comparable
class Students implements Comparable<Students> {

    String stuName;   // Student name
    int stuAge;       // Student age

    // Constructor
    public Students(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    // compareTo method defines sorting logic
    @Override
    public int compareTo(Students studs) {

        // Sorting based on age (ascending)
        return (this.stuAge < studs.stuAge) ? -1 :
                (this.stuAge > studs.stuAge) ? 1 : 0;

//
//        return Integer.compare(this.stuAge, studs.stuAge);
    }

    // toString method for printing object
    @Override
    public String toString() {
        return "Students{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                '}';
    }
}

// Main class
public class ComparableExp {
    public static void main(String[] args) {

        // Creating list of Students
        List<Students> studs = new ArrayList<>();

        studs.add(new Students("Omkar", 24));
        studs.add(new Students("Navin", 22));
        studs.add(new Students("Stephen", 21));
        studs.add(new Students("John", 22));
        studs.add(new Students("Ravi", 25));

        // Sorting using compareTo()
        Collections.sort(studs);

        // Printing sorted list
        for (Students s : studs) {
            System.out.println(s);
        }
    }
}