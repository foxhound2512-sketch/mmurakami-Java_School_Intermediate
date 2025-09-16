import java.util.Scanner;

class Practice11_04 {
  public static void main(String[] args) {
    System.out.print("何段>");
    Scanner sc = new Scanner(System.in);
    int inputNum = sc.nextInt(); 
    while (inputNum >= 6) {
      System.out.print("何段>");
      inputNum = sc.nextInt();
      if (inputNum <= 5) {
        break;
      }
    }
    // 3. の処理を書く
    for (int i = 1; i <= inputNum; i++) { 
      // スペースを出力（右寄せ用）
      for (int j = 1; j <= inputNum - i; j++) {
        System.out.print(" ");
      }
      // アスタリスクを出力（階段の段）
      for (int k = 1; k <= i; k++) {
        System.out.print("*");
      }
      // 改行
       System.out.println();
    }    
  }  
 }

        
