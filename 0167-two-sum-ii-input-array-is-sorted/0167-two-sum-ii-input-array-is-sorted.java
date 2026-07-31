class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int h=numbers.length-1;
        // while(l<h){
        //     int sum=numbers[l]+numbers[h];
        //     if(sum==target){
        //         return new int[]{ l+1, h+1 };
        //     }
        //     if(sum<target){
        //         l++;
        //     }
        //     else{
        //         h--;
        //     }
        // }
        // return new int[] {};
        int p1=0,p2=numbers.length-1;
        while(p1<p2){
            if(numbers[p1]+numbers[p2] == target){
                return new int[]{p1+1,p2+1};
            }
            else if(numbers[p1]+numbers[p2]<target){
                p1++;
            }
            else{
                p2--;
            }
        }
        return new int[] {};
    }
}