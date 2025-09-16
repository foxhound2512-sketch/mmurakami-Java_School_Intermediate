class ComprehensiveIntermediate01_01 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください> ");
        int inputNum = new java.util.Scanner(System.in).nextInt();

        if (inputNum % 2 == 0) {
            System.out.println("even");
        } else if (inputNum % 2 == 1) {
            System.out.println("odd");
        }
    }
}