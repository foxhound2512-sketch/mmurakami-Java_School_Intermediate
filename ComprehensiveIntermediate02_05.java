class Coffee {
    String name = "ボス";
    public void buyDrink() {
        System.out.println(
            switch(name) {
                case "ボス" -> "ボスの甘さは控え目、ミルク無し。110円になります。";
                case "ジョージア" -> "ジョージアの甘さは 甘め、ミルクありです。120円になります。";
                default -> "何も無し";
            }
        );
        
    }
}
class Juice{ 
    String name = "バヤリース";
    public void buyDrink() {
        System.out.println(
            switch(name) {
                case "バヤリース" -> "バヤリース の オレンジ 味です。130 円になります。";
                case "午後の紅茶" -> "午後の紅茶 の レモンティー 味です。150 円になります。";
                default -> "何も無し";
            }
        );
    }
}
class ComprehensiveIntermediate02_05 {
    public static void main(String[] args) { 
        Coffee a001 = new Coffee();
            a001.name = "ボス";
            a001.buyDrink();
        Coffee a002 = new Coffee();
            a002.name = "ジョージア";
            a002.buyDrink();
        Juice b001 = new Juice();
            b001.name = "バヤリース";
            b001.buyDrink();
        Juice b002 = new Juice();
            b002.name = "午後の紅茶";
            b002.buyDrink();   
    }
}