// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //definition to variable
        int a,b,c;

        //declarıng scanner class
        Scanner input=new Scanner(System.in);

        //prompting inputs
        System.out.println("1.sayıyı giriniz: ");
        a=input.nextInt();

        System.out.println("2.sayıyı giriniz: ");
        b=input.nextInt();

        System.out.println("3.sayıyı giriniz: ");
        c=input.nextInt();

        // Sorting and printing result
        if((a>b) && (a>c)){
            if (b>c){
                System.out.println("a>b>c");
            }else{
                System.out.println("a>c>b");
            }
        }else if((b>a) && (b>c)){
            if(a>c){
                System.out.println("b>a>c");
            }else{
                System.out.println("b>c>a");
            }
        }else{
            if(a>b){
                System.out.println("c>a>b");
            }else{
                System.out.println("c>b>a");
            }
        }
    }
}