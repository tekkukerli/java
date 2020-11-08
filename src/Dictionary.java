import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> translation;


    public Dictionary(){
        this.translation = new HashMap<String, String>();
    }

    public String translate(String word) {
        if(this.translation.containsKey(word)) {
            return this.translation.get(word);
        }
       return null;
    }

    public void add(String word, String translation) {
        this.translation.put(word, translation);
    }

    public int amountOfWords(){
        return this.translation.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> keySet = new ArrayList<String>();
        for ( String key : translation.keySet() ) {
            keySet.add(key + " = " + translation.get(key));
        }
        return keySet;
    }
}
