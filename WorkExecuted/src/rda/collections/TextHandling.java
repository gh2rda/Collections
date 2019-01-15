package rda.collections;

import java.util.*;
import java.io.File;
import java.util.regex.*;

public class TextHandling {

    public static void main(String[] args) {

        ReadFile myFile = new ReadFile();

        StringBuilder myText = new StringBuilder(myFile.getStringFromFile());
        String myTextAsString = new String(myText);

        List<String> allWord = new ArrayList<>(10);
//        HashSet<String> uniqueWord = new HashSet(allWord);
        HashSet<String> uniqueWord = new HashSet();

        String[] result = myTextAsString.split("\\s");

        for (int i = 0; i < result.length; i++) allWord.add(result[i]);
        for (int i = 0; i < result.length; i++) uniqueWord.add(result[i]);
        System.out.println(uniqueWord);
        System.out.println("Число уникальных слов в тексте: "+uniqueWord.size());
        System.out.println("Число всех слов в тексте: "+allWord.size());


    }

}

