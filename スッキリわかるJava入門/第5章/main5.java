package スッキリわかるJava入門.第5章;
public class main5 {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args) {
    int ans = add(100, 200);
    System.out.println("100 + 200 = " + ans);
  }
}
