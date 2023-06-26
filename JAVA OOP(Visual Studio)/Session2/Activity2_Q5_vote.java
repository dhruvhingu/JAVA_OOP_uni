package Session2;

import java.util.Scanner;

public class Activity2_Q5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter Your Age:");
            int age=input.nextInt();
            if (age<18){
                System.out.println("You are Not Allowed to Vote");
            }
            else System.out.println("Yes, You are Allowed to Vote");
        }

    }
    
}
