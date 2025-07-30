package demo;


class Student {
    String name;
    int rollNumber;
    int[] marks;

    Student(String name, int rollNumber, int[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    double calculateAverage() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return (double) sum / marks.length;
    }

    void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("---------------------------");
    }
}
public class StudentDemo {
	public static void main(String[] args) {
        int[] marks1 = {85, 90, 100};
        int[] marks2 = {25, 60, 90};
        int[] marks3 = {83, 58, 100};

        Student s1 = new Student("Alice", 101, marks1);
        Student s2 = new Student("Bob", 102, marks2);
        Student s3 = new Student("Caroline", 103, marks3);

        s1.displayStudentDetails();
        s2.displayStudentDetails();
        s3.displayStudentDetails();
    }

}
