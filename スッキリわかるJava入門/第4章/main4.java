package スッキリわかるJava入門.第4章;
public class main4 {
  public static void main (String [] args) {
    int [] scorers = new int[5];
    System.out.println(scorers[1]); // 0が出力され、エラーにならない
    
    // 配列の作成と初期値の代入
    int[] scorers1 = new int[] {20, 40, 10, 50};
    int[] scorers2 = {20, 40, 10, 50};
  }
}
