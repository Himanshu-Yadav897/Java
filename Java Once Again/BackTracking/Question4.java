public class Question4 {
    public static boolean checker(int maze[][], int sol[][], int x, int y) {
        int n = maze.length;
        if (x < 0 || x >= n || y < 0 || y >= n) {
            return false;
        }

        if (maze[x][y] == 0 || sol[x][y] == 1) {
            return false;
        }

        return true;
    }

    public static void solve(int maze[][], int sol[][], int x, int y) {
        int n = maze.length;
        if (x == n - 1 && y == n - 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(sol[i][j] + " ");
                }
                System.out.println();
            }
            return;
        }

        if (checker(maze, sol, x + 1, y)) {
            sol[x + 1][y] = 1;
            solve(maze, sol, x + 1, y);
            sol[x + 1][y] = 0;
        }
        if (checker(maze, sol, x - 1, y)) {
            sol[x - 1][y] = 1;
            solve(maze, sol, x - 1, y);
            sol[x - 1][y] = 0;
        }
        if (checker(maze, sol, x, y + 1)) {
            sol[x][y + 1] = 1;
            solve(maze, sol, x, y + 1);
            sol[x][y + 1] = 0;
        }
        if (checker(maze, sol, x, y - 1)) {
            sol[x][y - 1] = 1;
            solve(maze, sol, x, y - 1);
            sol[x][y - 1] = 0;
        }
    }

    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 0 }, { 0, 1, 0, 0 }, { 1, 1, 1, 1 } };
        int sol[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sol[i][j] = 0;
            }
        }
        sol[0][0] = 1;
        solve(maze, sol, 0, 0);
    }
}
