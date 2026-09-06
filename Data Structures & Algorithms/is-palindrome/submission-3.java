class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }

        int l = 0; // 1st pointer from left
        int r = s.length() - 1;

        while (l < r) {
            while (l < r && !isLetterOrDigit(s.charAt(l))) {
                l++;
            }
            while (r > l && !isLetterOrDigit(s.charAt(r))) {
                r--;
            }
            System.out.println(s.charAt(l) + " " + s.charAt(r));
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean isLetterOrDigit(char c) {
        return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
    }
}





















// if (s.length() <= 1) {
//     return true;
// }

// int pointer = s.length() - 1;
// int i = 0;
// while (i < pointer) {
//     while (i < pointer && !Character.isLetterOrDigit(s.charAt(i))) {
//         i++;
//     }
//     // if (i > pointer && !isLetterOrDigit(s.charAt(pointer))) {
//     //     pointer--;
//     // }
//     while (pointer > i && !Character.isLetterOrDigit(s.charAt(pointer))) {
//         pointer--;
//     }

//     if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(pointer))) {
//         return false;
//     }
//     pointer--;
//     i++;
// }
// return true;