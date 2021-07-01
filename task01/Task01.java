package by.epam.unit06.task01;

public class Task01 {

	public static void main(String[] args) {
		int min, max, count;

		Counter a = new Counter(0, 0, 0);
		Counter b = new Counter(0, 0, 0);
		Counter c = new Counter(0, 0, 0);

// Установка нового произвольного значения счётчика 
		min = 100;
		max = 200;
		count = 150;
		a = new Counter(min, max, count);

		System.out.println("-= setCountValue =-");
		System.out.println("min < count < max");
		System.out.println("min = " + min + ", max = " + max + ", count = " + count);
		System.out.println("INPUT -> a = " + a.getCountValue());

		count = min + (int) (Math.random() * (max - min + 1));
		a.setCountValue(count);

		System.out.println("OUTPUT -> a = " + a.getCountValue());
		System.out.println();

// Увеличение счётчика
		min = 400;
		max = 300;
		count = 250;
		b = new Counter(min, max, count);

		System.out.println("-= increase =-");
		System.out.println("count < max < min");
		System.out.println("min = " + min + ", max = " + max + ", count = " + count);
		System.out.println("INPUT -> b = " + b.getCountValue());

		for (int i = 0; i < 50; ++i) {
			b.increase();
		}

		System.out.println("OUTPUT -> b = " + b.getCountValue());
		System.out.println();

// Уменьшение счётчика
		min = 600;
		max = 500;
		count = 650;
		c = new Counter(min, max, count);

		System.out.println("-= decrease =-");
		System.out.println("max < min < count");
		System.out.println("min = " + min + ", max = " + max + ", count = " + count);
		System.out.println("INPUT -> c = " + c.getCountValue());

		for (int i = 0; i < 50; ++i) {
			c.decrease();
		}

		System.out.println("OUTPUT -> c = " + c.getCountValue());
		System.out.println();
	}
}
