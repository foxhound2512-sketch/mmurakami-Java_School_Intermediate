import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class MenuManager{
    Map<String,ArrayList<String>> map = new HashMap<>();
    MenuManager(){
     // サンドイッチメニューの登録
     ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch",list);
        //ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink",list);
        //サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu",list);
    }
    // ここにsearchMenuを作成します。
    void searchMenu(String menu) {
        for (String key : map.keySet()) {
            if (map.get(key).contains(menu)) {
                System.out.println(menu + " は " + key + " に含まれています");
                return;
            }
        }
        System.out.println("該当するメニューにありません");
    }
    // ここにsetMenuを作成します。
    void setMenu(String category, String menu) {
        if(map.containsKey(category)){
            map.get(category).add(menu);
        }else {
            ArrayList<String> list = new ArrayList<>();
            list.add(menu);
            map.put(category, list);
        }
        return;
    }
    // ここにshowMenuを作成します。
    void showMenu(String category) {
        if (map.containsKey(category)) {
            System.out.println(map.get(category)); 
        } else {
            System.out.println("該当するメニューはありません");
        }
    }   
}
class ComprehensiveIntermediate02_02 {
    public static void main(String[] args) {
        MenuManager manager = new MenuManager();
        // サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        // サンドイッチメニューにビッグバーガーを追加
        manager.setMenu("sandwitch","ビッグバーガー");
        // サンドイッチメニューの表示
        manager.showMenu("sandwitch");
        // 「ホットミルク」をメニューから検索
        manager.searchMenu("ホットミルク");
        // 「オレンジジュース」をメニューから検索
        manager.searchMenu("オレンジジュース");
    }
}  