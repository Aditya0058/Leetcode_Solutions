class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int number=0;
        int n = nums.length;
        int consecutive = 0;
    
        for(int i = 0; i<n; i++){
            if(nums[i] == 1){
                number++;
            } else{
                if(consecutive < number){
                    consecutive = number;
                }
                number = 0;
            }
            
            
        }
        if(consecutive < number){
                    consecutive = number;
        }

        return consecutive;
    }
}