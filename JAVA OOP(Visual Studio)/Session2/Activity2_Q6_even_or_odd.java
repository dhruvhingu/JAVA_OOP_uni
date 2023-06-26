package Session2;

import java.util.Scanner;

public class Activity2_Q6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter A number :");
            int number=input.nextInt();
            if (number%2==0){
                System.out.println("The Number is Even.");
            }
            else System.out.println("The Number is Odd.");
        }
    }
}
