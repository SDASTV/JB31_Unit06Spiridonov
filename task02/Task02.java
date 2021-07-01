package by.epam.unit06.task02;

public class Task02 {

	public static void main(String[] args) {
		Time a = new Time(5, 44, 3);	// a = 5 часов 44 минуты 03 секунды
		Time b = new Time(50, 3);		// b = некорректное значение - 50 часов 03 минуты
		Time c = new Time();			// c = отсутствуют параметры

		System.out.println("1. Исходные значения\n");
		System.out.print("a = ");
		a.print();
		System.out.print("b = ");
		b.print();
		System.out.print("c = ");
		c.print();
		System.out.println();

		a.set_hh(25);	// Установка часов для a = некорректное значение - 25 часов
		a.set_mm(22);	// Установка минут для a = 22 минуты
		a.set_ss(50);	// Установка секунд для a = 50 секунд
		b.add_seconds(50);	// Увеличение исходного значения b на 50 секунд
		c.add_seconds(70);	// Увеличение исходного значения c на 70 секунд

		System.out.println("2.1. Установка значения для a = 22 минуты 50 секунд");
		System.out.println("2.2. Увеличение исходного значения b из шага №1 на 50 секунд");
		System.out.println("2.3. Увеличение исходного значения c из шага №1 на 70 секунд");
		System.out.println();
		System.out.print("a = ");
		a.print();
		System.out.print("b = ");
		b.print();
		System.out.print("c = ");
		c.print();
		System.out.println();

		System.out.println("3.1. Увеличение значения a из шага №2 на 20 минут");
		System.out.println("3.2. Увеличение значения b из шага №2 на 3 часа");
		System.out.println("3.3. Увеличение значения c из шага №2 на 33 часа");
		System.out.println();

		a.add_minutes(20);
		b.add_hours(3);
		c.add_hours(33);
		a.print();
		b.print();
		c.print();
	}
}