class Solution {
    int palindrome(String s,int i,int j){
        int n = s.length();
        while(i>=0 && j<n && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return j-i-1;
    }
    public String longestPalindrome(String s) {
    int ans =0;
    int st=0,ed=0;
    int n = s.length();
    for(int i=0;i<n;i++){
        int odd = palindrome(s,i,i);
        int even = palindrome(s,i,i+1);
        int len = Math.max(odd,even);
        if(len>ans){
            ans =len;
            st = i-(len-1)/2;
            ed = i+len/2;
        }
    }
    return s.substring(st,ed+1);
    }
}