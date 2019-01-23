package rda.collections;
import rda.collections.sort.*;
import java.util.*;

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

        System.out.println("Задание 1: Подсчет количества различных слов в файле");
        System.out.println("Число всех слов в тексте: " + allWord.size());
        System.out.println("Число уникальных слов в тексте: " + uniqueWord.size());
        System.out.println();

//        Задание 2: Выведите на экран список различных слов файла,
//        отсортированный по возрастанию их длины
//        (компаратор сначала по длине слова, потом по тексту).

        TreeSet<Word> wordSort = new TreeSet<>();
        Iterator iterUnique2 = uniqueWord.iterator();
        while (iterUnique2.hasNext()) {
            wordSort.add(new Word((String) iterUnique2.next()));
        }
        System.out.println("Задание 2: Отсорированный список различных слов файла");
        iterUnique2 = wordSort.iterator();
        while (iterUnique2.hasNext()) {
            System.out.println(((Word) iterUnique2.next()).getWordEntry());
        }
        System.out.println();

//  Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.

        System.out.println("Задание 3: Сколько раз каждое слово встречается в файле?");
        Iterator iterUnique = wordSort.iterator();
        String word;
        while (iterUnique.hasNext()) {
            word = ((Word) iterUnique.next()).getWordEntry();
            System.out.println(word + " (" + Collections.frequency(allWord, word) + " раз)");
        }
        System.out.println();

//        Задание 4: Выведите на экран все строки файла в обратном порядке.

        System.out.println("Задание 4: Все строки файла в обратном порядке.");
        ArrayList<String> copyAllWord = new ArrayList<>(allWord);
        Collections.reverse(allWord);
        for (String w :
                allWord) {
            System.out.print(w + " ");
        }
        System.out.println('\n');

//        Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.

        System.out.println("Задание 5: Свой Iterator для обхода списка в обратном порядке.");
        ReverseIterator revAll = new ReverseIterator(copyAllWord);
        while (revAll.hasNext()) {
            System.out.println(revAll.next().get(revAll.getPosition()));
        }
        System.out.println();

//        Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.

        System.out.println("Задание 6: Выводим строки под заданными номерами.(Выход - символ не цифра)");
        boolean quit = false;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Жду номер строки от 1 до " + copyAllWord.size());
        while (!quit) {
            if (in.hasNextInt()) {
                number = in.nextInt();
                if (number > 0 && number <= copyAllWord.size())
                    System.out.println(copyAllWord.get(number - 1));
            } else
                quit = true;
        }
        System.out.println();
    }
}

