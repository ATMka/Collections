package Task001;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatWords {
    private Map<String,Long> textOnly = new HashMap<>();
    private Long count;

    public Map<String, Long> textToTextOnly (String text){
        for (String word: text.split("[^a-zA-Zа-яёА-ЯЁ]+")
             ) {
            count = 1L;
            if (textOnly.containsKey(word.toLowerCase())){
                count = textOnly.get(word.toLowerCase()) + 1;
                textOnly.put(word.toLowerCase(),count);
            }
            textOnly.put(word.toLowerCase(),count);
        }
        return textOnly;
    }

    public Map<String, Long> getTextOnly() {
        return textOnly;
    }
}
