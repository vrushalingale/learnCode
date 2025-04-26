package com.CollectionExample.BooksLibrary;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainBook {
	
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.setId(100);
		book1.setName("Shriman Yogi");
		book1.setAuthor("sawant");
		book1.setPrice(500);
		
		
		Book book2 = new Book();
		book2.setId(200);
		book2.setName("ATKT");
		book2.setAuthor("Palkar");
		book2.setPrice(500);
		
		
		Book book3 = new Book();
		book3.setId(300);
		book3.setName("Java");
		book3.setAuthor("Gosling");
		book3.setPrice(400);
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		for(Book b:bookList) {
			System.out.println("\nArrayList");
			System.out.println("\nBook id   :" + b.getId());
			System.out.println("Book Name   :" + b.getName());
			System.out.println("Book Author :" + b.getAuthor());
			System.out.println("Book Price  :" + b.getPrice());
		}
		
		
		LinkedList<Book> bookLinkedList = new LinkedList<Book>();
		bookLinkedList.add(book1);
		bookLinkedList.add(book2);
		bookLinkedList.add(book3);
		
		
		for(Book b1:bookLinkedList) {
			System.out.println("\nLinkedList");
			System.out.println("\nBook id   :" + b1.getId());
			System.out.println("Book Name   :" + b1.getName());
			System.out.println("Book Author :" + b1.getAuthor());
			System.out.println("Book Price  :" + b1.getPrice());
		}
		
	}
	
	

}
