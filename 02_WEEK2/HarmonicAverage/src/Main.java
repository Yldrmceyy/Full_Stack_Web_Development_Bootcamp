public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicSum = 0.0;


        // Calculate harmonic series of elements
        for (int number : numbers) {
            harmonicSum += 1.0 / number;
        }

        // Calculate harmonic average
        double harmonicMean = numbers.length / harmonicSum;

        // Print the result to the screen
        System.out.println("Harmonic Average: " + harmonicMean);
    }
}