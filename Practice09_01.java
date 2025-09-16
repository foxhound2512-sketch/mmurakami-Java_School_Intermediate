class Practice09_01{
    public static void main(String [] args) {
         
        int arr[] = {1, 2 , 4 , 8 , 6 , 10 , 20};

        for (int i= 0; i <= 6; i++) {
                if (i == 0 || i == 3) {
                    continue;
                }
            System.out.println(arr[i]);
        }
    }
}