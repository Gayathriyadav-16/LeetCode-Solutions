class Solution {
    public int countSpecialIntegers(int[] nums) {
        int cnt =0;
        for(int x=0;x<=100;x++){
            int first = -1;
            int last =-1;
            int occ = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i] == x){
                    if(first == -1){
                        first = i;
                    }
                    last = i;
                    occ++;
                }
            }
            if(first != -1 && occ == last-first+1){
                cnt++;
            }
        }
        return cnt;
        // if(nums.length == 1){
        //     return 1;
        // }
        // int cnt = 0;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i] == nums[i-1]){
        //         cnt++;
        //     }
        // }
        // return cnt; 
    }
}