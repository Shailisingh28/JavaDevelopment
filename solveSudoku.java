public class solveSudoku {
    static int check;

    public static void solveSudoku(char board[][]) {
        sudoku(board, 0, 0);

    }

    public static void sudoku(char board[][], int row, int col) {
        int n = board.length;
        if (row == n) {
            check = 1;
            return;
        }
        if (board[row][col] != '.') {
            if (col < n - 1)
                sudoku(board, row, col + 1);
            else
                sudoku(board, row + 1, 0);
        } else {
            for (char i = '1'; i <= '9'; i++) {
                if (isvalid(board, row, col, i)) {
                    board[row][col] = i;
                    if (col < n - 1)
                        sudoku(board, row, col + 1);
                    else
                        sudoku(board, row + 1, 0);
                    if (check == 1)
                        return;
                    board[row][col] = '.';
                }
            }
        }
    }

    public static boolean isvalid(char sudoku[][], int row, int col, char num) {
        for (int j = 0; j < sudoku.length; j++) {
            if (j != col && sudoku[row][j] == num)
                return false;
        }
        for (int i = 0; i < sudoku.length; i++) {
            if (i != row && sudoku[i][col] == num)
                return false;
        }
        int srow = row / 3 * 3;
        int scol = col / 3 * 3;
        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (i == row && j == col)
                    continue;
                if (sudoku[i][j] == num)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char sudoku[][] = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        solveSudoku(sudoku);
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
