import java.util.Scanner;

public class CustomCalendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for year and month
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        // Validate month input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please enter a value between 1 and 12.");
            return;
        }

        // Arrays to store month names and the number of days in each month
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        // Adjust for leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; // February has 29 days in a leap year
        }

        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(year, month);

        // Print the calendar
        printCalendar(months[month - 1], year, firstDay, daysInMonth[month - 1]);
    }

    // Method to get the first day of the month (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
    private static int getFirstDayOfMonth(int year, int month) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year--;
        }
        return (year + year / 4 - year / 100 + year / 400 + t[month - 1] + 1) % 7;
    }

    // Method to print the calendar
    private static void printCalendar(String monthName, int year, int firstDay, int daysInMonth) {
        System.out.println("     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}
