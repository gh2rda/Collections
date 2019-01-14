package ru.sbt.school.collections.sort;

import ru.sbt.school.collections.entity.Person;
import ru.sbt.school.collections.sort.comparators.AgeComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Класс предоставляет статические методы для сортировки коллекции <code>Person</code> по различным полям.
 */
public class PersonSorter {
	/**
	 * Метод сортирует указанную коллекцию по полю age.
	 *
	 * @param c исходная коллекция, которую нужно отсортировать
	 * @return коллекция, отсортированная по полю age
	 */
	public static Collection<Person> getSortedByAge(Collection<Person> c) {
		// Создаем список на основе переданной в метод коллекции
		List<Person> result = new ArrayList<>(c);

		// Сортируем список
		Collections.sort(result, new AgeComparator());

		// Возвращаем результат - отсортированный список
		return result;
	}
}
