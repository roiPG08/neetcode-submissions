class Solution {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append('#').append(s);
        }
        System.out.println(encodedString);

        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiterPos = str.indexOf('#', i);

            // 2. Parse EVERYTHING between 'i' and the delimiter as the length.
            // This easily handles multi-digit numbers like "12" or "105".
            int length = Integer.parseInt(str.substring(i, delimiterPos));
            System.out.println(str.substring(i, delimiterPos));

            // 3. The actual word starts right after the '#'
            int start = delimiterPos + 1;
            int end = start + length;

            // 4. Extract the word and add it to our list
            decodedString.add(str.substring(start, end));

            // 5. Jump 'i' directly to the start of the next encoded chunk.
            // A while loop is perfect here because we control exactly where 'i' goes,
            // avoiding the automatic +1 from a for loop.
            i = end;
        }
        return decodedString;
    }
}

// for (int i = 0; i < str.length(); i++) {
//     if (Character.isDigit(str.charAt(i))) {
//         int length = str.charAt(i) - '0';
//         int start = i + 2;
//         int end = start + length;
//         if (end > str.length()) {
//             break;
//         }
//         decodedString.add(str.substring(start, end));
//         i += length;
//     }
// }