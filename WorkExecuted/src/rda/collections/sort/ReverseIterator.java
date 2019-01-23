package rda.collections.sort;

import java.util.ArrayList;
import java.util.Iterator;

public class ReverseIterator implements Iterator<ArrayList>{

    private ArrayList list;
    private int position;
    private int lastRet = -1;

    public int getPosition() {
        return position;
    }

    public ReverseIterator(ArrayList list) {
        this.list = list;
        this.position = list.size();
    }

    @Override
    public boolean hasNext() {
        return position > 0;
    }

    @Override
    public  ArrayList next() {
        int i = position;
        position = i - 1;
        lastRet = i;
        return list;
    }
}
