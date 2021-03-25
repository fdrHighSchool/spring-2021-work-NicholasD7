import java.util.*;
// Board creates the grid on which the cells live.
public class Board {
  private static int generation;
  int numAlive;
  private Cell[][] world;
  private Cell[][] world2;
  private int chance;


  public Board(int r, int c){
    this(r, c, 0);
  }

  public Board(int r, int c, int chance){
    generation = 0;
    world = new Cell[r][c];
    for (int i = 0; i < r; i++){
      for (int j = 0; j < c; j++){
        world[i][j] = new Cell(chance, i, j); //argument determines % chance of being alive at start
      }
    }
    world2 = new Cell[r][c];
  }

  public String toString() {
    return Arrays.deepToString(world);
  }

  //first goes through each value and checks if the neighbor is alive or dead, looks at the state and determinds how many neighbors it has, from there it either changes or doesnt change the state of the cell.
  public void nextGen() {
    int numAlive = 0;
    boolean state;
    arrayCopy(world, world2);
    for(int i = 0; i < world.length; i++) {
      for(int j = 0; j < world[0].length; j++) {
        state = world[i][j].getState();
        numAlive = neighborhoodCheck(j, i);
        world[i][j].setAliveNeighbors(numAlive);
        if(state) {
          if(numAlive < 2 || numAlive > 3) {
            world2[i][j].setState(false);
          }
        } else {
          if(numAlive == 3) {
            world2[i][j].setState(true);
          }
        }
      }
    }
    arrayCopy(world2, world);
    generation++;
  }

//method neighborhoodcheck checks all 8 neighboring cells and checks if they are alive or dead.
  public int neighborhoodCheck(int x, int y) {
    int alive = 0;
    for(int i = y - 1; i < y + 2; i++) {
      for(int j = x - 1; j < x + 2; j++) {
        if(i >= 0 && i < world.length && j >= 0 && j < world[0].length && !(j == x && i == y)) {
          if(world[i][j].getState()) {
            alive++;
          }
        }
      }
    }
    return alive;
  }
//Visuals for board, white for alive, and dark gray for dead.
  public  void draw() {
    String squares = "";
    for(Cell[] row : world) {
      for(Cell cell : row) {
        if(cell.getState()) {
          squares += "⬜ ";
        } else {
          squares += "⬛ ";
        }
      }
      squares += "\n";
    }
    System.out.print(squares);
  }

  public int getGeneration() {
    return generation;
  }

  public void setCellTrue(int x, int y) {
    world[y][x].setState(true);
  }

  public static void arrayCopy(Cell[][] aSource, Cell[][] aDestination) {
    for(int i=0; i<aSource.length; i++) {
      for(int j=0; j<aSource[i].length; j++) {
        aDestination[i][j] = aSource[i][j].clone();
      }
    }
  }

}
