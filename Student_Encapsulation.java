class Student {
    private String name;
    private int rno;
    private double marks;

    // Getters
    public String getName() { return name; }
    public int getRNo() { return rno; }
    public double getMarks() { return marks; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setRNo(int rno) { this.rno = rno; }
    public void setMarks(double marks) { this.marks = marks; }
}

public class Student_Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shipra");
        s.setRNo(60);
        s.setMarks(70);

        System.out.println("Name: " + s.getName());
        System.out.println("Roll Number: " + s.getRNo());
        System.out.println("Marks: " + s.getMarks());
    }
}
