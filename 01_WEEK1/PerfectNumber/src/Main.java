import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number :  ");
        int n = input.nextInt();

        int total=0;

        //Finding positive integer factors of the number received from the user (excluding n)
        for(int i=1; i<n; i++){
            if(n%i==0){
                total+=i; //finding the sum of positive integer factors
            }
        }
        System.out.println(total);

        //Checking if it is a perfect number based on the condition
        if(total==n){
            System.out.println("This number is Perfect");
        }else{
            System.out.println("This number is Not Perfect");
        }
    }
}