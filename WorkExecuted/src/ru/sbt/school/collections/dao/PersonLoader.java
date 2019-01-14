package ru.sbt.school.collections.dao;

import ru.sbt.school.collections.entity.Person;

import java.util.Collection;

public class PersonLoader {
	/**
	 * Статический метод добавляет тестовые даные по персонам в указанную коллекцию.
	 * @param c коллекция, куда записать тестовые данные
	 */
	public static void init(Collection<Person> c){
		c.add(new Person(1,25,"John"));
		c.add(new Person(2,20,"John"));
		c.add(new Person(3,22,"Joe"));
		c.add(new Person(5,27,"Alex"));

		// Два дубля
		c.add(new Person(4,25,"Alex"));
		c.add(new Person(4,25,"Alex"));
	}
}
