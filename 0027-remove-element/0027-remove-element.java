class Solution {
    public int removeElement(int[] nums, int val) {
        // int num[] = new int[nums.length];
        // int j=0,cnt=0;
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]!=val){
        //         num[j++] = nums[i];
        //         cnt++;
        //     }
        // }
        // for(int i=0;i<num.length;i++){
        //     nums[i] = num[i];
        // }
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++] = nums[i];
            }
        }
        //return cnt;
        return j;    
    }
}