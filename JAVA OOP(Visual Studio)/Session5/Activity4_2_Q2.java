/*
AU2140032 Dhruv Hingu
to sort array of int and  string
*/
import java.util.Arrays;

public class Activity4_2_Q2 {
    public static void main(String[] args) {
        int[] list_int={5,6,3,8,7,6,9,10};
        String[] list_string={"Hi", "Bye" , "Good" ,"day"};
        Arrays.sort(list_int);
        Arrays.sort(list_string);
        System.out.println("Sorted String"+Arrays.toString(list_string));
        System.out.println("Sorted List"+Arrays.toString(list_int));
    }
}

