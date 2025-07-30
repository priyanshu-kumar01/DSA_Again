public class practice{
    public static void main(String[] args) {

        int arr[] = {4,3,2,7,8,2,3,1};

        // maxMul(arr);
        // copy(arr);

        int n =1;

        for(int i=1; i<=4; i++){
            for(int j=1; j<=i;j--){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        
    }

    // public static void missingInteger(int arr[]){
    //     int val = Integer.MAX_VALUE;
    //     for(int i=0; i<arr.length;i++){
    //         if(arr[i]>0){
    //             if(val < arr[i]){
    //             val = arr[i];
    //             }
    //         }
            
    //     }
    //     System.out.println(""+val + 1);
    // }

    public static void maxMul(int arr[]){
        int val = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                for(int k=j+1; k<arr.length;k++){
                    int multi = arr[i] * arr[j]*arr[k];
                if(val< multi){
                    val = multi;
                }
                }
            }
        }
        System.out.println(val);
    }

    public static void copy(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
