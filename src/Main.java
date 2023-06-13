/*
Question : Reverse the given string word-wise. The last word in the given string should come at 1st place, the last-
           -second word at 2nd place, and so on. Individual words should remain as it is.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence;
        System.out.println("Enter the sentence :");
        sentence = input.nextLine();
        System.out.println("Printing the result : ");
        for (int start = sentence.length() - 1; start >= 0; start--){
            System.out.print(sentence.charAt(start));
        }
    }
}