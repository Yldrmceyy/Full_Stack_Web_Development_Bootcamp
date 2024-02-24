
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r;

        Scanner input=new Scanner(System.in);

        System.out.print("n değerini giriniz: ");
        n= input.nextInt();

        System.out.print("r değerini giriniz: ");
        r= input.nextInt();

        int nFaktoriyel=1;
        int rFaktoriyel=1;
        int farkFaktoriyel=1;


        for(int i=1; i<=n ; i++){
            nFaktoriyel= nFaktoriyel*i;
        }
        for(int i=1; i<=r ; i++){
            rFaktoriyel= rFaktoriyel*i;
        }
        for(int i=1; i<=(n-r) ; i++){
            farkFaktoriyel= farkFaktoriyel*i;
        }
        System.out.println(nFaktoriyel/(rFaktoriyel*farkFaktoriyel));
    }
}