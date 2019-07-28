package service;

import repository.TextRepository;
import util.Constans;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class TextService {
    public static Map<String, Long> CountRepeatWords (TextRepository text){
        Map<String,Long> textInMap = new HashMap<>();
        Long count;
        String wordToLowerCase;
        for (String word: text.getText().split(Constans.REGEX_FOR_STRING)) {
            count = 1L;
            wordToLowerCase = word.toLowerCase();
            if (textInMap.get(wordToLowerCase) != null){
                count = textInMap.get(wordToLowerCase) + 1;
                textInMap.put(wordToLowerCase,count);
            }
            textInMap.put(wordToLowerCase,count);
        }
        return textInMap;
    }

    public static Set<String> getUniqWords (TextRepository text){
        return Arrays.stream(text.getText().split(Constans.REGEX_FOR_STRING)).map(String::toLowerCase).collect(Collectors.toSet());
    }

    public static List<String> sortAlphabetically(TextRepository text){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, text.getText().split(Constans.REGEX_FOR_STRING));
        list.sort(comparing(String::toLowerCase));
        return list;
    }

    public static List<String> sortByNumberOfLetters(TextRepository text){
        List<String> list = new ArrayList<>();
        Collections.addAll(list, text.getText().split(Constans.REGEX_FOR_STRING));
        list.sort(comparing(String::length));
        return list;
    }
}
