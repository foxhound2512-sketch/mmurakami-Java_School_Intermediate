import java.util.Random;

class Practice10_03{
    public static void main(String[] args){
        int age = new Random().nextInt(21);
        int gender = new Random().nextInt(2);
        switch(age) {
            case 0 ,1 , 2 , 3:
            switch(gender) {
                case 0:
                System.out.println("あなたはbabyな男です");
                break;
                case 1:
                System.out.println("あなたはbabyな女です");
                break;
            }
            break;
            case 4 , 5:
            switch(gender) {
                case 0:
                System.out.println("あなたchildな男です");
                break;
                case 1:
                System.out.println("あなたはchildな女です");
                break;
            }
            break;
            case 6 , 7 , 8 ,9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17:
            switch(gender) {
                case 0:
                System.out.println("あなたkidな男です");
                break;
                case 1:
                System.out.println("あなたはkidな女です");
                break;
            }
            break;
            case 18 , 19 , 20:
            switch(gender) {
                case 0:
                System.out.println("あなたadultな男です");
                break;
                case 1:
                System.out.println("あなたはadultな女です");
                break;
            }
            break;
        }
        System.out.println(age);
        System.out.println(gender);
    }
}