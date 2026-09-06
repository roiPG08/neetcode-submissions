class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] tChar = t.toCharArray();
        char[] sChar = s.toCharArray();

        int indexS = 0;
        if(s.isEmpty() || s.isBlank()){
            return true;
        }

        for (int indexT = 0; indexT < t.length(); indexT++) {
            if (sChar[indexS] == tChar[indexT]) {
                System.out.println(sChar[indexS] + " == " + tChar[indexT]);
                indexS++;
            }
            if(indexS == s.length()){
                return true;
            }
        }
        System.out.println(indexS + " " + sChar.length);
        return indexS == sChar.length;
    }
}