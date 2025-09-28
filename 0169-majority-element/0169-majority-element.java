class Solution {
    public int majorityElement(int[] arr) {

        int count =0;
        int next =0;

        for(int ar : arr){
            if(count ==  0){
                next = ar;
            }
            if(next == ar){
                count ++;
            }else{
                count --;
            }
        }

        return next;
    
}
}