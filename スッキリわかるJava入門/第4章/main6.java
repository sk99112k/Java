package スッキリわかるJava入門.第4章;
public class main6 {
  public static void main (String [] args) {
    //ループによる全要素の利用
    int[] scorers = {20, 40, 10, 50, 80};
    for (int i = 0; i < scorers.length; i++) {
      System.out.println(scorers[i]);
    }

    //ループによる集計
    int[] points = {20, 40, 10, 50, 80};
    int sum = 0;
    for (int i = 0; i < points.length; i++) {
      sum += points[i];
    }
    int avg = sum / points.length;
    System.out.println("合計点" + sum);
    System.out.println("平均点" + avg);

    //添字に対応した情報の利用
  }
}
