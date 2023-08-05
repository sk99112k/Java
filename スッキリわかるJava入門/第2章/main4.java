package スッキリわかるJava入門.第2章;
public class main4 {
  public static void main(String[] args) {
    float f = 3;
    double d = f;
    System.out.println(f); /* float型の変数にint型を代入 */
    System.out.println(d); /* double型の変数にfloat型を代入 */
  }

  public static void main1(String[] args) {
    int i = 3.2;
    // 小数点以下をどうしたらいいかわからないため、エラーになる
  }
}
