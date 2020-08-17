package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	    String original, reverse=""; // Object of string class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is palindrome");
        original = in.nextLine();
        int length = original.length();
        for (int i = length-1;i>=0;i--){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("Eneterd string/number is a palindrome");

        }
        else{
            System.out.println("Entered string/number is not palindrome");
        }

    }
}
