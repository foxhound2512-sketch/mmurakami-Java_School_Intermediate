import java.util.Scanner;
import java.util.Random;
class ComprehensiveIntermediate02_04 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");
        System.out.print("0:グー 1:チョキ 2: パー >");
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
            while(inputNum > 2) {
                System.out.print("正しい数字を入力してください　0:グー 1:チョキ 2: パー >");
                inputNum = sc.nextInt();
            }
        Random rand = new Random();
        int ran = rand.nextInt(3);
        if (inputNum == 0 && ran == 1) {
            System.out.println("あなたの勝ちです");
        }else if (inputNum == 1 && ran == 2){
            System.out.println("あなたの勝ちです");
        }else if (inputNum == 2 && ran == 0){
            System.out.println("あなたの勝ちです");
        }else if (inputNum == 0 && ran == 0){
            System.out.println("あいこです");
        }else if (inputNum == 1 && ran == 1){
            System.out.println("あいこです");
        }else if (inputNum == 2 && ran == 2){
            System.out.println("あいこです");
        }else if (inputNum == 0 && ran == 2){
            System.out.println("あなたの負けです");
        }else if (inputNum == 1 && ran == 0){
            System.out.println("あなたの負けです");
        }else if (inputNum == 2 && ran == 1){
            System.out.println("あなたの負けです");
        }
        System.out.println("プレイヤー:" + inputNum);
        System.out.println("わたし:" + ran);
    }
}