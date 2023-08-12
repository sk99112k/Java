package スッキリわかるJava入門.第3章;
public class main7 {
  public static void main (String[] args) {
    // ループ変数を1からスタートする
    for (int a = 1; a < 10; a++) {
      System.out.println("おはよう");
    }
    
    // ループ変数を2ずつ増やす
    for (int b = 0; b < 10; b+= 2) {
      System.out.println("こんにちは");
    }
    
    // ループ変数を10から1ずつ1まで減らす
    for (int c = 10; c > 0; c--) {
      System.out.println("こんばんは");
    }
    
    // ループ変数を初期化しない
    int d = 5;
    for (; d < 10; d++) {
      System.out.println("ありがとう");
    }
    
    // 繰り返し時の処理を行わない
    for (int e = 0; e < 10;) {
      System.out.println("どういたしまして");
    }
  }
}
