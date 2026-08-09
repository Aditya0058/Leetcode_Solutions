class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int temp=0;
            for(int j = 0; j<n; j++){
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