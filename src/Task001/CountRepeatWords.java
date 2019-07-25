package Task001;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatWords {
    private Map<Long, String> textOnly = new HashMap<>();
    private Long hashCode = 0L;
    public Map<Long, String> textToTextOnly (String text){
        for (String word: text.split("[^a-zA-Zа-яёА-ЯЁ]+")
             ) {
            textOnly.put(hashCode,word);
            hashCode++;
        }
        return textOnly;
    }

    public Map<Long, String> getTextOnly() {
        return textOnly;
    }
}
