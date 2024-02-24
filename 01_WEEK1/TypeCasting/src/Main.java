import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tam sayı giriniz: ");
        int tamSayi = input.nextInt();

        //int sayıyı double bir sayıya dönüştürme
        double convertedFromInteger= tamSayi;
        System.out.println("Tam sayınız double sayıya dönüştürüldü.Sonuç: " +convertedFromInteger);


        System.out.print("Ondalıklı sayı giriniz: ");
        double ondalikliSayi = input.nextDouble();

        //int sayıyı double bir sayıya dönüştürme
        int convertedFromDouble = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayınız tam sayıya dönüştürüldü.Sonuç:  " + convertedFromDouble );


    }
}