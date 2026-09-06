class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> lock = new HashMap<>();
        char[] letters = s.toCharArray();

        for(char a : letters){
            lock.put(a, lock.getOrDefault(a, 0) + 1);
        }

        for(char b : t.toCharArray()){
            if(lock.getOrDefault(b, 0) > 0){
                lock.put(b, lock.get(b) - 1);
            }else{
                return false;
            }
        }

        return true;
    }
}
