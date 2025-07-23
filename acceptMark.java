package input;
import java.util.Scanner;

public class acceptMark {
	public static void main(String[]args) {
Scanner sc = new Scanner(System.in); 
int markScored =sc.nextInt();
String grade;
if(markScored>=90) {
	grade ="A";
}


else if(markScored>=75) {
	grade ="B";
	}
else if(markScored>=60) {
	grade ="C";
	}
else if (markScored>=40) {
	grade ="D";
	}
else  {
	grade ="F";
	}
System.out.println("Grade of the student who" + "scored: "+markScored+" is: "+grade);

}

}


