/*AU2140032 Dhruv Hingu CSE 108 OOP
Method defining for counting no of vowels in line of text*/
import java.util.Scanner;

public class Activity4_Q4{
    public static void countVowel(String line){
        int count=0;
        String linelowered=line.toLowerCase();
        for (int i = 0; i < linelowered.length(); i++) {
            if(linelowered.charAt(i) == 'a'||linelowered.charAt(i)=='e'||linelowered.charAt(i)=='i'||linelowered.charAt(i)=='o'||linelowered.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("The number of vowel/s in the string is/are: "+count);
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a line of text to count the number of Vowels in it:");
        String text=input.nextLine();
        countVowel(text);
    }
}