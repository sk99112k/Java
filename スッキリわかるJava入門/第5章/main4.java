package スッキリわかるJava入門.第5章;
public class main4 {
  public static void main(String[] args) {
    add(50, 30);
    add(100, 200);
  }
  public static void add(int x, int y) {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }

  //コンパイルエラーの例
  public static void main1(String[] args) {
    methodA(100, "abc");
  }
  public static void methodA(String x, int y) {
    System.out.println(x + y);
  }
}
