package Lab2;

import Lab2.Book;
import java.util.LinkedList;
import java.util.Iterator;

public class BookLinkedList {
	public static void main(String[] args) {
		LinkedList<Book> bll = new LinkedList<Book>();
		insert(bll, "12345", "Alcamist", 221.0, 19);
		insert(bll, "12346", "198A song of ice and Fire", 99, 78);
		insert(bll, "123457", "Shiva Trilogy", 187, 108);
		insert(bll, "123458", "The Lost Life of Eva Braun", 1200, 120);
		delete(bll, "12346");
		System.out.println(search(bll, "123457"));
		System.out.println(search(bll, "12346"));
		printall(bll);
	}

	public static void insert(LinkedList<Book> list, String isbn, String title, double price, int qty) {
		Book book = new Book();
		book.setIsbn(isbn);
		book.setPrice(price);
		book.setTitle(title);
		book.setStock(qty);
		list.add(book);
	}

	public static void delete(LinkedList<Book> list, String isbn) {
		Iterator itr = list.iterator();
		boolean isexist = false;
		Book book_to_delete = null;
		while (itr.hasNext()) {
			Book bk = (Book) itr.next();
			if (bk.getIsbn() == isbn) {
				isexist = true;
				book_to_delete = bk;
				break;
			}
		}
		if (!isexist) {
			System.out.println("Sorry Book not Found");
			return;
		}
		list.remove(book_to_delete);
	}

	public static boolean search(LinkedList<Book> list, String isbn) {
		Iterator itr = list.iterator();
		boolean isexist = false;
		while (itr.hasNext()) {
			Book bk = (Book) itr.next();
			if (bk.getIsbn() == isbn) {
				isexist = true;
				break;
			}
		}
		if (!isexist) {
			return false;
		}
		return true;
	}

	public static void printall(LinkedList<Book> list) {
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			Book bk = (Book) itr.next();
			System.out.println("ISBN : " + bk.getIsbn() + ", Title : " + bk.getTitle() + ", Price : " + bk.getPrice()
					+ ", Quantity : " + bk.getStock());
		}
	}
}
