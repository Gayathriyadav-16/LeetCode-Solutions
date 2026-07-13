class Solution {
    public boolean isThree(int n) {
        int cnt=0;
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(i*i == n){
                    cnt++;
                }
                else{
                    cnt+=2;
                }
            }

        }
        if(cnt == 3){
            return true;
        }
        return false;
        
    }
}