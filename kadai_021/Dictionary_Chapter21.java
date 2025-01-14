package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 extends DictionaryExec_Chapter21 {
        HashMap<String, String> dictionary = new HashMap<String, String>();
        String engVocab;

        public void wordPut() {
            dictionary.put("apple", "りんご");
            dictionary.put("peach", "桃");
            dictionary.put("banana", "バナナ");
            dictionary.put("lemon", "レモン");
            dictionary.put("pear", "梨");
            dictionary.put("kiwi", "キウィ");
            dictionary.put("strawberry", "いちご");
            dictionary.put("grape", "ぶどう");
            dictionary.put("muscat", "マスカット");
            dictionary.put("cherry", "さくらんぼ");
        }


        public void setSearchWord(String engVocab) {
            this.engVocab = engVocab;
        }

        public void search() {
            if(dictionary.containsKey(engVocab)) {
            System.out.println(engVocab + "の意味は" + dictionary.get(engVocab));
            } else {
                System.out.println(engVocab + "は辞書に存在しません");
        }
    }


}
