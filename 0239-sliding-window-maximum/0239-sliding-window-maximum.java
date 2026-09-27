class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[(nums.length - k)+1];
        int ansIndex = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        

        for(int i = 0; i<k;i++){
           
            while(!dq.isEmpty() && nums[i] > nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        ans[ansIndex] = nums[dq.peekFirst()];
        ansIndex++;

        int left = 0;
        int right = k;
        while( right < nums.length){

            while(!dq.isEmpty() && dq.peekFirst() < left+1){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[right] > nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offerLast(right);

            ans[ansIndex++] = nums[dq.peekFirst()];
            left++;
            right++;

        }   
        return ans;
    }
}