import java.util.Random;

class Practice11_03 {
    public static void main(String[] args){
        Random numRandom = new Random();
            int X = 0;
            while (X < 10) {
                int num  = numRandom.nextInt(6)+1;
                if (num == 1 || num == 3 || num == 5) {
                    System.out.println((X + 1) + "回目" + num +"が出ました");
                }
                X++;
            }
    }
}
