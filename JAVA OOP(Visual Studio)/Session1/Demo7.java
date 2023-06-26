package Session1;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the Radius of the circle: ");
            int radius = input.nextInt();
            
            double perimeter=2*3.14*radius;
            double area=3.14*(radius*radius);

            System.out.println("The Perimeter of the circle: "+perimeter);
            System.out.println("The Area of the circle: "+area);
        }

    }
    
}
