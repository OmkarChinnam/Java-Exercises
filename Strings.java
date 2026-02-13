public class Strings {
    public static void main(String[] args) {

        String name = "omkar";
        String name1 = new String("omkar");
        String name3 = new String("omkar");
        String name2 = "omkar";

//        both occupies some new memory location in the heap so returns as false
        System.out.println(name1==name3);

        // Comparing literal strings
        if (name == name2) {
            System.out.println("Both strings belong to the same memory location (String Pool).");
        }

        // Comparing object vs literal using ==
        if (name != name1) {
            System.out.println("name1 is a new object in heap memory, so references are different.");
        }

        // String immutability demonstration
        name = name + " chinnam";
        System.out.println(name);
        System.out.println("A new String object is created because Strings are immutable.");


        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s1 + " World";
        String s4 = "Hello World";

        System.out.println(s3 == s4);        // false
        System.out.println(s3.equals(s4));   // true

//String bulder will provide the buffer if we need to expand our string anytime after occuping the name "omkar" and Omkarchinnam" still it gies the size of 21 even though we have the 12 character values
        StringBuffer str = new StringBuffer("omkar");
        System.out.println(str.capacity());
        str.append("chinnam");
        System.out.println(str.capacity());

        // StringBuilder is similar to StringBuffer
        // Difference: StringBuffer is thread-safe, StringBuilder is NOT thread-safe
// Both are mutable


        StringBuilder str1 = new StringBuilder("omkar");
        System.out.println(str1.capacity());
        str1.append("chinnam");
        System.out.println(str1.capacity());

    }
}
