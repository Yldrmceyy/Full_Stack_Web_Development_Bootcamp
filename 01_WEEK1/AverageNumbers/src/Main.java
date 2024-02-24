
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variables
        int n; // The number to be entered by the user
        int sum = 0; // Variable to store the sum of numbers divisible by 12
        int count = 0; // Variable to store the count of numbers divisible by 12

        // Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter a number
        System.out.print("Enter a number: ");
        n = input.nextInt();

        // Looping through numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            // Checking if the number is divisible by 12
            if (i % 12 == 0) {
                sum += i; // Adding the number to the sum
                count++; // Incrementing the count
            }
        }

        // Checking if any number is found that is divisible by 12
        if (count == 0) {
            // If no such number is found, printing an error message
            System.out.println("No numbers found that are divisible by 3 and 4.");
        } else {
            // Calculating the average of numbers divisible by 3 and 4
            double average = (double) sum / count;
            System.out.println("Average of numbers divisible by 3 and 4:  " + average);
        }

        // Closing the Scanner object
        input.close();
    }
}