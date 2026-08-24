class Solution {
    public boolean isMonotonic(int[] nums) {
        
        for(int i = 0; i <nums.length -1; i++){

            if(nums[0] < nums[nums.length-1]){
                if(nums[i+1] < nums[i]){
                    return false;
                }
            }else{
                
                if(nums[i] < nums[i+1]){
                    return false;
                }
            }
        }
        return true;
    }
}