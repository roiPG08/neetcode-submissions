class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else{
                if(stack.size() > 0 && stack.peek() == '('){
                    stack.pop();
                }else{
                    stack.push(')');
                }
            }
        }

        return stack.size();

    }
}


        // int opening = 0;
        // int closing = 0;

        // for(char c : s.toCharArray()){
        //     if(c == '('){
        //         opening++;
        //     }else{
        //         if(opening > 0){
        //             opening--;
        //         }else{
        //             closing++;
        //         }
        //     }
        // }

        // return opening + closing;