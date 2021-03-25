import java.util.*;

class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = "";

    //sets the size of the board
    int x = 30;
    int y = 30;

    Board board = new Board(x, y, 0);

    //plugging in cells (coordinate system)
    board.setCellTrue(0,2);
    board.setCellTrue(1,2);
    board.setCellTrue(2,2);
    board.setCellTrue(2,1);
    board.setCellTrue(3,0);
    board.setCellTrue(1,5);
    board.setCellTrue(1,4);
    board.setCellTrue(2,4);

    //turns any version of q into Q
    while(board.getGeneration() == 0 || !input.toUpperCase().equals("Q")) {
      board.draw();
      board.nextGen();
      System.out.print("Enter any letter to keep going, enter \"Q\" to quit: ");
      input = scan.next();
    }
  }
}
