package collection.step2.util;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtil {
	
	public static List<MyCollection> init(){
		List<MyCollection> myCollection = new ArrayList<>();
		
		myCollection.add(new MyCollection(0, 1));
		myCollection.add(new MyCollection(2, 3));
		myCollection.add(new MyCollection(-1, 5));
		myCollection.add(new MyCollection(4, 4));
		myCollection.add(new MyCollection(10, 1));
		myCollection.add(new MyCollection(7, 7));
		
		return myCollection;
	}
	
}
