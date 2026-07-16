class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd =0,sumeven=0;
        int cn1=0,cn2=0;
        // for(int i=1;cn1<n||cn2<n;i++){
        //     if(cn1!=n || cn2!=n){
        //         if(i%2==0){
        //             sumeven += i;
        //             cn1++;
        //         }
        //         else{
        //             sumodd += i;
        //             cn2++;
        //         }
        //     }
        // } or
        for(int i=0;cn1<n||cn2<n;i++){
            if(i%2==0 && cn1!=n){
                sumeven += i;
                cn1++;
            }
            else if(i%2!=0 && cn2!=n){
                sumodd += i;
                cn2++;
            }
        }
        int a = sumodd;
        int b = sumeven;
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        int gcd = a;
        return gcd;
        
    }
}