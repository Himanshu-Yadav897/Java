public class SudokuSolver {
    public static boolean SudokuSol(int sudoku[][], int rows , int cols){
        // Base Case
        if(rows == 9){
            return true;
        }

        // Recursion
        int nextRows = rows; 
        int nextCols = cols+1;
        if(cols +1 == 9){
            nextRows = rows +1;
            nextCols = 0;
        }


    if(sudoku[rows][cols] != 0){
        return SudokuSol(sudoku, nextRows, nextCols);
    }

        for(int digit =0; digit <=9;digit++){
            if(isSafe(sudoku , rows , cols , digit)){
                sudoku[rows][cols] = digit;
                if(SudokuSol(sudoku ,nextRows, nextCols )){
                    return true;
                }
                sudoku[rows][cols] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][] , int rows, int cols , int digit){
          //row
          for(int j=0; j<9; j++) {
            if(sudoku[rows][j] == digit) {
                return false;
            }
        }
        //col
        for(int i=0; i<9; i++) {
            if(sudoku[i][cols] == digit) {
                return false;
            }
        }
           //grid
           int sr = (rows/3)*3; // Starting Rows
           int sc = (cols/3)*3; // Starting columns
           // 3 x3 grid
           for(int i=sr; i<sr+3; i++) {
               for(int j=sc; j<sc+3; j++) {
                   if(sudoku[i][j] == digit) {
                       return false;
                   }
               }
           }
           return true;
    }

    public static void printSudoku(int sudoku[][]) {
        for(int i=0; i<sudoku.length; i++) {
            for(int j=0; j<sudoku.length; j++) {
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
        {4, 9, 0, 1, 5, 7, 0, 0, 2}, 
        {0, 0, 3, 0, 0, 4, 1, 9, 0}, 
        {1, 8, 5, 0, 6, 0, 0, 2, 0}, 
        {0, 0, 0, 0, 2, 0, 0, 6, 0}, 
        {9, 6, 0, 4, 0, 5, 3, 0, 0}, 
        {0, 3, 0, 0, 7, 2, 0, 0, 4}, 
        {0, 4, 9, 0, 3, 0, 0, 5, 7}, 
        {8, 2, 7, 0, 0, 9, 0, 1, 3} };


        if(SudokuSol(sudoku, 0, 0)) {
            System.out.println("solution exists");
            printSudoku(sudoku);
        } else {
            System.out.println("solution doesn't exist");
        }
    }
}
