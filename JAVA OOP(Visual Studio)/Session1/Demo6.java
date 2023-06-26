package Session1;

import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            System.out.print("Input the first number: ");
            int a = input.nextInt();

            System.out.print("Input the second number: ");
            int b = input.nextInt();

            int d = (a*b);

            System.out.println();
            System.out.println("The multiplication of a and b is: " +d);
        }
    }
    
}
