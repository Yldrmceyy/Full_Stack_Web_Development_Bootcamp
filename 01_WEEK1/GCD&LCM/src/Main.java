import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        int ebob = 1;
        int ekok = 0;
        int i = 2;

        while (i <= sayi1 && i <= sayi2) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        for (int j = sayi2 * sayi1; j >= sayi1; j--) {
            if (j % sayi1 == 0 && j % sayi2 == 0) {
                ekok = j;
            }
        }

        //Another way to calculate ekok
        //ekok = (sayi1 * sayi2) / ebob;


        System.out.println("Girilen sayıların EBOB'u: " + ebob);
        System.out.println("Girilen sayıların EKOK'u: " + ekok);


    }
}
