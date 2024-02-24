// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo, boy, vki;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen kilonuz(kg) giriniz: ");
        kilo= input.nextDouble();
        System.out.print("Lütfen boyunuzu(m) giriniz: ");
        boy= input.nextDouble();

        vki= kilo / (boy * boy) ;
        System.out.println("Vücut Kitle Endeksiniz: " + vki);

        

    }
}