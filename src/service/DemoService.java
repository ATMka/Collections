package service;
import repository.TextRepository;

import javax.xml.soap.Text;
import java.util.Map;

public class DemoService {
    public void go (){
        TextRepository text = new TextRepository("С темницами Хаджар был знакомом хорошо. Почти так же, как и с тьмой. Возможно, потому что обычно эти двое ходили в тесной паре. Увы, познакомившись с “новой” тьмой, логичным продолжением стало знакомство и с новой темницей.\n" +
                "\n" +
                "Хаджар просыпался на самых разных кроватях. В том числе, спасибо бедуинам, состоящим полностью из обнаженных, готовых на все, женских тел. Просыпался на жестких циновках и камнях. Просыпался на голой земле. Просыпался в темницах, в пыточных, головой на плахе, в недрах пещеры с драконом и даже на постеле деревенского охотника.\n" +
                "\n" +
                "Но еще никогда Хаджар не приходил себя лежащим на поверхности густой, тягучей жидкости. Почему же он воспринял это как “темницу”? Все просто – полностью обнаженный, он не мог пошевелить ни единым пальцем.\n" +
                "\n" +
                "Субстанция облепила его так плотно, что будто приклеила. А может, так оно и было на самом деле. Некто, с дурным чувством юмора, опустил его в ванну из дурнопахнущего клея.\n" +
                "\n" +
                "– Азрея, – позвал Хаджар.\n" +
                "\n" +
                "Глаза постепенно привыкали ко тьме. Учитывая невозможность повернуть голову, Хаджар получил от способности вновь видеть не так уж и много. Он увидел далекий свод, освещенный зеленым светом, бьющим из трещин. Судя по эху, зал, в котором он оказался, был велик.");

        TextService.CountRepeatWords(text).forEach((key, value) -> System.out.printf("%20s   Кол-во раз в тексте: %d%n", key, value));

        System.out.println();
        System.out.println("Уникальные слова в тексте: ");

        TextService.getUniqWords(text).forEach((value) -> System.out.printf("%s  ", value));

        System.out.println();
        System.out.println();
        System.out.println("Сортировка по алфавиту: ");

        TextService.sortAlphabetically(text).forEach((value) -> System.out.printf("%s%n", value));

        System.out.println();
        System.out.println("Сортировка по кол-ву символов: ");

        TextService.sortByNumberOfLetters(text).forEach((value) -> System.out.printf("%s%n", value));
    }

}