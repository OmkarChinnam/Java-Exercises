class Student{
    int roll;
    String name;
    int marks;
}
class Objects_of_Arrays{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "omkar";
        s1.roll = 123;
        s1.marks = 55;
        Student s2 = new Student();
        s2.name = "ravi";
        s2.roll = 677;
        s2.marks = 89;
        Student s3 = new Student();
        s3.name = "suraj";
        s3.roll = 398;
        s3.marks = 79;

        Student students[]  =  new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].name + ":" + students[i].marks);
        }

//        with enhanced for loop
        for(Student stu : students)
        {
            System.out.println(stu.name + ":" + stu.marks);
        }

        }
        }