import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        int ilkSayi = 0;
        int ikinciSayi = 1;
        int total;

        //Printing the Fibonacci number up to the "n" value received from the user
        for (int i = 0; i <= n; i++) {
            System.out.print( ilkSayi + " ");
            total = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = total;
        }
    }
}