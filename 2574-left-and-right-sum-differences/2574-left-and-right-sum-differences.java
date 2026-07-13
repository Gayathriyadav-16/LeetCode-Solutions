class Solution {
    public int[] leftRightDifference(int[] nums) {
        int nums1[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftsum =0,rightsum =0;
            if(i == 0){
                leftsum =0;
                for(int j=i+1;j<nums.length;j++){
                    rightsum += nums[j]; 
                }
                nums1[i] = Math.abs(leftsum-rightsum);
            }
            else if(i == nums.length-1){
                for(int j=0;j<i;j++){
                    leftsum += nums[j];
                }
                rightsum = 0;
                nums1[i] = Math.abs(leftsum-rightsum);
            }
            else{
                for(int j=0;j<i;j++){
                    leftsum += nums[j];
                }
                for(int k=i+1;k<nums.length;k++){
                    rightsum += nums[k];
                }
                nums1[i] = Math.abs(leftsum-rightsum);
            }

        }
        return nums1;
        
    }
}