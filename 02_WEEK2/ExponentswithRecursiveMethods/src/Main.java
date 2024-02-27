import java.util.Scanner;
public class Main {
    static int power(int base, int exponent) {
        if (base == 1 || exponent == 0) {   //// If base is 1 or exponent is 0, the result is 1
            return 1;
        } else {
            return base * power(base, exponent - 1);   // Recursive call with decremented exponent
                                                               // The result is the product of base and the result of the recursive call with decremented exponent
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base value : ");
        int base = input.nextInt();          // Taking input for base value from user

        System.out.print("Enter the exponent value : ");
        int exponent = input.nextInt();        // Taking input for exponent value from user

        System.out.println("Result: " + power(base, exponent));

    }

}