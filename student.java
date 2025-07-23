package input;
class Student1{
	String name;
	int age;
  void displaystudentinfo(String name,int age) {
	 this.name=name;
	 this.age=age;
	 System.out.println("Name:" + name);
	 System.out.println("age:" + age);
}
	
}
public class student {
	public static void main(String[] args) {
		Student1 student=new Student1();
		student.displaystudentinfo("alda",20);
	}
}
