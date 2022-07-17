import javax.swing.JFrame;

public class MineSweeper{
    public static void main(String[] args){
        //Game game = new Game();
        Board board = new Board();
        board.displayBoard();

        /*
         * Operations: 
         * 1. Main Menu 
         *   A. New Game
         *   B. Custom Game
         * 2. New Game
         *   A. Load a New Game With a Default Board
         * 3. Custom Game
         *   A. Rows
         *   B. Rows
         *   C. Difficulty
         * 4. Board
         * 5. Win/Loss Screen
         * 6. Top Bar to start new game
         */
        




    }

    public class Game{
        JFrame frame;

        public Game(){
            Display display = new Display();
            
            frame = new JFrame();
            frame.setTitle("MineSweeper");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(display.getWidth(), display.getHeight());
            frame.setAlwaysOnTop(true);
            frame.setLocation((display.width - display.getWidth()), 10);
            frame.setVisible(true); // make frame visable
            frame.setLayout(null);
        }
    }
}