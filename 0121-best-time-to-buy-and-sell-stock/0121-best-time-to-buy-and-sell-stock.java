class Solution {
    public int maxProfit(int[] prices) {
        // int min = Integer.MAX_VALUE;
        // int pf = 0;
        // for(int pr : prices){
        //     min = Math.min(min,pr);
        //     pf = Math.max(pf,pr-min);
        // }
        // return pf;
        int min = prices[0];
        int maxpf = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }
            else{
                int pf = prices[i]-min;
                maxpf = Math.max(maxpf,pf);
            }
        }
        return maxpf;
        
    }
}