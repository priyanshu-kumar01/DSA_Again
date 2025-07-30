import java.util.*;

public class array1{

    public static void update(int arr[]){
        for(int i =0; i<arr.length; i++){
            arr[i] = arr[i]+ 1;
        }
    }

    public static void show(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int binary(int arr[], int key){
        int start = 0;
        int end = arr.length-1;
        

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]== key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void reverse(int arr[]){
        int first = 0; 
        int last = arr.length-1;
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        show(arr);
    }
    public static int linear(int arr[], int key){
        
        for(int i=0; i<arr.length;i++){
            if(key == arr[i]){
                System.out.println("Key found at index: " + i);
                return i;
            }
        }
        System.out.println("Key not found.");
        return -1;
    }


    public static void biggest(int arr[]){
    int big = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
        if (big < arr[i]) {
            big = arr[i];
        }
    }

    System.out.println("Largest value: " + big);
    }
    
    public static void main(String args[]){
       
        // int marks[] = {23,45,49};
        // update(marks);
        // show(marks);
        

        int arr[] = {-2,-3,4,-1,-2,1,5,-3};

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num1 = sc.nextInt();
         System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();
         
        int sum = num1 + num2;
        int diff = num1 -num2;
        System.out.println("The sum is : " + sum);
        System.out.println("The diff is : " + diff);


        // int index = binary(arr, 51);
        // System.out.println("Key found at index: " + index);

        // reverse(arr);


        // int finder[] = {23,345,12,44,45,21,4545};
        // int key= 11;

        // linear(finder, key);
        // biggest(finder);
        
        // Scanner sc = new Scanner(System.in);


        // System.out.println("Enter the values : ");

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("MATHS : "+marks[0]);
        // System.out.println("PHY"+marks[1]);
        // System.out.println("CHEM"+marks[2]);

        // oddEVEN(arr);
        // subarrays(arr);
        // kadans(arr);
        //pairs(arr);

        // tapping(arr);




    }

    public static void summesation(int arr[]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.print("The sum of all the values are : "+ sum);
    }

    public static void oddEVEN(int arr[]){
        int odd =0, even =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("No of odds in a given array is : "+ odd);
        System.out.println("No of evens in a given array is : "+ even);

    }

    public static void reverse2(int arr[]){
        for(int start=0, end = arr.length-1;start<end;start++,end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        show(arr);
    }

    public static void subarrays(int arr[]){

        int max = Integer.MIN_VALUE;
        int val = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                for(int k=j+1; k<arr.length; k++){
                    System.out.print("("+arr[i]+","+arr[j]+","+arr[k]+") ");
                    val =  arr[i] + arr[j] + arr[k];
                    System.out.println("Subarrays value is : " + val);
                     if(max < val){
                        max = val;
                    }
                }
            }
            System.err.println();
        }
        System.out.println("Maximum subarray value is :" + max);
    }

    public static void pairs(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i]+","+arr[j]+") ");

            }
            System.out.println();
        }
    }

    public static void kadans(int arr[]){
        int mx = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<arr.length;i++){
            sum += arr[i];
            if(sum < 0){
                sum =0;
            }
            mx = Math.max(sum, mx);
        }

        System.out.println(" Maximum sum is : "+ mx);
    }


    public static void tapping(int arr[]){

        int maxH = 0;
    

    
        for(int i=1; i<arr.length-1;i++){
            int leftH = arr[i];
            int rightH = arr[arr.length-1];
            if(maxH < arr[i]){
                maxH = arr[i];
            }
            System.out.println(leftH);
            System.out.println(rightH);
            System.out.println(maxH);
        }
       
        

    }





    
}



