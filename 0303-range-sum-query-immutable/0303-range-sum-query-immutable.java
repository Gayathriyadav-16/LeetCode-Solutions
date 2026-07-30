class NumArray {
    int[] presum;
    public NumArray(int[] nums) {
        presum = new int[nums.length];
        presum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            presum[i] = presum[i - 1] + nums[i];
        }
    }
    public int sumRange(int left, int right) {
        if (left == 0) {
            return presum[right];
        }
        return presum[right] - presum[left - 1];
    }
}