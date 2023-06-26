package Session3;

import java.util.Scanner;

public class Activity3_Q5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Name of city 1 : ");
            String City1=input.nextLine();
            System.out.print("Enter the Name of city 2 : ");
            String City2=input.nextLine();
            if (City1.length()==City2.length()){
                System.out.print("Both city name are of equal size");
            }
            else System.out.print("City names are of Unequal size");
        }

    }
}
