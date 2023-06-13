package Strings;
import java.util.Arrays;

public class stringSort {
    public static void main(String[] args) {
        String str[] = new String[] {"jabbar", "Steve", "hamza", "Amir"};
        System.out.println("Before sorting array: ");

        for(String names: str){
            System.out.println(names + " ");
        }

        Arrays.sort(str);

        System.out.println();

        System.out.println("After sorting array: ");

        for(String names: str){
            System.out.println(names + " ");
        }

    }
}
