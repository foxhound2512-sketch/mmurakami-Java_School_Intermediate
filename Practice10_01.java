import java.util.Random;

class Practice10_01{
    public static void main(String[] args){
        int gendar = new Random().nextInt(2);
        switch(gendar) {
            case 0:
            System.out.println("あなたは男です");
            break;
            case 1:
            System.out.println("あなたは女です");
            break;
        }
        System.out.println(gendar);
    }
}