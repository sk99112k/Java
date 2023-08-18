package スッキリわかるJava入門.第4章;
public class main7 {
  public static void main(String[] args) {
    //従来のfor文
    int[] scorers = {20, 30, 40, 50, 80};
    for (int i = 0; i < scorers.length; i++) {
      System.out.println(scorers[i]);
    }

    //拡張 for文
    //ループ変数や添え字を書かなくていい
    int[] points = {20, 30, 40, 50, 80};
    for (int value : points) {
      System.out.println(value);
    }
  }
}
