package Strings;

public class First_Last_charString {
    public static void main(String[] args) {
        String str = "My name is Amir Aijaz";

        // length
        int len = str.length();

        //For first character
        System.out.println("The firs character is: " + str.charAt(0));

        //For last character
        System.out.println("The firs character is: " + str.charAt(len - 1));
    }
}
