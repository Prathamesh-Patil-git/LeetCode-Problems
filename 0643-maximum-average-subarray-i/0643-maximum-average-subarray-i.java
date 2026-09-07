class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k-1;
        double sum = 0;

        for(int i = 0; i<k;i++){
            sum+=nums[i];
        }

        double maxSum = sum;
    
        while(right != nums.length-1){
            sum = sum - nums[left] + nums[right+1];
            maxSum = Math.max(maxSum,sum);
            left++;
            right++; 
        }
        return maxSum/k;
    }
}