import java.util.Map;
import java.util.HashMap;

class ComprehensiveIntermediate02_01 {
    public static void main(String [] args) {
        Map<String,Integer> map =new HashMap<>();
         map.put("国語",90);
         map.put("数学",80);
         map.put("英語",70);

         System.out.println("国語:" + map.get("国語") +"点");
         System.out.println("数学:" + map.get("数学") +"点");
         System.out.println("英語:" + map.get("英語") +"点");
    }
}