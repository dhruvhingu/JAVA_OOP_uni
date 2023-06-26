package Session3;

import java.util.Scanner;

public class Activity3_Q1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a Line of text: ");
            String line=input.nextLine();
            char[] words=line.toCharArray();
            int total_char=line.length();
            int white=0;
            for (int i = 0; i < line.length(); i++) {
                if (words[i]==' '){
                    white++;
                }
            }
            System.out.println("The total number of character are "+(total_char-white));   
            }
        }
    }

