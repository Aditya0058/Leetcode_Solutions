class Solution {
    public int singleNumber(int[] nums) {
        int n  = nums.length;
        for(int j = 0; j<n; j++){
            int number = 0;
            for(int i = 0; i<n; i++){
                if(nums[j] == nums[i]){
                    number++;
                }
            }
            if(number == 1){
                return nums[j];
            }
        }
        return -1;
    }

}