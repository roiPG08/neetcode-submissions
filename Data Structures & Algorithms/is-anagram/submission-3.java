public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Integer> annagramMap1 = new HashMap<>();
        HashMap<Character, Integer> annagramMap2 = new HashMap<>();

        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();

        // for(char letter : charS){
        //     annagramMap1.put(letter, annagramMap1.getOrDefault(letter, 0) + 1);
        // }

        // for(char letter : charT){
        //     annagramMap2.put(letter, annagramMap2.getOrDefault(letter, 0) + 1);
        // }

        // return annagramMap1.equals(annagramMap2);

        // Arrays.sort(charS);
        // Arrays.sort(charT);

        int[] count = new int[26];
        for(int i = 0; i < charS.length; i++){
            count[charS[i] - 'a']++;
            count[charT[i] - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}