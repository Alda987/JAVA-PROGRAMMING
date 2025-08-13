package experiments;
import java.util.Scanner;

public class copy {

    public static void main(String[] args) {
        String[] Cars = new String[4];  
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers for a 4x3 matrix:");

        
        for (int i = 0; i < Cars.length; i++) {
            
            	Cars[i] = sc.next();
            
        }

        
       String[] copy = new String[4];
        for (int i = 0; i < Cars.length; i++) {
            
                copy[i]=Cars[i];
            }
        

       
        System.out.println("\n CARS ORIGINAL:");
        for (int i = 0; i < Cars.length; i++) {
            
                System.out.print(Cars[i]+ "\t");
            }
            System.out.println();
        

        
        System.out.println("\nCopied Matrix:");
        for (int i = 0; i < copy.length; i++) {
          
                System.out.print(copy[i]+ "\t");
            }
            System.out.println();
        }
    }




