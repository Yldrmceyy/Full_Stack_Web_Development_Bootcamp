import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Kac tane sayı gireceksiniz?:  ");
        int n=input.nextInt();
        int number;
        int max=0;
        int min=0;

        for (int i=1; i<=n ;i++){
            System.out.print(i +". sayı giriniz :" );
            number=input.nextInt();

            //ilk değer max ve min değer olarak atandı
            if((i==1) || (number<min)){
                min=number;
            }
            if(number>max){
                max=number;

            }
        }
        System.out.println("Max değer: " + max);
        System.out.println("Min değer: " + min);
    }
}