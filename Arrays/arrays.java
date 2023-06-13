import java.util.Scanner;
public class arrays {
    public static void main(String[] args){
        // example 1
        // int arr[] = {7,28,2,9,1};
        // for(int i = 0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // example 2
        // String arr[] = new String[5];
        // arr[0] = "Amir aijaz";
        // arr[1] = "Amir";
        // arr[2] = "Aijaz";
        // arr[3] = "Hello";

        // for(int i=0; i< arr.length; i++){
        //     System.out.println(arr[i]);
        // }

        // example 3
        // int arr[][] = {{1,2,3},{4,5,6}};

        // for(int i=0; i<2; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // int arr1[][] = new int[2][2];
        // Scanner sc = new Scanner(System.in);
        // for(int i=0; i<2; i++){
        //     for(int j=0; j<2; j++){
        //         arr1[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0; i<2; i++){
        //     for(int j=0; j<2; j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        // Adding two 2D matrices using arrays

        int rows =2; 
        int columns =2;
        
        int matA[][] = {{1,2}, {3,4}};
        int matB[][] = {{5,6}, {7,8}};
        
        // Scanner sc = new Scanner(System.in);
        int sum[][] = new int [rows][columns];
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                sum[i][j] = matA[i][j] + matB[i][j];
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }



    }
}
