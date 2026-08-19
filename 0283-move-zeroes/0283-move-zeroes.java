class Solution {
    public void moveZeroes(int[] nums) {
        int scan = 0;
        int insert = 0;
        int n = nums.length;

        while(scan<n && insert<n){
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