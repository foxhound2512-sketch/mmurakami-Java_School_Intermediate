import java.util.Random;

class ComprehensiveIntermediate02_03 {
    public static void  main(String[] args){
        System.out.print("ゾロ目で大当たり！チャンスは30回\n");
        System.out.print("beginと入力してください > ") ;
        String inputbegin = new java.util.Scanner(System.in).nextLine();
        if(inputbegin.equals("begin")) {
            System.out.println("ゲームスタート!");
            Random rand = new Random();
            int i = 0;
            while (i < 30) {
                int ran1 = rand.nextInt(9) + 1;
                int ran2 = rand.nextInt(9) + 1;
                int ran3 = rand.nextInt(9) + 1;
                System.out.println((i + 1) + "回目:" + ran1 + " " + ran2 + " " + ran3);
                i++;
                if (ran1 == ran2 && ran2 == ran3) {
                    System.out.println(i + "回目で大当たりです。おめでとうございます。");
                    break;
                }else if (i == 30) {
                    System.out.println("残念でした。終わります。");
                }
            }
        }else {
            System.out.println("beginと入力してください。");
            System.exit(0);
        }
    }
}