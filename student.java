public class student {
    static String schoolname = "University of Windsor";

    String studentname;


    public student(String name) {
        studentname = name; // Constructor
    }


    public static void main(String[] args) {
       //objects
        student s1 = new student("ABC");
        student s2 = new student("XYZ");

        System.out.println("Student 1: " + s1.studentname);
        System.out.println("School: " + s2.schoolname);

        System.out.println("Student 2: " + s2.studentname);
        System.out.println("School: " + s2.schoolname);
    }
}
