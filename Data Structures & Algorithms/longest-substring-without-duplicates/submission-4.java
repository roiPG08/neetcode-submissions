class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        
        HashSet<Character> set = new HashSet<>();
        
        int res = 1;
        int maxRes = 0;
        int l = 0;
        int r = 1;
        
        set.add(s.charAt(l));
        for (int i = 1; i < s.length(); i++) {
            if (!set.add(s.charAt(i))) {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(i));
                res = i - l + 1;
            } else {
                r++;
                res++;
            }
            maxRes = Math.max(maxRes, res);
        }
        return maxRes;
    }
}
