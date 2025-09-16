class Practice12_01 {
    public static void main(String[] args ) {
         int x = 10;
         int y = 6;

         int sum = sumdown(x , y);

         System.out.println("sum =" + sum);
    }

    private static int sumdown(int x, int y) {
        return x - y;
    }
}