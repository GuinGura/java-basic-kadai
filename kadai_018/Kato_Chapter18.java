package kadai_018;

public class Kato_Chapter18 {
    //フィールド
    public String familyName = "加藤";
    public String givenName = "";
    public String address = "東京都中野区〇×";

    //コンストラクタ
    public Kato_Chapter18() {

    }

    //メソッド
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    void eachIntroduce() {

    }

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }

    public void setGivenName() {

    }
}