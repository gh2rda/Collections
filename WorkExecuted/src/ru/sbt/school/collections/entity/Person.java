package ru.sbt.school.collections.entity;

/**
 * Класс бизнес-сущности "персона".
 * Персона имеет естественный порядок сортировки, определяемый в реализованном методе <code>compareTo</code>
 * интерфейса <code>Comparable</code>.
 */
public class Person implements Comparable {
	private int id;
	private int age;
	private String name;

	public Person(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override public int compareTo(Object o) {
		Person p = (Person) o;
		return this.getId() - p.getId();
	}
}
