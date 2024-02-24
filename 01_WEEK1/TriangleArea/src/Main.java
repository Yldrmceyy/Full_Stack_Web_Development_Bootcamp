// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri Tanımlayalım
        int edgeA, edgeB, edgeC;
        double u, ucgenArea;

        //Kullanıcıdan verileri alalım
        Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin ilk kenarını giriniz: ");
        edgeA=input.nextInt();
        System.out.println("Üçgenin ikinci kenarını giriniz: ");
        edgeB=input.nextInt();
        System.out.println("Üçgenin üçüncü kenarını giriniz: ");
        edgeC=input.nextInt();

        //Alan Hesaplayalım
        u = (edgeA + edgeB + edgeC) / 2.0;
        ucgenArea = Math.sqrt(u * (u - edgeA) * (u - edgeB) * (u - edgeC));
        System.out.println("Üçgenin Alanı :" + ucgenArea );
    }
}