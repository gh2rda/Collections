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

//        ������� 1: ����������� ���������� ��������� ���� � �����.

        System.out.println("����� ���� ���� � ������: " + allWord.size());
        System.out.println("����� ���������� ���� � ������: " + uniqueWord.size());

//        ������� 2: �������� �� ����� ������ ��������� ���� �����,
//        ��������������� �� ����������� �� �����
//        (���������� ������� �� ����� �����, ����� �� ������).

        TreeSet<Word> wordSort = new TreeSet<>();
        Iterator iterUnique2 = uniqueWord.iterator();
        while (iterUnique2.hasNext()) {
            wordSort.add(new Word((String) iterUnique2.next()));
        }

        iterUnique2 = wordSort.iterator();
        while (iterUnique2.hasNext()) {
            System.out.println(((Word) iterUnique2.next()).getWordEntry());
        }

//  ������� 3: ����������� � �������� �� ����� ������� ��� ������ ����� ����������� � �����.

//   �������� �� ��������������� �������
//        Iterator iterUnique = uniqueWord.iterator();
//        String word;
//        while (iterUnique.hasNext()) {
//            word = (String) iterUnique.next();
//            System.out.println(word + " ==== " + Collections.frequency(allWord, word) + " ���.");
//        }
        Iterator iterUnique = wordSort.iterator();
        String word;
        while (iterUnique.hasNext()) {
            word = ((Word) iterUnique.next()).getWordEntry();
            System.out.println(word + " (" + Collections.frequency(allWord, word) + " ���)");
        }

//        ������� 4: �������� �� ����� ��� ������ ����� � �������� �������.
        Collections.reverse(allWord);
        for (String w :
                allWord) {
            System.out.print(w + " ");
        }
        System.out.println();

//        ������� 5: ���������� ���� Iterator ��� ������ ������ � �������� �������.

        Iterator revAll = new ReverseIterator(allWord);

        while (revAll.hasNext()) {
//            word = ((Word) revAll.next()).getWordEntry();
//            System.out.println(word + " (" + Collections.frequency(allWord, word) + " ���)");
//            word = ((Word) ).getWordEntry();
            System.out.println((revAll.next()).toString());
        }
    }
}

