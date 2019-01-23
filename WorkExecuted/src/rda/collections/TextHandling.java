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

//        ������� 1: ����������� ���������� ��������� ���� � �����.

        System.out.println("������� 1: ������� ���������� ��������� ���� � �����");
        System.out.println("����� ���� ���� � ������: " + allWord.size());
        System.out.println("����� ���������� ���� � ������: " + uniqueWord.size());
        System.out.println();

//        ������� 2: �������� �� ����� ������ ��������� ���� �����,
//        ��������������� �� ����������� �� �����
//        (���������� ������� �� ����� �����, ����� �� ������).

        TreeSet<Word> wordSort = new TreeSet<>();
        Iterator iterUnique2 = uniqueWord.iterator();
        while (iterUnique2.hasNext()) {
            wordSort.add(new Word((String) iterUnique2.next()));
        }
        System.out.println("������� 2: �������������� ������ ��������� ���� �����");
        iterUnique2 = wordSort.iterator();
        while (iterUnique2.hasNext()) {
            System.out.println(((Word) iterUnique2.next()).getWordEntry());
        }
        System.out.println();

//  ������� 3: ����������� � �������� �� ����� ������� ��� ������ ����� ����������� � �����.

        System.out.println("������� 3: ������� ��� ������ ����� ����������� � �����?");
        Iterator iterUnique = wordSort.iterator();
        String word;
        while (iterUnique.hasNext()) {
            word = ((Word) iterUnique.next()).getWordEntry();
            System.out.println(word + " (" + Collections.frequency(allWord, word) + " ���)");
        }
        System.out.println();

//        ������� 4: �������� �� ����� ��� ������ ����� � �������� �������.

        System.out.println("������� 4: ��� ������ ����� � �������� �������.");
        ArrayList<String> copyAllWord = new ArrayList<>(allWord);
        Collections.reverse(allWord);
        for (String w :
                allWord) {
            System.out.print(w + " ");
        }
        System.out.println('\n');

//        ������� 5: ���������� ���� Iterator ��� ������ ������ � �������� �������.

        System.out.println("������� 5: ���� Iterator ��� ������ ������ � �������� �������.");
        ReverseIterator revAll = new ReverseIterator(copyAllWord);
        while (revAll.hasNext()) {
            System.out.println(revAll.next().get(revAll.getPosition()));
        }
        System.out.println();

//        ������� 6: �������� �� ����� ������, ������ ������� �������� ������������� � ������������ �������.

        System.out.println("������� 6: ������� ������ ��� ��������� ��������.(����� - ������ �� �����)");
        boolean quit = false;
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("��� ����� ������ �� 1 �� " + copyAllWord.size());
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

