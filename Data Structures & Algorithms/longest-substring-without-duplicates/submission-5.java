class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1)
            return s.length();

        HashSet<Character> set = new HashSet<>();

        int maxRes = 0;
        int l = 0;

        set.add(s.charAt(l));
        for (int i = 1; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            maxRes = Math.max(maxRes, i - l + 1);
        }
        return maxRes;
    }
}
