class Solution {
    public static void reverse(int start, int end, int[] arr){
        while(start<end){
            //swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            //updates
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %=n;
        int i = n-k;
        //reverse
        reverse(0, i-1, nums);
        reverse(i, n-1, nums);
        reverse(0, n-1, nums);
    }
}