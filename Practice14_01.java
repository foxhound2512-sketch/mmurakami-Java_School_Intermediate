class Practice14_01 {
    public static void main(String[] args) {
        try {
            String str = null;     // nullを代入
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finallyブロックです");
        }
        System.out.println("処理終了");
    }
}