import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int k,n;
        Scanner input=new Scanner(System.in);

        System.out.println("Number to be exponentiated: ");
        k=input.nextInt();

        System.out.println("Number to be exponent: ");
        n=input.nextInt();

        int total=1;
        int i=1;
        while (i<=n){
            total=total*k;
            i++;
        }
        System.out.println(total);
    }
}