package collection.step2;

import collection.step2.util.CollectionUtil;
import collection.step2.util.MyCollection;

import java.util.Iterator;
import java.util.List;

public class MyIteratorClass {
	
	public static void main(String[] args) {
		
		List<MyCollection> myCollections = CollectionUtil.init();
		
		Iterator iterator = myCollections.iterator();
		while (iterator.hasNext()){
//			myCollections.add(new MyCollection(3, 6));
			System.out.println(iterator.next());
		}
	
	}
	
}
