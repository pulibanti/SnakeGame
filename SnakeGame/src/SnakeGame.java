import javax.swing.*;

public class SnakeGame extends JFrame {
    GameBoard gameBoard;
    SnakeGame(){
        gameBoard=new GameBoard();
        add(gameBoard);
        setResizable(false);
        pack();
        //setBounds(100,100,400,400);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SnakeGame snakeGame=new SnakeGame();
    }
}
