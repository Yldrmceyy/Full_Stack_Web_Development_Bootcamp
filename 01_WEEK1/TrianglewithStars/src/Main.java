import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) { //istenilen satır sayısı kadar satır elde edilmesi

            for (int k = 1; k <= (n - i); k++) { //boşluk sayısı hesaplanmas
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){ //yıldız bastırdık
                System.out.print("*");
            }
            System.out.println(" "); // her döngüdenden sonra alt satıra gecmemız gerekioyor (ln)
        }

    }
}