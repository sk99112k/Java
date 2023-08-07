package スッキリわかるJava入門.第2章;
public class main9 {
  public static void main(String[] args) { 
  // 画面に文字を表示する命令 System.out.print(1);
    String name = "すがわら";
    System.out.print("私の名前は");
    System.out.print(name);
    System.out.print("です");
      
  // 2つの値を比較して大きい方の値を代入する int m = Math.max(1, 2);
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    System.out.println(a + "と" + b + "とで大きい方は" + m);

  // 文字列を数値に変換する int n = Integer.parseInt(1) 
    String age = "31";
    int n = Integer.parseInt(age);
    System.out.println("私は来年" + (n + 1) + "歳になります");
    
  // 乱数を発生させる int r = new java.util.Random().nextInt(1);
  // 1の数字までの整数がランダムに代入される
    int r = new java.util.Random().nextInt(50);
    System.out.println("あなたは多分、" + r + "歳ですね？");
 }
}
