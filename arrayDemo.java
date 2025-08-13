package lab;
import java.util.Scanner;

public class arrayDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Array length: " + array.length);

       
        for (int i = 0; i < array.length; i++) {
            
            array[i] = sc.nextInt();
        }

        
        System.out.println("\nYou entered:");
        for (int num : array) {
            System.out.println(num);
        }

        
    }
}
