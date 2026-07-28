class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int num:nums){
        //     map.put(num,map.getOrDefault(num,0)+1);
        // }
        // List<Integer> res = new ArrayList<>();
        //     int limit = nums.length/3;
        //     for(int key:map.keySet()){
        //         if(map.get(key)>limit){
        //             res.add(key);
        //         }
        //     }
        // return res;
        int c1=0;
        int c2=0;
        int cn1=0,cn2=0;
        for(int num:nums){
            if(c1==num){
                cn1++;
            }
            else if(c2==num){
                cn2++;
            }
            else if(cn1 ==0){
                c1 = num;
                cn1=1;
            }
            else if(cn2==0){
                c2 = num;
                cn2 = 1;
            }
            else{
                cn1--;
                cn2--;
            }
        }
        cn1=0;
        cn2=0;
        for(int num:nums){
            if(num==c1){
                cn1++;
            }
            else if (num==c2){
                cn2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
            if(cn1>nums.length/3){
                ans.add(c1);
            }
            if(cn2>nums.length/3){
                ans.add(c2);
            }
        return ans;
    }
}