package Strings;

public class searchingString {
    public static void main(String[] args) {
        String str[] = new String[] {"jabbar", "Steve", "hamza", "Amir"};

        String searchItem = "Amir";
        int index = 0;
        boolean foundFlag = false;

        for(int i=0; i<str.length; i++){
            if(searchItem.equals(str[i])){
                index = i;
                foundFlag = true;
                break;
            }
        }
        if(foundFlag){
            System.out.println(searchItem + " found at index " + index);
        }
        else{
            System.out.println(searchItem + " does not found");
        }
    }
}
