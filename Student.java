
public class Student {
    String name;
    static int studentCount = 0;

    // Constructor
    Student(String name) {
        this.name = name;
        studentCount++;
    }

    // Static method to return student count
    public static int getStudentCount() {
        return studentCount;
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student("ALICE");
        Student s2 = new Student("ALONA");
        Student s3 = new Student("ELNAQ"); // Fixed duplicate name

        System.out.println("TOTAL NO OF STUDENTS: " + Student.getStudentCount());
    }
}
