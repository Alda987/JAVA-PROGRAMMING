


public class book {
    String title;
    String author;
    final int bookid =0;
    static  int bookCounter=1000;
    static final String LIBRARY_NAME = "cENTRAL LIBRARY";


    book() {
        this.title = title;
        this.author=author;
        }
    book(String title,String author) {
        this.title = title;
        this.author=author;
        }
        
        
        
        studentCount++;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}


class Main {
    public static void main(String[] args) {
        Student s1 = new Student("ALICE");
        Student s2 = new Student("ALONA");
        Student s3 = new Student("ELNAQ");

        System.out.println("TOTAL NO OF STUDENTS: " + Student.getStudentCount());
    }
}