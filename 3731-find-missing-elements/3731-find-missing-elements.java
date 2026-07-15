class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        // int sum =0;
        // for(int i=nums[0];i<=nums[n-1];i++){
        //  c   sum += i;
        // }
        // for(int i=0;i<n;i++){
        //     sum -= nums[i];
        // }
        // if(sum!=0){
        // list.add(sum);
        // }
        // return list;
        HashSet<Integer> set = new HashSet<>();
        int max =nums[0];
        int min =nums[0];
        for(int i=0;i<n;i++){
            set.add(nums[i]);
            min = Math.min(nums[i],min);
            max = Math.max(nums[i],max);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}