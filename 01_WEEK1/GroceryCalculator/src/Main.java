// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armutKg, elmaKg, domatesKg, muzKg, patlıcanKg , toplamTutar;
        double armutFiyat=2.14 , elmaFiyat=3.67 , domatesFiyat=1.11 , muzFiyat=0.95 , patlıcanFiyat=5.00;


        Scanner input=new Scanner(System.in);
        System.out.print("Armut Kaç Kilo? ");
        armutKg= input.nextDouble();

        System.out.print("Elma Kaç Kilo? ");
        elmaKg= input.nextDouble();

        System.out.print("Domates Kaç Kilo? ");
        domatesKg= input.nextDouble();

        System.out.print("Muz Kaç Kilo? ");
        muzKg= input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? ");
        patlıcanKg= input.nextDouble();

        toplamTutar= (armutKg*armutFiyat) + ( elmaKg*elmaFiyat) + (domatesKg*domatesFiyat) +(muzKg*muzFiyat)+ (patlıcanKg*patlıcanFiyat);
        System.out.println("Toplam Tutarınız: " + toplamTutar);
    }
}