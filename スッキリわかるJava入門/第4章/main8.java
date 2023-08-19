package スッキリわかるJava入門.第4章;
public class main8 {
  public static void main(String[] args) { 
  //ガべレージコレクション
    //参照されなくなった配列を自動的に削除
    boolean judge = true;
    if (judge == true) {
      int[] array = {1, 2, 3};
      System.out.println(array[1]);
    }

  //nullの利用
    //コンパイルは成功するがエラーになる
    //nullが格納されている配列変数を使用するとエラーが発生する
    int[] number = {1, 2, 3};
    number = null;
    number[0] = 10;
  }
}
