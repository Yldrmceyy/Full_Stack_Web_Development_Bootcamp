// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımlayalalım
        int r;
        double pi=3.14, alan, cevre;

        //kullanıcıdan veri alalım
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: " );
        r= input.nextInt();

        alan= pi* r * r;
        cevre= 2* pi * r;
        System.out.println("Dairenin alanı: " + alan );
        System.out.print("Dairenin çevresi: " + cevre );


    }
}