class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder();
        int cn =1;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length && chars[i-1] == chars[i]){
                cn++;
            }
            else{
                s.append(chars[i-1]);
                if(cn>1){
                    s.append(cn);
                }
                cn = 1;
            }
        }
        for(int i=0;i<s.length();i++){
            chars[i] = s.charAt(i);
        }
        return s.length();
        
    }
}