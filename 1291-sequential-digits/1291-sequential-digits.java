class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> list = new ArrayList<>();
        String dg = "123456789";
        for(int ln=2;ln<=9;ln++){
            for(int i=0;i+ln<=9;i++){
                String s = dg.substring(i,i+ln);
                int n = Integer.parseInt(s);
                if(n>=low && n<=high){
                    list.add(n);
                }
            }
        }
        Collections.sort(list);
        return list;
    }
}