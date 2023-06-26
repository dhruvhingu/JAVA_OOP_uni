/*AU2140032 Dhruv Hingu CSE 108 OOP
Array Defining and sum of it's elemets*/

public class Activity4_Q6 {
    public static void main(String[] args) {
        int[] list={5,3,8,9,2,1};
        int sum=0;
        for (int i = 0; i < list.length; i++) {
            sum=sum+list[i];
        }
        System.out.print("The sum of all the elements of array is "+sum);
    }
}
