class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int len =0,maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                len++;
            }
            if(nums[i] == 0){
                len =0;
            }
            maxlen = Math.max(len,maxlen);
        }
        return maxlen;
        
    }
}