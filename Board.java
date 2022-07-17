import java.util.Arrays;
import java.util.Random;

public class Board {
    int rows, columns, difficulty;
    private Cell[][] board;

    public Board() {
        this.rows = 20;
        this.columns = 20;
        this.difficulty = 20;
        initialize();
    }

    public Board(int rows, int columns, int difficulty) {
        this.rows = rows;
        this.columns = columns;
        this.difficulty = difficulty;
        initialize();

    }

    private void initialize() {
        board = new Cell[columns][rows];        // Create Memory
        for(int c = 0; c < columns; c++){
            for(int r = 0; r < rows; r++){
                board[c][r] = new Cell();
            }
        }

        Random random = new Random();       
        for (int c = 0; c < columns; c++) {         // Fill Memory Array
            for (int r = 0; r < rows; r++) {
                if (random.nextInt(100) < difficulty) { // If random int is less than difficulty then
                    board[c][r].setValue(-1); // Mark this cell as a bomb
                    increaseNeighbors(c, r); // Increase the value of neighboring cells
                }
            }
        }
    }

    private void increaseNeighbors(int column, int row) {
        for (int c = -1; c < 2; c++) {
            for (int r = -1; r < 2; r++) {
                try {
                    Cell cell = board[column + c][row + r];
                    cell.increaseValue();
                } catch (Exception e) {
                }
            }
        }

    }

    public void displayBoard() {
        for (int c = 0; c < columns; c++) {
            for (int r = 0; r < rows; r++) {
                Cell cell = board[c][r];
                if (cell.getValue() == -1)
                    System.out.print("B");
                else
                    System.out.print(cell.getValue());
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public class Cell {
        private int value = 0;
        private boolean visable = true;

        public Cell() {
            this.value = 0;
            this.visable = true;
        }

        public Cell(int value) {
            this.value = value;
            this.visable = true;
        }

        public void setVisable(boolean visable) {
            this.visable = visable;
        }

        public boolean getVisable() {
            return this.visable;
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public boolean increaseValue() {
            if (this.value == -1)
                return false;
            else
                this.value++;
            return true;
        }
    }
}
