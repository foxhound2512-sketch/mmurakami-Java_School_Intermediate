class Practice12_02 {
    public static void main(String[] args ) {
         String a = "朝";
         String b = "昼";
         String c = "夜";


         String greet = greet(a);
         System.out.println(greet(a));
         System.out.println(greet(b));
         System.out.println(greet(c));     
    }

    private static String greet(String a) {
        return switch(a) {
            case "朝" -> "Good morning";
            case "昼" -> "Good afternoon";
            case "夜" -> "Good evening";
            default -> "未定義";
        };
    }
}