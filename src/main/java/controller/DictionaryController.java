package controller;

import model.Dictionary;

public class DictionaryController {

    private final Dictionary dictionary;

    public DictionaryController() {
        this.dictionary = new Dictionary();
        dictionary.addWord("Kiitos","Thank you");
    }

    public String searchWord(String word) {
        return dictionary.searchWord(word);
    }
}
