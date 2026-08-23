class Solution {
    public int getLucky(String s, int k) {
        char ar[] = new char[27];
        char c = 'a';
        ar[1] = 'a';
        for(int i=2;i<=26;i++){
            c++;
            ar[i] = c;
        }
        int n = s.length();
        String p="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=1;j<27;j++){
                if(ch == ar[j]){
                    p += j;
                    break;
                }
            }
        }
        for(int i=0;i<k;i++){
            int sum =0;
            for(int j=0;j<p.length();j++){
                sum += p.charAt(j)-'0';
            }
            p = String.valueOf(sum);
        }
        return Integer.parseInt(p);
    }
}