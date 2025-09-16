class ComprehensiveIntermediate01_04 {
    public static void main(String[] args) {
        System.out.print("人数を入力してください> ");
        int inputNum = new java.util.Scanner(System.in).nextInt();

        int sum = sumup(inputNum);
        System.out.println("合計金額" + sum +"円");
    }

    public static int sumup(int inputNum) {
        if (inputNum < 5 ) {
            return inputNum * 600;
        } else if (inputNum <= 20) {
            return inputNum * 550;
        } else   {
            return inputNum * 500;
        }
    }
}
    