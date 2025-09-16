import java.util.Random;

class Practice09_03{
    public static void main(String[] args){
        Random numRandom = new Random();
            int arr[] = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};

            for (int a = 0; a <= 9; a++ ) {
                int num  = numRandom.nextInt(6) + 1;
                if (num == 1 ||  num == 3 || num == 5 ) 
                System.out.println(arr[a] + "回目、" + num +"が出ました");
            }  

    }
}