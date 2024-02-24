// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 0.10 TL per km
        // 50% discount on ticket price if under 12 years old
        // 10% discount on ticket price for ages 12-24
        // 30% discount on ticket price if over 65 years old
        // If Trip Type is roundtrip, 20% discount on ticket price

        Scanner input = new Scanner(System.in);

        // Declare variables
        double km, pricePerKm = 0.10, price,totalPrice;
        int age;
        boolean isOneWayTicket;

        // Prompting user inputs
        System.out.print("Please enter distance(KM): ");
        km = input.nextDouble();

        System.out.print("Please enter your age: ");
        age = input.nextInt();

        System.out.println("Please choose your ticket type: ");
        System.out.println("1- One Way");
        System.out.println("2- RoundTrip");
        int userInput = input.nextInt();
        isOneWayTicket = userInput == 1;



        //total price for all situation
        if(km>=0 && age>=0){
            if(age<12){
                price = ((km*pricePerKm)-(km*pricePerKm)*0.5);
                totalPrice = isOneWayTicket ? price : ((price-(price*0.2))*2);
                System.out.println("Your Ticket Price: " +totalPrice+" ₺");
            } else if (age>12 && age<=24) {
                price = ((km*pricePerKm)-(km*pricePerKm)*0.1);
                totalPrice = isOneWayTicket ? price : ((price-(price*0.2))*2);
                System.out.println("Your Ticket Price: " +totalPrice+" ₺");
            } else if (age>=65) {
                price = ((km*pricePerKm)-(km*pricePerKm)*0.3);
                totalPrice = isOneWayTicket ? price : ((price-(price*0.2))*2);
                System.out.println("Your Ticket Price: " +totalPrice+" ₺");
            } else {
                price = (km*pricePerKm);
                totalPrice = isOneWayTicket ? price : (price*2);
                System.out.println("Your Ticket Price: " +totalPrice+" ₺");
            }
        }else {
            System.out.println("You entered an invalid value, please try again.");
        }
    }
}