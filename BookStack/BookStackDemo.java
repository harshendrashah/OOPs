package Lab3;

import Lab2.Book;
import Lab2.BookLinkedList;

public class BookStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookStack stack = new BookStack();
		stack.push( new Book("101", "Database Systems", 525) );
		stack.push( new Book("111", "Data Structure & Algorithms", 220));
		stack.push( new Book("134", "Object Oriented Programming", 380));
		Book bk = stack.pop();
		System.out.println( bk.toString() );
		bk = stack.peek();
		System.out.println( bk.toString() );	
	}

}
