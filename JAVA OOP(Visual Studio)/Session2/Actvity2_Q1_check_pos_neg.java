package Session2;

import java.util.Scanner;

/*to show a number is positive or negative
Author Dhruv Hingu AU2140032 18-01-2022*/
public class Actvity2_Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number");
            int num=input.nextInt();
            if (num>0) 
            {
            System.out.println("Positive number");
            }
            else
            System.out.println("Not a Positive Number");
        }
    }

}
