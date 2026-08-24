class Solution {
    public boolean isPalindromic(String s) {
//         String t = "";
//         for(int i=0;i<s.length();i++){
//             char c = s.charAt(i);
//             String bi = Integer.toBinaryString(c);
//             t += bi;
//         }
//         int i = 0;
//         int j = t.length()-1;
//         while(i<j){
//             if(t.charAt(i) != t.charAt(j)){
//                 return false;
//             }
//             i++;
//             j--;
//         }
//         return true;
//     }
// }
        String t = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String bi = String.format("%8s", Integer.toBinaryString(c))
                               .replace(' ', '0');
            t += bi;
        }
        int i = 0;
        int j = t.length() - 1;
        while(i < j) {
            if(t.charAt(i) != t.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}