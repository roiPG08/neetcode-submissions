class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length())
            return result;

        int[] charCountWindow = new int[26];
        int[] charCountP = new int[26];
        int windowSize = p.length();
        for (char c : p.toCharArray()) {
            charCountP[c - 'a']++;
        }

        for (int right = 0; right < s.length(); right++) {
            // add new char to array
            charCountWindow[s.charAt(right) - 'a']++;

            if (right >= windowSize) {
                // remove first
                charCountWindow[s.charAt(right - windowSize) - 'a']--;
            }
            if (right >= windowSize - 1) {
                // check
                if (Arrays.equals(charCountWindow, charCountP)) {
                    // add to result l
                    result.add(right - windowSize + 1);
                }
            }
        }

        return result;
    }
}

// public List<Integer> findAnagrams(String s, String p) {
//         int[] charCountWindow = new int[26];
//         int[] charCountP = new int[26];
//         int l = 0;
//         int r = p.length() - 1;
//         List<Integer> result = new ArrayList<>();

//         if(s.length() < p.length()){
//             return new ArrayList();
//         }

//         for (char c : p.toCharArray()) {
//             charCountP[c - 'a']++;
//         }

//         for (int i = l; i <= r; i++) {
//             charCountWindow[s.charAt(i) - 'a']++;
//         }
//         // check
//         if (Arrays.equals(charCountWindow, charCountP)) {
//             // add to result l
//             result.add(l);
//         }

//         while (r < s.length() - 1) {
//             // remove first
//             charCountWindow[s.charAt(l) - 'a']--;
//             // move window right
//             l++;

//             // move window
//             r++;
//             // add new char to array
//             charCountWindow[s.charAt(r) - 'a']++;

//             // check
//             if (Arrays.equals(charCountWindow, charCountP)) {
//                 // add to result l
//                 result.add(l);
//             }
//         }

//         return result;
//     }
