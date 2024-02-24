
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
         çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/

        // Variables
        int n;
        int sum = 0;

        // Scanner for user input
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Enter number: ");
            n = scan.nextInt();
            if ( n % 4 == 0) {
                sum += n;

            }
        } while (n % 2 == 0); //girilen sayı çift olduğu sürece döngüyü döndürüyor

        System.out.println("Sum: " + sum);
    }
}