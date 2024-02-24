import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //defining variables
        int year, zodiac;

        // Scanner class
        Scanner input = new Scanner(System.in);
        System.out.print("Your birth year: ");
        year = input.nextInt();
        zodiac = year % 12;

        // Finding chinese zodiac sign;
        switch (zodiac) {
            case 0:
                System.out.print("Your Chinese zodiac sign:  Monkey.");
                break;
            case 1:
                System.out.print("Your Chinese zodiac sign:  Rooster.");
                break;
            case 2:
                System.out.print("Your Chinese zodiac sign:  Dog.");
                break;
            case 3:
                System.out.print("Your Chinese zodiac sign:  Pig.");
                break;
            case 4:
                System.out.print("Your Chinese zodiac sign:  Rat.");
                break;
            case 5:
                System.out.print("Your Chinese zodiac sign:  Ox.");
                break;
            case 6:
                System.out.print("Your Chinese zodiac sign:  Kaplan.");
                break;
            case 7:
                System.out.print("Your Chinese zodiac sign:  Rabbit.");
                break;
            case 8:
                System.out.print("Your Chinese zodiac sign:  Dragon.");
                break;
            case 9:
                System.out.print("Your Chinese zodiac sign:  Snake.");
                break;
            case 10:
                System.out.print("Your Chinese zodiac sign:  Horse.");
                break;
            case 11:
                System.out.print("Your Chinese zodiac sign:  Sheep.");
                break;
        }
    }
}
