import java.util.TreeSet;
import java.util.Set;

class Lesson15_02 {
    public static void main(String[] args) {

        Set<Integer> ts = new TreeSet<>();
        //値を追加
        ts.add(1);
        ts.add(5);
        ts.add(2);
        ts.add(3);
        ts.add(2);
        ts.add(4);
        ts.remove(3);

        System.out.println(ts);
    }
}