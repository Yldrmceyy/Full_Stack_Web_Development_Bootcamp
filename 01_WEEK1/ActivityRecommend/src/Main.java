
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the temperature value: ");
        heat=input.nextInt();

        if(heat<=5){
            System.out.println("You can ski");
        }else if (heat<=25){
            if(heat<=15){
                System.out.println("You can go cinema");
            }
            if(heat>=10){
                System.out.println("You can have a picnic");
            }
        }else{
            System.out.println("You can go swim");
        }
    }
}