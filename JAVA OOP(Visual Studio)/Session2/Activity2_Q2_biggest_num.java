package Session2;

import java.util.Scanner;

public class Activity2_Q2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Number 1:");
            int num1=input.nextInt();
            System.out.print("Enter Number 2:");
            int num2=input.nextInt();
            System.out.print("Enter Number 3:");
            int num3=input.nextInt();
            if ((num1>num2) && (num1>num3)) {
                System.out.println("The Biggest Number is "+num1);
            }
            else if((num2>num1) && (num2>num3)){
                System.out.println("The Biggest Number is "+num2);
            }
            else System.out.println("The Biggest Number is "+num3);
        }
    }
}
