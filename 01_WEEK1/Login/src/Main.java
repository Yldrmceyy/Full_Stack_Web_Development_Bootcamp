// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         String userName,password;
         Scanner input=new Scanner(System.in);
        System.out.print("kullaıcı adınız: ");
        userName=input.nextLine();
        System.out.print("kullanıcı şifreniz: ");
        password=input.nextLine();

        if(userName.equals("yldrmceyy") && password.equals("1234")){
            System.out.println("Giriş yaptınız");
        }else{
            System.out.println("Kullaıncı Bilgileriniz Yanlış!");
        }
    }
}