class Solution {
    public int singleNumber(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            int temp=0;
            for(int j = 0; j<nums.length; j++){
                if(j!=i){
                    if(nums[j] == nums[i]){
                        temp++;
                    }
                }
            }
            if(temp == 0){
                return nums[i];
            }
        }
        return 0;
    }

}