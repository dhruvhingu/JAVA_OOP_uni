import java.util.Scanner;

/*
AU2140032 Dhruv Hingu
Method Overloading
*/

public class Activity4_2_Q1 {
    public static int add(int a,int b) {
        int sum=a+b;
        return sum;
    }
    public static double add(Double a, Double b){
        Double sum2=a+b;
       return sum2;

    }


    public static void main(String[] args) {
        int num1,num2,value;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter Value of Number 1:");
            num1=input.nextInt();
            System.out.print("Enter Value of Number 2:");
            num2=input.nextInt();
            value=add(num1, num2);
            System.out.println(value);
            //ANother method calling
            double num3,num4,value2;
            System.out.println("Another function with Double data type:");
            System.out.print("Enter Value of Number 1:");
            num3=input.nextDouble();
            System.out.print("Enter Value of Number 2:");
            num4=input.nextDouble();
            value2=add(num3,num4);
        System.out.println(value2);;}
    }
}
