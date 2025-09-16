import java.util.Scanner;

class ComprehensiveIntermediate01_03 {
    public static void main(String[] args ) {
         Scanner sc = new Scanner(System.in);

      System.out.print("整数1を入力してください >");
        int a = sc.nextInt();
        System.out.print("整数2を入力してください >");
        int b = sc.nextInt();
        System.out.print("整数3を入力してください >");
        int c = sc.nextInt();
        int d = b * b - 4 * a * c;
        System.out.println(d);

        if(d > 0) {
            System.out.println("２つの実数解です");
        } else if (d == 0) {
            System.out.println("重解です");
        } else if (d < 0) {
            System.out.println("２つの虚数解です");
        }
        sc.close();
    }
}