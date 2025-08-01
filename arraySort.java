public class arraySort {
    public static void main(String[] args){
        int arr[] = {2,1,4,5,60};
        find(arr, 5); // change this to test other numbers
    }

    public static void find(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Target found at index: " + i);
                return; // exit after finding
            }
        }

        // If the loop finishes without finding
        System.out.println("Target doesn't exist.");
    }
}
