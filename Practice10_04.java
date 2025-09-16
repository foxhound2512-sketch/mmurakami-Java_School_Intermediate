import java.util.Random;

class Practice10_04{
    public static void main(String[] args){
        int color = new Random().nextInt(5) + 1;

        System.out.println(
            switch (color) {
                case 1 -> "今日のラッキーカラーはピンクです";
                case 2 , 3 , 4 ->"今日のラッキーカラーはレッドです";
                case 5 ->"今日のラッキーカラーはゴールドです";
                default -> "不明な色です";
            }
        );    
        System.out.println(color);
    }
}