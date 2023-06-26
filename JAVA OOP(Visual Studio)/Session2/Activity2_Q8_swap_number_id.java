package Session2;

import java.util.Scanner;

public class Activity2_Q8 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Number1:");
            int num1=input.nextInt();
            System.out.print("Enter a Number2:");
            int num2=input.nextInt();
            int temp=num1;
            num1=num2;
            num2=temp;
            System.out.println("Now Number 1 is "+num1);
            System.out.println("Now Number 2 is "+num2);
        }
    }
}
