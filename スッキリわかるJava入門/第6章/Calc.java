package スッキリわかるJava入門.第6章;
public class Calc {
  public static void main(String[] args) {
    int a = 10;
    int b = 2;
      //tasu(),hiku()はCalcLogicに属しているため、
      // int total = tasu(a, b);
      // int delta = hiku(a, b);   ではなく、
    int total = CalcLogic.tasu(a, b);
    int delta = CalcLogic.hiku(a, b);
      //と記載する
    System.out.print("足すと" + total + "引くと" + delta);
  }
}


