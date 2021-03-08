import java.util.Arrays;
class Main {
  public static void main(String[] args) {
    String word = "canned";
    int index = 0;
    char letter1 = word.charAt(index);
    char letter2 = word.charAt(index);

    for (int i = 0; i < word.length(); i++) {
      letter1 = word.charAt(i);
      letter2 = word.charAt(i+1);
      if (letter1 == "a" &&! letter2 == "a") {
        word = word.substring(0, i-1) + word.substring(i, i+1) + word.substring(i-1, i) + word.substring(i+1, word.length());
      }
    }
    System.out.println(word);
  }
}
