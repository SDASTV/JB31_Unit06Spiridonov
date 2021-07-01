package by.epam.unit06.task01;

/*
Класс счётчика содержит 3 поля: минимальное, максимальное и текущее значения.
Обрабатываются следующие случаи:

- при увеличении текущее значение стало больше максимального – прервать выполнение кода метода, создать объект-исключение;
- при уменьшении текущее значение стало меньше минимального – прервать выполнение кода метода, создать объект-исключение;
- в конструктор передано минимальное значение больше максимального – поменять их местами;
- в конструктор передано текущее значение больше максимального – сделать его равным максимальному;
- в конструктор передано текущее значение меньше минимального – сделать его равным минимальному.
*/

public class Counter {
	int min, max, count;

	public Counter(int min, int max, int count) {
		this.min = min;
		this.max = max;
		this.count = count;
		if (max < min) {
			int reverse = max;
			max = min;
			min = reverse;
		}
		if (count < min) {
			count = min;
		}
		if (count > max) {
			count = max;
		}
	}
	public void increase() {
		if (count == max) {
			throw new ArrayIndexOutOfBoundsException(count + 1);
		} else {
			count++;
		}
	}
	public void decrease() {
		if (count == min) {
			throw new ArrayIndexOutOfBoundsException(count - 1);
		} else {
			count--;
		}
	}
	public int getCountValue() {
		return count;
	}
	public void setCountValue(int i) {
		if (i > max || i < min) {
			throw new ArrayIndexOutOfBoundsException(i);
		} else {
			count = i;
		}
	}
}
