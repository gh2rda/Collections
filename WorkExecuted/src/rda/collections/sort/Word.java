package rda.collections.sort;

public class Word implements Comparable<Word> {

    private String wordEntry;
    private int wordlength = 0;

    public Word(String srt) {
        this.wordEntry = srt;
        this.wordlength = srt.length();
    }

    public String getWordEntry() {
        return wordEntry;
    }

    public int getWordlength() {
        return wordlength;
    }

    public int compareTo(Word w) {
//        return this.wordEntry.compareTo(w.getWordEntry());

        if (this.wordlength == w.wordlength) {
            return this.wordEntry.compareTo(w.getWordEntry());
        } else if (this.wordlength < w.wordlength) {
            return -1;
        } else {
            return 1;
        }

    }
}