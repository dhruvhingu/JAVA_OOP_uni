package Session3;
/*AU2140032 Dhruv hingu
Sum of Odd number between 1 to 100*/
public class Activity3_Q7 {
    public static void main(String[] args) {
        int sum=0,a=1;
        do {if (a%2==1) {
            sum=sum+a;
        }a++;
        } 
        while (a<100);
        System.out.print("The Sum of Odd number betweeen 1 to 100 is "+sum);
    }
}
