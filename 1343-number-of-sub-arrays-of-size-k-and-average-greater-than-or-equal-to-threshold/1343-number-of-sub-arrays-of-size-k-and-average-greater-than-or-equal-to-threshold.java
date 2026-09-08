class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int subArrays=0;
        int sum = 0;
        for(int i = 0; i <k;i++){
            sum+=arr[i];
        }
        if(sum >= k * threshold){
            subArrays++;
        }

        int left = 1;
        int right = left+k-1;

        while(right<arr.length){

            sum = sum - arr[left-1] + arr[right];
            if(sum >= k * threshold){
                subArrays++;
            }
            left++;
            right++;
        }
        return subArrays;
    }
}