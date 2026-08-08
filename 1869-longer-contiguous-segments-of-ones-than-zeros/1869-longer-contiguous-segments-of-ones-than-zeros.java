class Solution {
    public boolean checkZeroOnes(String s) {
        int cn1 =0,cn2=0,max1=0,max2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                cn1++;
                cn2=0;
                max1 = Math.max(max1,cn1);
            }
            else{
                cn2++;
                cn1=0;
                max2 = Math.max(max2,cn2);
            }
        }
        if(max1>max2){
            return true;
        }
        return false;
    }
}