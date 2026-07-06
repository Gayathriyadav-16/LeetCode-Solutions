class Solution {
    public int numberOfSpecialChars(String word) {
        int cn=0;
        for(char ch='a';ch<='z';ch++){
            int sl = word.lastIndexOf(ch);
            int cf = word.indexOf(Character.toUpperCase(ch));
            if(sl != -1 && cf != -1 && sl < cf){
                cn++;
            }
        }
        return cn;
    }
}