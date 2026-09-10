class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int alreadySatisfied = 0;
        int maxUnsatisfied = 0;

        for(int i = 0; i<minutes; i++){
            if(grumpy[i] == 0 ){
                alreadySatisfied+= customers[i];
            }

            if(grumpy[i] == 1){
                maxUnsatisfied+= customers[i];
            }
        }

        int left = 0;
        int right = minutes;
        int currentUnsatisfied = maxUnsatisfied;
        while(right<customers.length){

            if(grumpy[right] == 0){
                alreadySatisfied+=customers[right];
            }

            if(grumpy[left] == 1 && grumpy[right] == 1){
                currentUnsatisfied = currentUnsatisfied - customers[left] + customers[right];
            } else if ( grumpy[left] == 1 && grumpy[right] == 0 ){
                currentUnsatisfied = currentUnsatisfied - customers[left] + 0;
            }else if ( grumpy[left] == 0 && grumpy[right] == 1 ){
                currentUnsatisfied = currentUnsatisfied - 0 + customers[right];
            }
            
            maxUnsatisfied = Math.max(maxUnsatisfied,currentUnsatisfied);

            left++;
            right++;
        }
        return alreadySatisfied + maxUnsatisfied;
    }
}