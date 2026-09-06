class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return new ArrayList<>();
        }
        
        Arrays.sort(strs);

        HashMap<String, List<String>> groupedAnagrams = new HashMap<>();

        for(String s : strs){
            char[] sChars = s.toCharArray();
            Arrays.sort(sChars);
            String key = String.valueOf(sChars);

            if(!groupedAnagrams.containsKey(key)){
                groupedAnagrams.put(key, new ArrayList());
            }

            groupedAnagrams.get(key).add(s);
        }
        return new ArrayList<>(groupedAnagrams.values());
    }
}
