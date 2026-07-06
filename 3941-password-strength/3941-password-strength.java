class Solution {
    public int passwordStrength(String password) {
        int sum =0;
        // HashSet<Character> set = new HashSet<>();
        // String res ="";
        // for(int i=0;i<password.length();i++){
        //     if(!set.contains(password.charAt(i))){
        //         set.add(password.charAt(i));
        //         res+=password.charAt(i);
        //     }
        // }
        HashSet<Character> set = new HashSet<>();
        String res="";
        for(char c : password.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                res+=c;
            }
        }
        for(int i=0;i<res.length();i++){
            char c = res.charAt(i);
            if(c>='a' && c<='z'){
                sum++;
            }
            if(c>='A' && c<='Z'){
                sum+=2;
            }
            if(c>='0' && c<='9'){
                sum+=3;
            }
            if(c == '!' || c == '@' || c == '#' || c == '$'){
                sum+=5;
            }
            
        }
        return sum;
    }
}