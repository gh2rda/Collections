package ru.sbt.school.collections;

import ru.sbt.school.collections.entity.Person;
import ru.sbt.school.collections.dao.PersonLoader;
import ru.sbt.school.collections.util.PersonPrinter;
import ru.sbt.school.collections.sort.PersonSorter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

/**
 * Пример приложения, реализующего сортировки с помощью естественного порядка (natural ordering) и с помощью компараторов.
 */
public class SortExamplesApp {
	public static void main(String[] args) {
		// Создаем экземпляр отсортированного множества TreeSet
		Collection<Person> personList = new TreeSet<>();

		//запрос данных
		PersonLoader.init(personList);

		// Выводим в консоль исходную коллекцию, она отсортирована в естественном порядке (методом Person.compareTo)
		System.out.println("Natural ordering (by id):");
		PersonPrinter.print(personList);

		// Выводим в консоль коллекцию, отсортированную по полю age
		System.out.println("Ordering using a comparator (by age):");
		PersonPrinter.print(PersonSorter.getSortedByAge(personList));
		
	}
}
