package Strings;

import java.util.Scanner;

public class checkPalindrome {
    public static Boolean isPal(String s){
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)){
            isPal(s.substring(1, s.length() - 1));
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for check:");
        String str = sc.nextLine();
        sc.close();

        if (isPal(str)){
            System.out.println("Yess! it is Palindrome");
        }
        else{
            System.out.println("Yess! it is Palindrome");
    
        }

    }

}
