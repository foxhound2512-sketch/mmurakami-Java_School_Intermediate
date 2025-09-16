import java.util.Random;

public class Practice14_02 {
    public static void main(String[] args) {
        int a = new Random().nextInt(2); 
        try {
            // こちらに処理を記述  
            Err(a);
            
        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
        
    }

    
    public static void Err(int a) {
        if (a == 0) {
             int x = 10 / 0;
        } else if (a == 1) {
            String s = null;
             s.length(); 
        }  
    }  
}