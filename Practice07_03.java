import java.util.Scanner;

class Practice07_03{
    public static void main(String[] args) {;

     Scanner sc = new Scanner(System.in);

     System.out.print("10を入力してください　＞　");
     int inputNum = sc.nextInt();

     System.out.println("10を3で割った余りは " + (inputNum %= 3)  + " です");

     sc.close();
    }
}