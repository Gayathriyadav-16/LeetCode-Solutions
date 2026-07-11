class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int nums1[] = new int[2*n];
        int m = nums1.length;
        int i=0;
        while(i<n){
            nums1[i] = nums[i];
            i++;
        }
        for(int j=0;j<n;j++){
            nums1[i] = nums[j];
            i++;
        }
        return nums1;
        
    }
}