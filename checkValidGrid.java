public class checkValidGrid {
    public static boolean checkValidGrid(int grid[][]) {
        if (grid[0][0] != 0)
            return false;
        return validgrid(grid, 0, 0, 0);
    }

    public static boolean validgrid(int grid[][], int row, int col, int current_num) {
        int n = grid.length;
        if (grid[row][col] == n * n - 1)
            return true;// base condition
        int i, j;
        // 1
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 2
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 3
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 4
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 5
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 6
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 7
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        // 8
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && grid[i][j] == current_num + 1)
            return validgrid(grid, i, j, current_num + 1);
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = {
                { 0, 3, 6 }, { 5, 8, 1 }, { 2, 7, 4 }
        };
        System.out.println(checkValidGrid(arr));
    }
}
