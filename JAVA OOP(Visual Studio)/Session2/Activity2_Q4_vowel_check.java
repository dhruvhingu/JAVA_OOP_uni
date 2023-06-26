package Session2;

import java.util.Scanner;

public class Activity2_Q4 {
        public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
                System.out.print("ENter a character:");
                char chr=input.next().charAt(0);
                if (chr=='a' || chr=='A' || chr=='e' || chr=='E' || chr=='i'||chr=='I'||chr=='o'||chr=='O'||chr=='u'||chr=='U'){
                    System.out.println("The Character is a vowel");
                }            
                else System.out.println("The Chracter is a Consonant");
            }
            }
            
        }
        
    

