package ru.sbt.school.collections.util;

import ru.sbt.school.collections.entity.Person;

import java.util.Collection;
import java.util.Iterator;

/**
 * Вывод коллекций в консоль.
 */
public class PersonPrinter {
	/**
	 * Метод выводит элементы указанной коллекции <code>c</code> в консоль с помощью итератора.
	 *
	 * @param c коллекция, элементы которой выводятся в консоль
	 */
	public static void print(Collection<Person> c){
		Iterator<Person> it = c.iterator();
		while (it.hasNext()) {
			Person p = it.next();
			System.out.println(p.getId() + " " + p.getAge() + " " + p.getName());
		}
		System.out.println();
	}
}
