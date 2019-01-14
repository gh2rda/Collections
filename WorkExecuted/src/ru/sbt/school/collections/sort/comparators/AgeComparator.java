package ru.sbt.school.collections.sort.comparators;

import ru.sbt.school.collections.entity.Person;

import java.util.Comparator;

/**
 * Компаратор, задающий правило сравнения объектов <code>Person</code> по полю <code>age</code>.
 */
public class AgeComparator implements Comparator<Person> {
	@Override public int compare(Person o1, Person o2) {
		// TODO: возможно переполнение, переделать на Integer.compare
		return o1.getAge() - o2.getAge();
	}
}
