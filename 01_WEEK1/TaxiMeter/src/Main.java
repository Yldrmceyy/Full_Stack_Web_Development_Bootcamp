
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km;
        double perKm=2.20, startPrice=10, total;


        Scanner input= new Scanner(System.in);
        System.out.print("Gidilen mesafenin km cinsinden değerini giriniz: ");
        km=input.nextInt();

        total= km * perKm ;
        total+=startPrice;

        //ternary operatörü
        total = (total<20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total + "TL");
    }
}