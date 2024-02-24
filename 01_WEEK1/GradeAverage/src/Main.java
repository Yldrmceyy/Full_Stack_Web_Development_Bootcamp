// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımlayalım
        int mat,turkce,fizik,kimya,tarih;

        //scanner sınıfını oluşturalım
        Scanner input=new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat=input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce=input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik=input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya=input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih=input.nextInt();


        //ortalama hesalayalım
        double average=(mat+turkce+fizik+kimya+tarih)/5.0;
        if(average<=55 ) {
            System.out.println("Sınıfta kaldınız");
        }else if (mat < 0 || mat > 100 || turkce < 0 || turkce > 100 || fizik < 0 || fizik > 100 || kimya < 0 || kimya > 100 || tarih < 0 || tarih > 100) {
            System.out.println("Girilen notlardan biri veya birkaçı geçersiz. Lütfen doğru not bilgisini giriniz.");
        }else{
            System.out.println("Sınıfı geçtiniz");
        }
        System.out.println("ortalamanız: " + average);
    }
}
