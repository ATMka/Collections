package Task002;

import java.util.Iterator;
import java.util.Set;

public class Demo {
    public void go(){
        UniqWords uniqWords = new UniqWords();
        String text ="Себастьян, кряхтя, встал со стула и, выбравшись на маленький балкончик, полной грудью вдохнул пьянящий аромат ночи. Пахло остывающими после дневной жары камнями, персиковым ароматом кальяна и морем. Город Иштака погружался в сон, наслаждаясь ночной прохладой. Старый хронист посмотрел на горизонт, туда, где не было городских огней и царил мрак пешханской пустыни, глубины души. Он увидел то, чего попросту не могло быть. Это не укладывалось в голове, казалось неестественным, нелепым и неправильным. Всегда мудрые, всегда спокойные и уравновешенные Учителя спорили, словно двое самых что ни на есть обычных людей. Это происходило, как видно, уже давно, ибо говорили они резко и раздраженно, едва не срываясь на крик. Младший из них – высокий, темноволосый мужчина в белоснежном одеянии паломника – сидел на низком диванчике, скрестив ноги. Черные брови были нахмурены так, что сошлись у переносицы. Его старший собеседник – худощавый, длинноволосый и голубоглазый – мерил маленькую площадку широкими и нервными шагами. Глаза его лихорадочно блестели.";
        for (String s: uniqWords.getUniqWords(text)
             ) {
            System.out.println(s);
        }
    }
}
