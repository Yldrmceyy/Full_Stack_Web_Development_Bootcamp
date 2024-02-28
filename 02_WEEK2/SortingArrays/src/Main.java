import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array
        int[] unSorted = new int[size];

        // Get the elements of the array from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            unSorted[i] = scanner.nextInt();
        }

        // Sort the array from smallest to largest using the sort method
        Arrays.sort(unSorted);

        // Print the sorted array
        System.out.println("Elements in the array (Sorted in ascending order):");
        for (int number : unSorted) {
            System.out.print(number + " ");
        }

    }
}
