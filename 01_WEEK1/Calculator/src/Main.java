// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2, select;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Değeri Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Değeri Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiniz: ");
        select = input.nextInt();
        System.out.println(select);
/*
        if (select == 1) {
            System.out.println("Toplam: " + (n1 + n2));
        } else if (select == 2) {
            System.out.println("Çıkarma: " + (n1 - n2));
        } else if (select == 3) {
            System.out.println("Çarpma: " + (n1 * n2));
        } else if (select == 4) {
            if (n2 != 0) {
                System.out.println("Bölme: " + (n1 / n2));
            } else {
                System.out.println("Bir sayı 0'a bölünemez");
            }
        } else {
            System.out.println("Yanlış Seçim yaptınız, 1'den 4'e kadar seçniz");
        }
*/

        //Switch Case ile
        switch (select){
        case 1:
        System.out.println("Toplam: " + (n1 + n2));
        break;
        case 2:
        System.out.println("Çıkarma: " + (n1 - n2));
        break;
        case 3:
        System.out.println("Çarpma: " + (n1 * n2));
        break;
        case 4:
        if (n2 != 0) {
            System.out.println("Bölme: " + (n1 / n2));
        } else {
            System.out.println("Bir sayı 0'a bölünemez");
        }
        break;
        default:
        System.out.println("Yanlış Seçim yaptınız, 1'den 4'e kadar seçniz");
    }

}
}