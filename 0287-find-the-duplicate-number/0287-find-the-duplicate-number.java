class Solution {
    public int findDuplicate(int[] nums) {
        int temp = 0;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //             temp = nums[i];
        //             break;
        //         }
        //     }
        // }
        // return temp;
        HashSet<Integer>  set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                temp = nums[i];
                break;
            }
            set.add(nums[i]);
        }
        return temp;
        
    }
}