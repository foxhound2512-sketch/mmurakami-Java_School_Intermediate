import java.util.Random;

class Practice08_02{
    public static void main(String[] args){
        Random rand = new Random();

        int age = rand.nextInt(21);

        if (age <= 3) {
            System.out.println("あなたはbabyです");
        }
        else if (age > 3 && age < 18) {
            System.out.println("あなたはkidです");
        }

           else if (age >= 18) {
            System.out.println("あなたはadultです");
        }
    }
}
