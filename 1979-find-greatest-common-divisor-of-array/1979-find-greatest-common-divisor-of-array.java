class Solution {
    public int findGCD(int[] nums) {
        //smallest number
    int small = nums[0];
    for(int i=0;i<nums.length; i++){
        if(nums[i]<small){
            small = nums[i];
        }
    }
    //largestnumber
    int large = nums[0];
    for(int i=0;i<nums.length; i++){
        if(nums[i]>large){
            large = nums[i];
        }
    }
    //find divisiors
    //small
    List<Integer> smalldivisors = new ArrayList<>();
    for(int i = 1; i<=small; i++){
        if(small%i == 0){
            smalldivisors.add(i);
        }
    }
    //large
    List<Integer> largedivisors = new ArrayList<>();
    for(int i = 1; i<=large; i++){
        if(large%i == 0){
            largedivisors.add(i);
        }
    }
    //sorting
    Collections.sort(smalldivisors);
    Collections.sort(largedivisors);

    // find gcd
    for(int i = smalldivisors.size()-1; i>=0; i--){
        if(largedivisors.contains(smalldivisors.get(i))){
            return smalldivisors.get(i);
        }
    }
    return 0;
    }
}