// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner sınıfını tanımlayalım
        Scanner input= new Scanner(System.in);

        //Değişkenleri belirleyelim
        double kdvsizFiyat,kdvliFiyat,kdvOrani,kdvTutari;

        System.out.println("Bir Tutar Giriniz: ");
        kdvsizFiyat= input.nextDouble();

        if(kdvsizFiyat>0 && kdvsizFiyat<=1000){
            kdvOrani=0.18;
        }else {
            kdvOrani=0.08;
        }

        kdvTutari= kdvsizFiyat * kdvOrani;
        kdvliFiyat=kdvsizFiyat + kdvTutari;

        System.out.println("KDV'siz Tutar: " + kdvsizFiyat);
        System.out.println("KDV Oranı: "+ kdvOrani);
        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliFiyat );
    }
}