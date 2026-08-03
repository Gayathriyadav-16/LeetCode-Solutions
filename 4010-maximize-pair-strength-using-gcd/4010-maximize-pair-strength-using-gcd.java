class Solution {
    public long maxPairStrength(int[] nums) {
        long res =0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long g = gcd(nums[i], nums[j]);
                long s = (1L * nums[i] * nums[j]) / (g * g);
                res = Math.max(res, s);
            }
        }

        return res;
    }
    int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        // int hcf = a;
        // int lcm = a*b/hcf;
        return a;
    }
}