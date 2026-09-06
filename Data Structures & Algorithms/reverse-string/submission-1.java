class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        // for (int i = 0; i < s.length / 2; i++) {
        //     char tmp = s[i];
        //     s[i] = s[end];
        //     s[end] = tmp;
        //     end--;
        // }

        while (start < s.length/2) {
            char tmp = s[start];
            s[start] = s[end];
            s[end] = tmp;
            end--;
            start++;
        }
    }
}