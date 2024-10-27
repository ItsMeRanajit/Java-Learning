
public class sudokuSolver {
    public static void main(String args[]) {
        int[][] sudokuBoard = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };
        solveSudoku(sudokuBoard, 0, 0);
    }

    private static boolean solveSudoku(int[][] board, int row, int col) {
        int r = -1;
        int c = -1;
        if (row == board.length) {
            printBoard(board);
            return true;
        }
        if (col < board.length - 1) {
            r = row;
            c = col + 1;
        } else {
            r = row + 1;
            c = 0;
        }
        if (board[row][col] != 0) {
            if (solveSudoku(board, r, c))
                return true;
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, row, col, i)) {
                    board[row][col] = i;
                    if (solveSudoku(board, r, c))
                        return true;
                    else
                        board[row][col] = 0;
                }
            }
        }
        return false;
    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {

        // calculating the starting index of the corresponding grid
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        // row
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num)
                return false;
            if (board[row][i] == num)
                return false;
        }
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        // System.out.println(Arrays.deepToString(board));
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
