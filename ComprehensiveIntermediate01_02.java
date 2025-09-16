import java.util.Scanner;

class ComprehensiveIntermediate01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("整数1を入力してください >");
        int inputNum1 = sc.nextInt();
        System.out.print("整数2を入力してください >");
        int inputNum2 = sc.nextInt();
        System.out.print("整数3を入力してください >");
        int inputNum3 = sc.nextInt();

        if(inputNum1 < inputNum2 && inputNum2 < inputNum3) {
            System.out.println("OK");
        }else if(inputNum1 == inputNum2 && inputNum2 == inputNum3) {
            System.out.println("OK");
        }else if(inputNum1 == inputNum2 && inputNum2 < inputNum3) {
            System.out.println("OK"); 
        }else if(inputNum1 < inputNum2 && inputNum2 == inputNum3) {
            System.out.println("OK");
        }else {
            System.out.println("NG");
        }
        sc.close();
    }
}