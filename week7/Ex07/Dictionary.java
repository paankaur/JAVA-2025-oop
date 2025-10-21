package week7.Ex07;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<>();
    }
    public String translate(String word) {

        if(dict.containsKey(word)){return dict.get(word);}
        else{return null;}
    }
    public void add(String word, String translation)  {
        dict.put(word, translation);
    }
    public int amountOfWords() {
        return dict.size();
    }
    public ArrayList<String> translationList() {
        ArrayList<String> translations = new ArrayList<>();
        for(String key : dict.keySet() ) {
        translations.add(key + " = "+ dict.get(key));
        }
        return translations;
    }
}
