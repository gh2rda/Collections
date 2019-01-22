package rda.collections;

import rda.collections.sort.*;

import java.util.*;
//import rda.collections.sort.WordComparator;

public class TextHandling {

    public static void main(String[] args) {

        ReadFile myFile = new ReadFile();

        StringBuilder myText = new StringBuilder(myFile.getStringFromFile());
        String myTextAsString = new String(myText);

        ArrayList<String> allWord = new ArrayList<>(10);
        HashSet<String> uniqueWord = new HashSet();

        String[] result = myTextAsString.split("\\s");
        for (int i = 0; i < result.length; i++) allWord.add(result[i]);
        for (int i = 0; i < result.length; i++) uniqueWord.add(result[i]);

//        Задание 1: Подсчитайте количество различных слов в файле.

        System.out.println("Число всех слов в тексте: " + allWord.size());
        System.out.println("Число уникальных слов в тексте: " + uniqueWord.size());

//        Задание 2: Выведите на экран список различных слов файла,
//        отсортированный по возрастанию их длины
//        (компаратор сначала по длине слова, потом по тексту).

        TreeSet<Word> wordSort = new TreeSet<>();
        Iterator iterUnique2 = uniqueWord.iterator();
        while (iterUnique2.hasNext()) {
            wordSort.add(new Word((String) iterUnique2.next()));
        }

        iterUnique2 = wordSort.iterator();
        while (iterUnique2.hasNext()) {
            System.out.println(((Word) iterUnique2.next()).getWordEntry());
        }

//  Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.

//   итерация по неупрядоченному хешсету
//        Iterator iterUnique = uniqueWord.iterator();
//        String word;
//        while (iterUnique.hasNext()) {
//            word = (String) iterUnique.next();
//            System.out.println(word + " ==== " + Collections.frequency(allWord, word) + " раз.");
//        }
        Iterator iterUnique = wordSort.iterator();
        String word;
        while (iterUnique.hasNext()) {
            word = ((Word) iterUnique.next()).getWordEntry();
            System.out.println(word + " (" + Collections.frequency(allWord, word) + " раз)");
        }

//        Задание 4: Выведите на экран все строки файла в обратном порядке.
        Collections.reverse(allWord);
        for (String w :
                allWord) {
            System.out.print(w + " ");
        }
        System.out.println();

//        Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.

        Iterator revAll = new ReverseIterator(allWord);

        while (revAll.hasNext()) {
//            word = ((Word) revAll.next()).getWordEntry();
//            System.out.println(word + " (" + Collections.frequency(allWord, word) + " раз)");
//            word = ((Word) ).getWordEntry();
            System.out.println((revAll.next()).toString());
        }
    }
}

