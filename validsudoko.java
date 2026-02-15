public class validsudoko {
    public static boolean validsudoko(char[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                if (sudoku[i][j] == '.')
                    continue;
                if (isvalid(sudoku, i, j) == false)
                    return false;
            }
        }
        return true;
    }

    public static boolean isvalid(char[][] sudoku, int row, int col) {
        char num = sudoku[row][col];

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
        char sudoku[][] = { { '5', '3', '.', '.', '7', '5', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(validsudoko(sudoku));
    }

}
