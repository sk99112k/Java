package スッキリわかるJava入門.第5章;
public class main6 {
//引き数の型が異なる場合
  //一つ目のメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  //二つ目のメソッド
  public static double add(double x, double y) {
    return x + y;
  }
  //二つ目のメソッド
  public static String add(String x, String y) {
    return x + y;
  }
  public static void main(String[] args) { 
    System.out.println(add(10, 20));
    System.out.println(add(5.5, 2.4));
    System.out.println(add("hello", "goodmorning"));
  }
}
