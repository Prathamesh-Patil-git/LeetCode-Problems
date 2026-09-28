class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int currentAvg = 0;
        int currentSum = 0;
        int subArrays = 0;

        for(int i = 0;i<k; i++){
            currentSum+=arr[i];
        }

        currentAvg = currentSum/k;
        if(currentAvg >= threshold){
            subArrays++;
        }

        int left = 0;
        int right = k;

        while(right < arr.length){

            currentSum = currentSum - arr[left] + arr[right];
            currentAvg = currentSum/k;

            if(currentAvg >= threshold){
                subArrays++;
            }

            left++;
            right++;
        }
        return subArrays;
    }
}