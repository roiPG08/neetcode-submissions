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
            int delimiterIndex = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i, delimiterIndex));
            System.out.println(length);

            int start = delimiterIndex + 1;
            int end = start + length; 

            decodedString.add(str.substring(start, end));

            i = end;
        }
        return decodedString;
    }
}