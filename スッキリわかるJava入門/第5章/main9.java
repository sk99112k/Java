package スッキリわかるJava入門.第5章;
public class main9 {
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}
