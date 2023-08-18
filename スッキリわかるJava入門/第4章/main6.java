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
    int[] seq = new int[10];
    //塩基配列をランダムに生成
    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }
    //生成した塩基配列の記号を表示
    for (int i = 0; i < seq.length; i++) {
      switch (seq[i]) {
        case 0:
          System.out.print("A ");
          break;
        case 1:
          System.out.print("T ");
          break;
        case 2:
          System.out.print("G ");
          break;
        case 3:
          System.out.print("C ");
          break;
      }
      /* switchの部分を省略 */
      /* char[] base = {'A', 'T', 'G', 'C'};
      *  System.out.print(base[seq[i]] + " "); */
    }
  }
}
