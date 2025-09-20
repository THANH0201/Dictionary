package model;

import java.util.HashMap;

public class Dictionary {

    private final HashMap<String, String> dictionary =  new HashMap<>();

    public Dictionary() {
        //upload file
    }

    public void addWord(String word, String mean) {
        dictionary.put(word.toLowerCase(), mean);

    }
    public String searchWord(String word) {
        return dictionary.getOrDefault(word.toLowerCase(), "A new word. Updating! Please enter another word. ");//getOrDefault(key, defaultValue)
    }
}



