package java_study_constructor_pokemon;

//【Pokemon.java】
public class Pokemon {
    // フィールド変数
    private int number;// ポケモンのナンバー
    private String name;// ポケモンの名前
    private String category;// ポケモンの分類
    private String type;// ポケモンのタイプ
    private String description;// ポケモンの説明

    // setter
    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter
    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }
}
