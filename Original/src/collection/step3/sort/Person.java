package collection.step3.sort;

public class Person implements Comparable<Person>{
	
	private String name;
	public Person(String name){
		
		this.name = name;
	}
	public String getName(){return name;}
	
	public int compareTo(Person p){
		
		return name.compareTo(p.getName());
	}
}