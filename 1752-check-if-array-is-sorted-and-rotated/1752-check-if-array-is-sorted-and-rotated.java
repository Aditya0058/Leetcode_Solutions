class Solution {
    public boolean check(int[] nums) {
        int temp = 0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                temp += 1;
            } 
        }
        if (nums[0]<nums[nums.length-1]){
                temp+=1;
            }
        if(temp >=2){
            return false;
        }else{
            return true;
        }
    }
}