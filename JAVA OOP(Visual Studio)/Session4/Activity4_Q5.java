/*AU2140032 Dhruv Hingu CSE 108 OOP
Method defining to check for valid password*/
import java.util.Scanner;

public class Activity4_Q5 {
    public static boolean isValidPassword(String password) {
        if ((password.length()>=8) && (password.length()<=20) && (password.charAt(0)>='A')&&(password.charAt(0)<='Z') ){
        return true;}
        else return false;}
        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            System.out.println("Enter your Password:");
            String password=input.nextLine();
            System.out.println(isValidPassword(password));       
    }
}
