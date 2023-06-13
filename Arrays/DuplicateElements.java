// Program to print duplicate elements of the String array
// Program to print duplicate elements of the int array

public class DuplicateElements {
    public static void main(String[] args) {
        // FOR STRING ARRAYS 
        String [] names = new String [] {"Tom", "Steve", "Rick", "Steve", "Rick"};
        System.out.println("Duplicate elements in the given string array: ");
        
        for(int i=0; i < names.length; i++){
            for(int j = i+1; j < names.length; j++){
                if(names[i].equals(names[j])){
                    System.out.println(names[i]);
                }
            }
        }
        System.out.println();
        // -------------------------------------------------------------
        // FOR INT ARRAYS
        int [] numbers = new int [] {2, 4, 6, 8, 4, 6, 10, 10};
        System.out.println("Duplicate elements in given int array are: ");
        
        for(int i=0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println(numbers[i]);
                }
            }
        }

    }
}
