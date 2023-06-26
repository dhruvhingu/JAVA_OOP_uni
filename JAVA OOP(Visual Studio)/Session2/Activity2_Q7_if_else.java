package Session2;

import java.util.Scanner;

public class Activity2_Q7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Your Marks:");
            int marks=input.nextInt();
            if (marks >= 90.0 )
            System.out.print("A") ;
            else if (marks >= 70.0)
            System.out.print("B") ;
            else if (marks >= 40.0)
            System.out.print("C") ;
            else
            System.out.print("I");
        }
    }
}
