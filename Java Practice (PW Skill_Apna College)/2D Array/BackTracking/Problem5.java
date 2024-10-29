// Rat in a Maze

public class Problem5{

    public static void ratMaze(int maze[][] , int row , int col, int sol[][]){
        // Base Case
        if(row == maze.length-1 && col == maze.length -1){
            sol[row][col] = 1;
            print(sol);
            return;
        }


        if(isSafe(maze, row, col)){
            sol[row][col] = 1;

            if(row + 1 < maze.length){
                ratMaze(maze, row+1, col, sol);
            }

            if(col+1 < maze.length){
                ratMaze(maze, row, col+1, sol);
            }

            sol[row][col] = 0;
        }
    }

    public static boolean isSafe(int maze[][], int row, int col){
        int n = maze.length;
        return ( row >= 0 && row < n &&  col >= 0 && col < n && maze[row][col] == 1);
    }

    public static void print(int sol[][]){
        System.out.println();
        for(int i= 0; i<sol.length;i++){
            for(int j = 0;j<sol.length;j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {0, 1, 1, 1},
            {1, 1, 1, 1}
        };

        int n = maze.length;
        int sol[][] = new int[n][n];

        ratMaze(maze,0,0,sol);
    }
}