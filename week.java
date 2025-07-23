package input;
import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        int week;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number between 1-7:");
        week = sc.nextInt();
        
        String weekName; 
        
        switch (week) {
            case 1: weekName = "Monday"; break;
            case 2: weekName = "Tuesday"; break;
            case 3: weekName = "Wednesday"; break;
            case 4: weekName = "Thursday"; break;
            case 5: weekName = "Friday"; break;
            case 6: weekName = "Saturday"; break;
            case 7: weekName = "Sunday"; break;
            default: weekName = "Invalid input! Please enter number between 1 and 7.";
        }
        
        System.out.println(weekName);
        
    }
}

	

	