package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {


    // コンストラクタ
    public Jyanken_Chapter26() {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

    }

    // 1.自分のじゃんけんの手を入力するメソッド
    public String getMyChoice() {
        String rock = "r";
        String scissors = "s";
        String paper = "p";

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if (input.equals(rock) || input.equals(scissors) || input.equals(paper)) {
            return input;
        } else {
            System.out.println("正しいじゃんけんの手を入力してください");
            return getMyChoice();
        }


    }

    // 2.対戦相手のじゃんけんの手を乱数で選ぶメソッド
    public String getRandom() {
        String[] jyankenArray = {"r", "s", "p"};
        String you = jyankenArray[(int)Math.floor(Math.random()*3)];

        return you;
    }

    // 3.じゃんけんを行うメソッド
    public void playGame() {
        HashMap<String, String> play = new HashMap<>();
        play.put("r", "グー");
        play.put("s", "チョキ");
        play.put("p", "パー");

        String myChoice = getMyChoice();
        String yourChoise = getRandom();

        System.out.println("自分の手は" + play.get(myChoice) + "、対戦相手の手は" + play.get(yourChoise));

        //自分と相手のじゃんけんの手を比較する
        if (myChoice.equals(yourChoise)) {
            System.out.println("あいこです");
        } else if (
                myChoice.equals("r") && yourChoise.equals("s") ||
                        myChoice.equals("s") && yourChoise.equals("p") ||
                        myChoice.equals("p") && yourChoise.equals("r")) {
            System.out.println("自分の勝ちです");
        } else {
            System.out.println("自分の負けです");
        }
    }

}