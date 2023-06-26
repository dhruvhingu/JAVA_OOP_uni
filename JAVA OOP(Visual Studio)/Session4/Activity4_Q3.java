/*AU2140032 Dhruv Hingu CSE 108 OOP
Method defining for checking for even number*/
import java.util.Scanner;

public class Activity4_Q3 {
    public static boolean isEven(int a) {
        if (a%2==0){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==EVEN OR ODD==");
        System.out.print("Enter a number :");
        int num1=input.nextInt();
        System.out.println(isEven(num1));
    }
}
