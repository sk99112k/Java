package スッキリわかるJava入門.第6章;
public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.print("足すと" + total + "引くと" + delta);
  }
}
