class Solution {
    public int numOfSubarrays(int[] arr) {
        // int cn=0;
        // for(int i=0;i<arr.length;i++){
        //     int sum =0;
        //     for(int j=i;j<arr.length;j++){
        //         //int sum =0;
        //         // for(int k=i;k<=j;k++){
        //              sum += arr[j];
        //         // }
        //         if(sum%2 !=0){
        //             cn++;
        //         }
        //     }
        // }
        // return cn;    
        int odd = 0;
        int even = 1;  
        int sm = 0;
        int res = 0;
        int mod = 1000000007;

        for (int i = 0; i < arr.length; i++) {
            sm += arr[i];
            if (sm % 2 == 0) {
                res += odd;   
                even++;
            }
            else {
                res += even;  
                odd++;
            }
            res %= mod;
        }
        return res;
    }
}
