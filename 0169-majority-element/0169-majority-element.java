class Solution {
    public int majorityElement(int[] arr) {

        // O(n)
        int count =0; 
        int candidate =0;

        for(int num :arr){
            if(count == 0){
                candidate = num;
            }
            if(num != candidate){
                count--;
            }else{
                count++;
            }
        }
        return candidate;



        // O(n^2)
        // int n = arr.length;   
        // for (int i = 0; i < n; i++) {
        //     int count = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (arr[j] == arr[i]) {
        //             count++;
        //         }
        //     }
        //     if (count > n / 2) {
        //         return arr[i];   
        //     }
        // }
        // return -1;
    
}
}