/*AU2140032 Dhruv Hingu CSE 108 OOP
Method defining for finding average of 3 integers*/
public class Activity4_Q2 {
    public static void average(int num1,int num2,int num3) {
    float sum=num1+num2+num3;
    float average=sum/3;
    System.out.println("The Average of "+num1+","+num2+","+num3+" is "+average);
        
    }
    public static void main(String[] args) {
        average(5,38,93);
        
    }
    
}
