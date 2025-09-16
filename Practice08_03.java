import java.util.Random;

class Practice08_03{
    public static void main(String[] args){
        Random genRandom = new Random();
            int gender  = genRandom.nextInt(2);

            Random ageRandom = new Random();
            int age  = ageRandom.nextInt(21);

            if (age <= 3 && gender == 0) {
            System.out.println("あなたはbabyな男です");
            }
            else if (age <= 3 && gender == 1) {
                System.out.println("あなたはbabyな女です");
            }
            else if (age > 3 && age < 6 && gender == 0) {
                System.out.println("あなたはchildな男です");
            }
            else if (age > 3 && age < 6 && gender == 1) {
                System.out.println("あなたはchildな女です");
            }
            else if (age >= 6 && age < 18 && gender == 0) {
                System.out.println("あなたはkidな男です");
            }
            else if (age >= 6 && age < 18 && gender == 1) {
                System.out.println("あなたはkidな女です");
            }
            else if (age >= 18 && gender == 0) {
                System.out.println("あなたはadultな男です");
            }
            else if (age >= 18 && gender == 1) {
                System.out.println("あなたはadultな女です");
     
            }
    }
} 