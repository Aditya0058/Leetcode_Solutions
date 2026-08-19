class Solution {
    public void moveZeroes(int[] nums) {
        int scan = 0;
        int insert = 0;

        while(scan<nums.length && insert<nums.length){
            if(nums[scan]!=0){
                int temp = nums[insert];
                nums[insert] = nums[scan];
                nums[scan] = temp;
                insert++;
                scan++;
            } else {
                scan++;
            }
        }
    }
}