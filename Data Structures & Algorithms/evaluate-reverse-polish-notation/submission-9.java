class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numbersStack = new Stack<>();
        if (tokens.length == 1)
            return Integer.parseInt(tokens[0]);
        for (String s : tokens) {
            if (!s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/")) {
                numbersStack.push(Integer.parseInt(s));
            } else {
                int x = numbersStack.pop();
                int y = numbersStack.pop();
                switch (s) {
                    case "+":
                        numbersStack.push(y + x);
                        break;
                    case "-":
                        numbersStack.push(y - x);
                        break;
                    case "*":
                        numbersStack.push(y * x);
                        break;
                    case "/":
                        numbersStack.push(y / x);
                        break;
                }
            }
        }
        return numbersStack.peek();
    }
}
