package スッキリわかるJava入門.第1章;
public class main3 {
  public static void main(String[] args) {
    final double PI = 3.14; 
    //finalをつけることで定数になり、値の書き換えができなくなる。
    // 定数名は全て大文字で書く
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    PI = 10; //コンパイルエラーとなる
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
  }
}
