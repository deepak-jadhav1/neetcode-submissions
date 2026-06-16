class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int Max_Sum=Integer.MIN_VALUE;
        int currSum=0;
        for(int num:nums){
            currSum += num;
            Max_Sum=Math.max(Max_Sum,currSum);
            if(currSum < 0) currSum = 0;
        }
        return Max_Sum;
    }
}
