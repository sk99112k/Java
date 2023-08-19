package スッキリわかるJava入門.第4章;
public class main9 {
  public static void main(String[] args) { 
    //多次元配列
    int[] [] scorers = new int[2] [3];
    scorers[0] [0] = 40;
    scorers[0] [1] = 50;
    scorers[0] [2] = 60;
    scorers[1] [0] = 80;
    scorers[1] [1] = 60;
    scorers[1] [2] = 70;
    System.out.println(scorers[1] [1]);

    int[] [] numbers = {{40, 50,60}, {80, 60, 70}}; //このような初期値が可能
    System.out.println(numbers.length); //2が出力される
    System.out.println(numbers[0].length); //3が出力される
  }
}
