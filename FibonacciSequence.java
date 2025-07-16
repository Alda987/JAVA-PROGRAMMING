import java.util.Scanner;
public class FibonacciSequence {
	 public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("First sequence of fibonacci numbers are:");
		 int n=sc.nextInt();
		 int first = 0,second=1;
		 
			 System.out.println("first SEQUENCE OF FIBONACCI are:");
			 for(int i=0;i<n;i++){
				 System.out.println(first+"");
				 int next=first+second;
				 first=second;
				 second=next;
			 }
			 }
		 }

