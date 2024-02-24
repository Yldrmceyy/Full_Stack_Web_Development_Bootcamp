import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        int n;

        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        // Prompting the user to enter the limit number
        System.out.print("Enter the limit number: ");
        n = scan.nextInt();

        // Printing powers of 4
        for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }

        System.out.println("-------------------");

        // Printing powers of 4
        for(int i = 1; i <= n; i *= 5) {
            System.out.println(i);
        }
    }
}