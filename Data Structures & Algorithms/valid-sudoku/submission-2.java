class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                char currentVal = board[i][j];
                if (currentVal != '.') {
                    if (!seen.add(currentVal + " found in row " + i)
                        || !seen.add(currentVal + " found in column " + j)
                        || !seen.add(currentVal + " found in sub-box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
