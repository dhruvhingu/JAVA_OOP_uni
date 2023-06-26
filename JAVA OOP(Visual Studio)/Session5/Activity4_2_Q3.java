/*AU2140032 Dhurv Hingu
Duplicate elements*/
public class Activity4_2_Q3{
    public static void main(String[] args) {
        int[] list_int={5,6,3,8,7,6,3,7,5,8,2,9,10};
        for (int i = 0; i < list_int.length; i++) {
            for (int j = i+1; j < list_int.length; j++) {
                if(list_int[i]==list_int[j]){
                    System.out.println("Duplicate Element is:"+list_int[i]);
                }
            }
            
        }

    }
    
}
