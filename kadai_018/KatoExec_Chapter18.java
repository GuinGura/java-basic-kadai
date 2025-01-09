package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        //オブジェクトを作る
        Kato_Chapter18 taro = new KatoTaro_Chapter18();
        Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();
        Kato_Chapter18 hanako = new KatoHanako_Chapter18();
        //処理を実行する

        taro.setGivenName();
        taro.execIntroduce();

        System.out.println();

        ichiro.setGivenName();
        ichiro.execIntroduce();

        System.out.println();

        hanako.setGivenName();
        hanako.execIntroduce();
    }
}
