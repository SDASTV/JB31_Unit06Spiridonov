package by.epam.unit06.task03;

public class Task03 {
	public static void main(String[] args) {
		Library library = new Library();
		library.addBook(new Book(1, "Брест и Крепость: трагический июнь", "Ростислав Алиев, Илья Рыжов", "УП ПРИНТ",
				2016, 192, 1300.00, "твёрдый"));
		library.addBook(new Book(2, "Брест. Июнь. Крепость", "Ростислав Алиев, Илья Рыжов", "Полиграфика", 2012, 272,
				1500.00, "твёрдый"));
		library.addBook(new Book(3, "The Beatles. Полная иллюстрированная история", "Тим Хилл", "Магма", 2009, 448,
				4800.00, "твёрдый"));
		library.addBook(
				new Book(4, "Штурм Брестской крепости", "Ростислав Алиев", "Эксмо", 2010, 798, 325.00, "твёрдый"));
		library.addBook(new Book(5, "62-й УР и фортфикационная система Бреста", "Вадим Шорох, Виталий Борисов",
				"Альтернатива", 2012, 214, 500.00, "мягкий"));
		library.addBook(new Book(6, "Брест. Лето 1941 г.", "Кристиан Ганцер",
				"Инбелкульт", 2016, 724, 900.00, "твёрдый"));

		System.out.println("Поиск по автору 'Ростислав Алиев'");
		System.out.println(library.searchByAuthor("Ростислав Алиев"));
		System.out.println("Поиск книг, выпущенных после 2015 года");
		System.out.println(library.searchByYear(2015));
	}
}