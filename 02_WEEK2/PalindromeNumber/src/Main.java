
import java.util.Scanner;

public class Main {
    static boolean isPalindrome(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {    // Loop to find the reverse of the number.
            lastNumber = temp % 10;  // Extracts the last digit of the number.
            reverseNumber = (reverseNumber * 10) + lastNumber;   // Appends the last digit to the end of the new number.
            temp /= 10;    // Divides the number by 10 to move to the next digit.
        }
        if (number==reverseNumber){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(2476));    }
}