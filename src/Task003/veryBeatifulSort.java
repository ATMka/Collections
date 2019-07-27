package Task003;

import java.util.ArrayList;
import java.util.Collections;

import static java.util.Comparator.*;

public class veryBeatifulSort {
    public static ArrayList<String> sort(String text, int i){
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, text.split("[^a-zA-Zа-яёА-ЯЁ]+"));
        if (i == 0) {
            list.sort((comparing(String::toLowerCase)));
        } else if (i == 1) {
            list.sort(comparing(String::length));
        } else {
            throw new IllegalStateException("Unexpected value: " + i);
        }

        return list;
    }


}
