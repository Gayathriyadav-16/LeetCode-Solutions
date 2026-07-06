class Solution {
    public int maxDistance(String moves) {
        int x =0,y=0,z=0,sum=0;
        // int z=0;
        // int sum =0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'U'){
                y++;
            }
            else if(ch == 'D'){
               y--;
            }
            else if(ch == 'R'){
                x++;
            }
            // else if(ch == '_'){
            //     if(i == moves.length() -1){
            //         sum += 1;
            //     }
            //     else if(moves.charAt(i+1) == 'D'|| moves.charAt(i+1) == 'L'){
            //         sum -= 1;
            //     }
            //     else{
            //         sum += 1;
            //     }
            else if(ch == 'L'){
                x--;
            }
            else{
                z++;
            }
            sum = Math.abs(x)+Math.abs(y) +z;
        }
        return sum ;
        
    }
}