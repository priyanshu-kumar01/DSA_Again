import java.util.*;

public class twoDArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int arr [][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         arr[i][j] =sc.nextInt();
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

        sum(arr);
        transpose(arr);
        maximum(arr);
    }

    // public static void squareOrNot(int arr[][]){
    //     int a = 0;
    //     int b = 0;

        
    // }



    

    public static void sum(int arr[][]){
        int sum = 0;
        int n = arr.length;
        int m = arr[0].length;

        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                sum = sum + arr[i][j];
            }
        }

        System.out.println("The total sum of an array is :" + sum);
    }

    // public static void diagonal(int arr[][]){
    //     int n = arr.length;
    //     int m= arr[0].length;

    //     for(int i=0; i<n; i++){
    //         for(int j=0; j<m; j++){
    //             if(arr[i][j] == )
    //         }
    //     }
    // }

    public static void maximum(int arr[][]){

        int Max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > Max){
                    Max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element is : " + Max);

    }
    
    public static void transpose(int arr[][]){
        int n = arr[0].length;
        int m = arr.length;

        System.out.println("The transpose of a Matrix is : ");
        for(int i =0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(arr[j][i]+ " ");
            }
            System.out.println();
        }
    }


}
