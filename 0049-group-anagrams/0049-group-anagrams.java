class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String s1 = new String(c);
            if(!map.containsKey(s1)){
                map.put(s1,new ArrayList<>());
            }
            map.get(s1).add(strs[i]);
            }
        return new ArrayList<>(map.values()); 
    }
}