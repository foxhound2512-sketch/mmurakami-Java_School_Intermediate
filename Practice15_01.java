import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

class Practice15_01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        Set<String> set = new HashSet<String>(list);

        System.out.println(set);
    }
}