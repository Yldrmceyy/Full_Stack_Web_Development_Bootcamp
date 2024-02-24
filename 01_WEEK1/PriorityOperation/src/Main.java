// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Sayıyı Giriniz: ");
        a = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        b = input.nextInt();
        System.out.print("Üçüncü Sayıyı Giriniz: ");
        c = input.nextInt();

        System.out.println(a + b * c - b);


    }
}