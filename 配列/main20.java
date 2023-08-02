package 配列;
  class main20  {
    public static void main(String[] args) {
      // 変数numbersに、与えられた数字の配列を代入してください
      int numbers[] = {1, 4, 6, 9, 13, 16};
      int oddSum = 0;
      int evenSum = 0;
      
      // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
     for(int number: numbers) {
       if(number % 2 == 1) {
         oddSum += number;
       } else {
         evenSum += number;
       }
     }
     
      // ---- 拡張for文を用いない場合 ----
      // for (int i = 0; i < numbers.length; i++) {
      //   if (numbers[i] % 2 == 0) {
      //     evenSum += numbers[i];
      //   } else {
      //     oddSum += numbers[i];
      //   }
      // }
  
      System.out.println("奇数の和は" + oddSum + "です");
      System.out.println("偶数の和は" + evenSum + "です");
    }
  }


  // 配列の奇数の和と偶数の和