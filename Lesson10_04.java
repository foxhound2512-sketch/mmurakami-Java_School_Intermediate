import java.util.Random;

class Lesson10_04 {
    public static void main(String[] args) {
        System.out.println("今日のゴミ回収の種類は");
        // 1~7の乱数を  に代入
        int day = new Random().nextInt(7) + 1;

        switch (day) {
            case 1, 3, 5 -> System.out.println("燃えるゴミの日です");
            case 2 -> System.out.println("燃えないゴミの日です");
            case 4 -> System.out.println("プラスチックゴミの日です");
            case 6 -> System.out.println("ビン・カンゴミの日です");
            default -> System.out.println("ごみの回収はありません");
        }
    }
}