class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        // finding max and min
        for (int i = 1; i<nums.length; i++){
            if (nums[i]>max){
                max = nums[i];
            }
            if (nums[i]<min){
                min = nums[i];
            }
        }
        ArrayList<Integer> minFactors = new ArrayList<>();
        for (int i = 1; i<=Math.sqrt(min);i++){
            if(min%i==0){
                minFactors.add(i);
                if(!minFactors.contains(min/i)){
                    minFactors.add(min/i);
                }
            }
        }
        int temp = 1;
        for(int i =1; i<=Math.sqrt(max); i++){
            if(max%i==0){
                if(minFactors.contains(i) && i>temp){
                    temp = i;
                    
                }
                if(minFactors.contains(max/i) && max/i>temp){
                        temp = max/i;
                    }
            }
        }
        return temp;
    }
}