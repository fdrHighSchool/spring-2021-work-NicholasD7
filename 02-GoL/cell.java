public class Cell {
  //fields
  private boolean state;
  private int x;
  private int y;
  private int aliveNeighbors;

  //constructor
  public Cell(int chance, int x, int y){
    int rand = (int)(Math.random() * 100);
    this.x = x;
    this.y = y;

    if (rand < chance){
      this.state = true; //alive
    }//end conditional

    else{
      this.state = false; //dead
    }//end else
  }//end constructor method

public Cell(int x, int y, boolean state, int aliveNeighbors){
    this.x = x;
    this.y = y;
    this.state = state;
    this.aliveNeighbors = aliveNeighbors;
  }

  public boolean getState() {
    return state;
  }

  public void setState(boolean bool) {
    state = bool;
  }

  public void setAliveNeighbors(int n) {
    aliveNeighbors = n;
  }

  public String toString() {
    return "(" + x + ", " + y + ", " + state + ", " + aliveNeighbors + ")";
  }

  public Cell clone() {
    Cell cell = new Cell(this.x, this.y, this.state, this.aliveNeighbors);
    return cell;
  }
} 
