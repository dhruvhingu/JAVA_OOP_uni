/*AU2140032 Dhruv Hingu CSE 108 OOP
Method defining for finding max from 3 integers*/

public class Activity4_Q1 {
    public static int smallest(int n1,int n2,int n3) {
        if ((n1<n2) && (n1<n3)){
        return n1;
    }
        else 
        if ((n2<n1)&&(n2<n3)) {
            return n2;
            
        } else return n3;
        }
    public static void main(String[] args) {
        int z=smallest(5,8,3);
        System.out.println(z);
    }
}
