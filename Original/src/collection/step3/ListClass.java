package collection.step3;

import collection.step3.sort.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListClass {
	
	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("Tom"));
		people.add(new Person("Nick"));
		people.add(new Person("Alice"));
		people.add(new Person("Bill"));
		Collections.sort(people);
		for(Person  p : people){
			System.out.println(p.getName());
		}
	}
	
}
