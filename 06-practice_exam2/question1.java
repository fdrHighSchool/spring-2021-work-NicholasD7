import java.util.*;
class Main {
  public static void main(String[] args) {
    propLong(10);
  }

  public static int hailstonelength(int n) {
    int count = 1;
    while (n != 1) {
      if (n%2 == 0) {
        n = n/2;
      }
      else {
        n = 3*n + 1;
      }
      count++;
    }
    return count;
  }

  public static boolean isLongSeq(int n) {
    int islong = hailstonelength(n);
    if (islong > n) {
      System.out.println("true");
      return true;
    }
    else {
      System.out.println("false");
      return false;
    }
  }

  public static double propLong(int n) {
    double count2 = 0.0;
    double proportion = 0.0;
    for (int i = 1; i < n+1; i++) {
      if (isLongSeq(i) == true) {
        count2++;
      }
    }
    proportion = count2/n;
    System.out.println(proportion);
    return proportion;
  }
}
