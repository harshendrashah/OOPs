package Lab2;

import java.util.Stack;
import java.util.Iterator;
import Lab2.Book;

public class BookStack {
	public static void main(String[] args) {
		Stack bs = new Stack();
		push(bs,  "12345", "Alcamist", 221.0, 19 );
		push(bs, "12346", "198A song of ice and Fire", 99, 78);
		push(bs, "123457", "Shiva Trilogy", 187, 108 );
		push(bs, "123458", "The Lost Life of Eva Braun", 1200, 120);
		Book bk = (Book)bs.pop();
		System.out.println("POP :-> ISBN : " + bk.getIsbn() + ", Title : " + bk.getTitle() + ", Price : " + bk.getPrice() + ", Quantity : " + bk.getStock());
		bk = (Book)bs.peek();
		System.out.println("PEEK :-> ISBN : " + bk.getIsbn() + ", Title : " + bk.getTitle() + ", Price : " + bk.getPrice() + ", Quantity : " + bk.getStock());
		printall(bs);	
	}	
	public static void push(Stack bs, String isbn, String title, double price, int qty){
		Book book = new Book();
		book.setIsbn(isbn);
		book.setPrice(price);
		book.setTitle(title);
		book.setStock(qty);
		bs.push(book);
	}

	public static void printall(Stack bs){
		Iterator itr= bs.iterator();
		while(itr.hasNext()){
			Book bk = (Book)itr.next();
			System.out.println("ISBN : " + bk.getIsbn() + ", Title : " + bk.getTitle() + ", Price : " + bk.getPrice() + ", Quantity : " + bk.getStock());
		}
	}
}
