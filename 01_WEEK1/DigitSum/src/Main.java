
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int number = input.nextInt();
        int tempNumber = number;
        int basNumber=0;
        int basValue;
        int basSum=0;

        //Basamak sayısını bulma
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }
        System.out.println("Bu sayı "+ basNumber+ " basamaklıdır");

        //Sayının basamakları toplamı
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basSum += basValue;
            System.out.println(basValue);

            tempNumber /= 10;
        }
        System.out.println("Basamak Sayıların toplamı: " + basSum);
    }
}