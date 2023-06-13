// Comparing the string vs new string using equals()
package Strings;

public class CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Amir");

        if(str1.equals(str2)){
            System.out.println("Yess! both strings are same");
        }
        else{
            System.out.println("No! both strings are not same");

        }
    }
    
}
