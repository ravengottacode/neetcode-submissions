class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean distictElementsInRow = true; boolean distictElementsInCol = true; boolean distictElementsInGrid = true;
        rowLoop:
        for(int i=0;i<board.length;i++){
            HashSet<Character> rowCount = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                if (rowCount.contains(board[i][j])) {
                    distictElementsInRow = false;
                    break rowLoop;
                }
                rowCount.add(board[i][j]);
            }
        }
        
        colLoop:
        for(int i=0;i<board.length;i++){
            HashSet<Character> colCount = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                if (colCount.contains(board[j][i])) {
                    distictElementsInCol = false;
                    break colLoop;
                }
                colCount.add(board[j][i]);
            }
        }


        gridLoop:
         for (int row = 0; row < board.length; row += 3) {
            for (int col = 0; col < board.length; col += 3) {
                HashSet<Character> gridCount = new HashSet<>();
                for (int i = row; i < row + 3; i++) {
                    for (int j = col; j < col + 3; j++) {
                        if (board[i][j] == '.') {
                            continue;
                        }
                        if (gridCount.contains(board[i][j])) {
                            distictElementsInGrid = false;
                            break gridLoop;
                        }
                        gridCount.add(board[i][j]);
                    }
                }
            }
        }

        return distictElementsInRow && distictElementsInCol && distictElementsInGrid;
    }
}
