import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;


class Practice15_02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        Set <String> tree = new TreeSet<String>(list);

        System.out.println(tree);
    }
}
