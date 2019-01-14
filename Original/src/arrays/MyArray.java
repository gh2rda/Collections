package arrays;

import java.util.Arrays;

public class MyArray {
	
	/**
	 * На входе предложение
	 * Например
	 * "Однажды в студеную зимнюю пору
	 * Я из лесу вышел - был сильный мороз
	 * Смотрю поднимается медленно в гору
	 * Лошадка несущая хворосту воз"
	 *
	 * Задача, определить длину строки
	 * Если длина кратна двум, то вывести
	 * <p>Длина строки %строка% кратна числу</p>
	 * Подсчитать количество слов, которую имеют
	 * определенную длину
	 *
	 * Ввод предложения выполнить через аргументы приложения
	 *
	 * Например java MyArray %предложение%,
	 * либо через UI Itellij Idea
	 *
	 * */
	public static void main(String args[]) {
		
		String st;
		String outputText = "";
		for (int i = 0; i < args.length; ++i){
			st = args[i];
			String defaultText = String.format("Длина строки %s кратна числу ", st);
			outputText = String.format("Длина строки %s кратна числу ", st);
			if (st.length() % 2 == 0){
				outputText += "два ";
			}
			if (st.length() % 3 == 0){
				outputText += "три ";
			}
			System.out.println(outputText.equals(defaultText) ? "kek" : outputText);
		}
		Arrays.sort(args);
		System.out.println(Arrays.toString(args));
		
	}
}
