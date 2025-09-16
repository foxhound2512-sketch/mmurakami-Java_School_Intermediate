
class Practice05_01 {

    public static void main(String[] args) {
        String[] arr_01 = {"リンゴ", "バナナ", "メロン", "マスカット"};

        System.out.println(arr_01[0]);
        System.out.println(arr_01[1]);
        System.out.println(arr_01[2]);
        System.out.println(arr_01[3]);

        String[] arr_02;
        arr_02 = new String[4];

        arr_02[0] = "3";
        arr_02[1] = "10";
        arr_02[2] = "20";
        arr_02[3] = "100";

        System.out.println(arr_02[0]);
        System.out.println(arr_02[1]);
        System.out.println(arr_02[2]);
        System.out.println(arr_02[3]);

        String[][] arr_03 = {{"ポチ", "ジョン"}, {"タマ", "もちまる"}, {"ペンペン", "ペンギン丸"}};

        System.out.println(arr_03[0][0]);
        System.out.println(arr_03[0][1]);
        System.out.println(arr_03[1][0]);
        System.out.println(arr_03[1][1]);
        System.out.println(arr_03[2][0]);
        System.out.println(arr_03[2][1]);

    }
}
