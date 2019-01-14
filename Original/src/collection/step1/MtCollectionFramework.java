package collection.step1;

import collection.step1.util.UtilClass;

import java.util.ArrayList;
import java.util.List;

public class MtCollectionFramework {
	public static void main(String[] args) {
		List<Object> al = new ArrayList<>(10); //1
		al.add(111);
		al.add("String");
		al.add(new UtilClass(0, 3));
		al.add(new Object());
		
		for (int i = 0; i < al.size(); i++){
			System.out.println(al.get(i).getClass());
		}
	}
}
