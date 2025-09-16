class Student {
    String name = "sato";

     /**
     * 平均点を算出するメソッド
     *
     * @param math    引数1 | int
     * @param english 引数2 | int
     */
    public void calculeteAvg(int math, int english) {
        System.out.println((math + english) / 2);
    }
}

public class Lesson13_01 {
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name ="sato";
        System.out.println(a001.name);
        a001.calculeteAvg(90, 80);

        Student a002 = new Student();
        a002.name = "suzuki";
        System.out.println(a002.name);
        a001.calculeteAvg(80, 70);

    }
}