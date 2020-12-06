package java_study_constructor_pokemon;

//【Main.java】
public class Main {

    public static void main(String[] args) {
        // 呼び出し（new した後で、引数へ与えられた値を元に Pokemon が生成されます）
        Pokemon mewtwo = new Pokemon();
        // set〇〇で値をセットする
        mewtwo.setNumber(150);
        mewtwo.setName("ミュウツー");
        mewtwo.setCategory("いでんしポケモン");
        mewtwo.setType("エスパー");
        mewtwo.setDescription("研究のために遺伝子をどんどん組み換えていった結果 凶暴なポケモンになった。");
        // get〇〇で値を取得する
        System.out.println("No." + mewtwo.getNumber());
        System.out.println(mewtwo.getName());
        System.out.println(mewtwo.getCategory());
        System.out.println(mewtwo.getType() + "タイプ");
        System.out.println(mewtwo.getDescription());
    }
}
