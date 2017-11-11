package Lab3;

import Lab2.Book;
import Lab2.BookLinkedList;

public class BookStack {
	
	public BookStack() {
		top = null;
		}
		
	public void push(Book bk) {
		Node node = new Node();
		node.data = bk;
		node.next = top;
		top = node;
		}
		
	public Book peek() {
		return top.data;
	}
		
	public Book pop() {
		Book data = top.data;
		top = top.next;
		//node at top need not be explicitly destroyed as java provides
		// automatic Garbage collection
		return data;
	}
		
	public boolean isEmpty() {
		return top == null;
	}
		
	private Node top;
		
	private class Node {
		Book data;
		Node next;
	}
		
}
