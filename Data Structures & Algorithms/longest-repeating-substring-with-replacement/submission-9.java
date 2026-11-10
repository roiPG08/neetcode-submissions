class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1)
            return 1;

        int[] count = new int[26]; 
        int result = 0;
        int maxF = 0;
        int l = 0;
        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'A']++;
            maxF = Math.max(maxF, count[s.charAt(r) - 'A']);

            while ((r - l + 1) - maxF > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }
            result = Math.max(result, r - l + 1);
        }

        return result;
    }
}

// SLIDING WINDOW OPTIMAL
// HashMap<Character, Integer> map = new HashMap<>();
// int result = 0;
// int maxF = 0;
// int l = 0;
// for (int r = 0; r < s.length(); r++) {
//     map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
//     maxF = Math.max(maxF, map.get(s.charAt(r)));

//     while ((r - l + 1) - maxF > k) {
//         map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
//         l++;
//     }
//     result = Math.max(result, r - l + 1);
// }

// return result;

// SLIDING WINDOW WITH HashSet
// HashSet<Character> set = new HashSet<>();
// for (char c : s.toCharArray()) {
//     set.add(c);
// }
// for (char c : set) {
//     int l = 0;
//     int count = 0;

//     for (int r = 0; r < s.length(); r++) {
//         if (s.charAt(r) == c) {
//             count++;
//         }

//         while((r - l + 1) - count > k){
//             if(s.charAt(l) == c){
//             count--;
//             }
//             l++;
//         }

//         result = Math.max(result, r-l+1);
//     }
// }