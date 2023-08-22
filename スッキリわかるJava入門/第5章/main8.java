package スッキリわかるJava入門.第5章;
public class main8 {
  public static void printArray(int[] array) {
    for (int element : array) {
      System.out.println(element);
    }
  }

  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    printArray(array); //配列を渡す
  }
}
