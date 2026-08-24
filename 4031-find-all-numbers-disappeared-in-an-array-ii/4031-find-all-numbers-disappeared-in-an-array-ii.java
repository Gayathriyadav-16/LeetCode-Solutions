class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set = new HashSet<>();
        int st =-1,end =-1;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        List<List<Integer>> li = new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            if(!set.contains(i)){
                if(st == -1){
                    st = i;
                }
                end = i;
            }
            else{
                if(st!=-1 && end !=-1){
                List<Integer> temp = new ArrayList<>();
                temp.add(st);
                temp.add(end);
                li.add(temp);
                st =-1;
                end =-1;
                }
                
            }
        }
        List<Integer> temp = new ArrayList<>();
           if(st != -1 && end != -1){
                temp.add(st);
                temp.add(end);
                li.add(temp);
           }
        return li;
    }
}