// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //defining variable
        int year;

        //Scanner class
        Scanner input=new Scanner(System.in);

        System.out.print("Please enter a year: ");
        year=input.nextInt();

        //Finding leap year
        if(year%4==0) {
            if(year%100==0 && year%400==0 ) {
                System.out.println( year +" is a leap year");
            }else if(year%100==0) {
                System.out.println(year +" is not a leap year");
            }else{
                System.out.println(year +" is a leap year");
            }
        }else{
            System.out.println(year +" is not a leap year");
        }

        /*Another shorter code written as a comment line
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year ");
        } else {
            System.out.println(year + " is not a leap year");
        } */
    }
}