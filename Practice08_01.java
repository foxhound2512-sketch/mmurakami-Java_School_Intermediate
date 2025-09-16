import java.util.Random;

class Practice08_01{
    public static void main(String[] args) {
        Random rand = new Random();

        int gender  = rand.nextInt(2);

       if (gender ==  0) {
        System.out.println("あなたは男です");
       }

       if (gender ==  1) {
        System.out.println("あなたは女です");
       }
    }
}