class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum =0,maxsum =0;
        for(int i=1;i<=nums.length;i++){
            if(i<nums.length && nums[i]>nums[i-1]){
                sum += nums[i-1];
            }
            else{
                sum += nums[i-1];
                maxsum = Math.max(sum,maxsum);
                sum =0;
            }
        }
        return maxsum;
        
    }
}