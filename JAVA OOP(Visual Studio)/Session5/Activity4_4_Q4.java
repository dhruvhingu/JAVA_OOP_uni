public class Activity4_4_Q4 {
    public static void main(String[] args) {
        String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
        String[] array2 = {"Networking", "SQL", "Oracle", "DB2", "JAVA"};
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i]==array2[j]){
                    System.out.println("Same Elements :"+array1[i]);
                }
            } 
        }  
    }
}
