package Task002;

import java.util.HashSet;
import java.util.Set;

public class UniqWords {
    private Set<String> textOnly = new HashSet<>();

    public Set<String> getUniqWords (String text){
        for (String word: text.split("[^a-zA-Zа-яёА-ЯЁ]+")
        ) {
            textOnly.add(word.toLowerCase());
        }
        return textOnly;
    }
}
