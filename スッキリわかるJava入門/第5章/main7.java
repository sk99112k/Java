package スッキリわかるJava入門.第5章;
public class main7 {
//引き数の数が異なる場合
  //一つ目のメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  //二つ目のメソッド
  public static int add(int x, int y, int z) {
    return x + y + z;
  }

  public static void main(String[] args) {
    System.out.println("10+20=" + add(10, 20));
    System.out.println("20+30+40=" + add(20, 30, 40));
  }
}
