package スッキリわかるJava入門.第4章;
public class main5 {
  public static void main (String [] args) {
    int[] scorers = {20, 40, 10, 50, 80};
    int sum = scorers[1] + scorers[2] + scorers[3] + scorers[4] + scorers[5]; //合計値
    int avg = sum / scorers.length //平均値
    System.out.println("合計点" + sum);
    System.out.println("平均点" + avg);
  }
  //scorers[5]は存在しない。
  //存在しない要素を使用した時にエラーになる
  //java.lang.ArrayIndexOutOfBoundsException:5 Main.java(4).....というエラー。
}
