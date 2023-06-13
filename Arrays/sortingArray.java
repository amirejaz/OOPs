import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        String arr[] = {"g", "d", "c", "b", "a", "f"};
        System.out.println("Arrays before sorting: ");
        for(String str:arr){
            System.out.println(str);
        }
        
        Arrays.sort(arr);
        System.out.println("Arrays after sorting: ");
        for(String str:arr){
            System.out.println(str);
        }

    }
}
