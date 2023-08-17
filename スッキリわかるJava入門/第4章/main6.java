package スッキリわかるJava入門.第4章;
public class main6 {
  public static void main (String [] args) {
    //ループによる全要素の利用(全て表示)
    int[] scorers = {20, 40, 10, 50, 80};
    for (int i = 0; i < scorers.length; i++) {
      System.out.println(scorers[i]);
    }

    //ループによる集計
      //(合計・平均)
    int[] points = {20, 40, 10, 50, 80};
    int sum = 0;
    for (int i = 0; i < points.length; i++) {
      sum += points[i];
    }
    int avg = sum / points.length;
    System.out.println("合計点" + sum);
    System.out.println("平均点" + avg);
      //(条件に一致する要素の数を調べる)
    int[] numbers = {20, 40, 10, 50, 80};
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] >= 50) {
        count++;
      }
    }
    System.out.println("50点以上の科目の数は:" + count);

    //添字に対応した情報の利用
  }
}
