class Solution {
    public int maximum69Number (int num) {
        char ar[] = String.valueOf(num).toCharArray();
        for(int i=0;i<ar.length;i++){
            if(ar[i] == '6'){
                ar[i] ='9';
                break;
            }
        }
        String s = new String(ar);
        return Integer.parseInt(s);

        
    }
}