package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        dictionary.wordPut();

        String[] wordArray = {"apple", "banana", "grape", "orange"};

        for(String engVocab : wordArray) {
            dictionary.setSearchWord(engVocab);
            dictionary.search();
        }
    }
}
