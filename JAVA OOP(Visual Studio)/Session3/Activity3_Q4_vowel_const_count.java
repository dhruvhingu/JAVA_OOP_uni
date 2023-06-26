package Session3;

import java.util.Scanner;

public class Activity3_Q4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a String");
            String line=input.nextLine();
            int count=0,blank=0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i)=='A'||line.charAt(i)=='a'||line.charAt(i)=='E'||line.charAt(i)=='e'||line.charAt(i)=='I'||line.charAt(i)=='i'||line.charAt(i)=='O'||line.charAt(i)=='o'||line.charAt(i)=='u'||line.charAt(i)=='U')
                {
                    count=count+1;
                }
                else {
                    if(line.charAt(i)==' '){
                        blank=blank+1;}
                    }   
            }
            int cons=line.length()-blank-count;
            System.out.println("The number of vowels is "+count);
            System.out.println("The number of consonent is "+cons);
        }
    }
}
