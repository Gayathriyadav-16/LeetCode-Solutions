class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int pf = 0;
        for(int pr : prices){
            min = Math.min(min,pr);
            pf = Math.max(pf,pr-min);
        }
        return pf;
        
    }
}