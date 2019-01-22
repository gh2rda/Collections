package rda.collections.sort;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReverseIterator implements Iterator<ArrayList>{

    private ArrayList list;
    private int position;

    public ReverseIterator(ArrayList list) {
        this.list = list;
        this.position = list.size() - 1;
    }

//    @Override
//    public Iterator iterator() {
//        return this;
//    }

    @Override
    public boolean hasNext() {
        return position >= 0;
    }

    @Override
    public  ArrayList next() {
//        return list.get(this.position--);
        return (ArrayList) list.get(this.position--);

    }

//    @Override
//    public void remove() {
//        throw new UnsupportedOperationException();
//    }

}