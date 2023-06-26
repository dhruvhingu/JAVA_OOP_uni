
/*AU2140032 Dhruv Hingu CSE 108 OOP
Array and finding max index of it*/

public class Activity4_Q7 {
    public static void main(String[] args) {
        int[] list={3,5,99,0,-3,76,99,3};
        int max_num=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max_num){
                max_num=list[i];
            }
        }
        int index=0;
        for (int i = 0; i < list.length; i++) {
            if (list[i]==max_num){
                index=i;
                break;//this will help to stop looop at first occurence of the max value
            }
        }
        System.out.println("The Index of Maximum number of the array is "+index);//this will give first occurence
    }
}
