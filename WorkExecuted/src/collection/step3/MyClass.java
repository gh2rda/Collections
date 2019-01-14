package collection.step3;

import collection.step3.sort.PersonComparator;
import collection.step3.sort.Person;
import java.util.TreeSet;

public class MyClass {
	
	public static void main(String[] args) {
		PersonComparator pcomp = new PersonComparator();
		TreeSet<Person> people = new TreeSet<>(pcomp);
		people.add(new Person("Tom"));
		people.add(new Person("Nick"));
		people.add(new Person("Alice"));
		people.add(new Person("Bill"));
		for(Person  p : people){
			
			System.out.println(p.getName());
		}
	}
	
}
