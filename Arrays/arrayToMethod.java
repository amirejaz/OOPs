//Java Program to demonstrate the way of passing an anonymous array to method.  

public class arrayToMethod {
    static void method(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {7, 28, 9, 10};
        System.out.print("Array: ");
        method(arr);
    }
}
