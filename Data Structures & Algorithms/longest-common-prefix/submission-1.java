class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char[] word1 = strs[0].toCharArray();
         for(int j=0; j < word1.length; j++){
            for(int i=1; i < strs.length; i++){
                if(j == strs[i].length() || strs[i].charAt(j) != word1[j]){
                    return sb.toString();
                }
            }
            sb.append(word1[j]);
        }
        return sb.toString();
    }
}