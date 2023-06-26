package Session1;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Input the first Number:");
            int num1= input.nextInt();
            System.out.print("Input the Second Number:");
            int num2= input.nextInt();
            int sum=num1+num2;
            System.out.println();
            System.out.println("Sum: "+ sum);
        }

    }
}
