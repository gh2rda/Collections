package rda.collections.sort;

import java.util.Comparator;

public class WordComparator implements Comparator<Word>{
	
	public int compare(Word a, Word b){
		
		return a.getWordEntry().compareTo(b.getWordEntry());
	}
}

