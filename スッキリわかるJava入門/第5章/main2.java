package スッキリわかるJava入門.第5章;
public class main2 {
  public static void methodA() {
    System.out.println("methodA");
    methodB();
  }
  
  public static void methodB() {
      System.out.println("methodB");
  }

  public static void main(String[] args) { 
      methodA();
  }
}
