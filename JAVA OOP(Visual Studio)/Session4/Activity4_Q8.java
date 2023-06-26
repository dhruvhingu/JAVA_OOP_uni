/*AU2140032 Dhruv Hingu
Array And finding total number of odd integers in it*/

public class Activity4_Q8 {
    public static void main(String[] args) {
        int[] array_list={1,5,0,2,1,78,7,13,5,4};
        int count=0;
        for (int i = 0; i < array_list.length; i++) {
            if (array_list[i]%2!=0){
                count++;
            }            
        }
        System.out.println("The Number of Odd integers in the array list is/are "+count);
    }
}
