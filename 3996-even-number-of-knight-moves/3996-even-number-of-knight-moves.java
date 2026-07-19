class Solution {
    public boolean canReach(int[] start, int[] target) {
        int stclr = (start[0]+start[1])%2;
        int tarclr = (target[0]+target[1])%2;
        return stclr == tarclr;
    }
}