package スッキリわかるJava入門.第3章;
public class main5 {
  public static void main (String[] args) {
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) + 1;
    System.out.println(fortune);
    switch (fortune) {
      case 1:
      case 2:
        System.out.println("いいね");
        break;
      case 3:
        System.out.println("普通");
        break;
      case 4:
      case 5:
        System.out.println("いまいち");
    }
  }
}
