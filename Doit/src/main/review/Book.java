package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
	private String title;
	private String author;
	
	public static void main(String[] args) {
		Book book = new Book();
		
		book.setTitle("어린왕자");
		book.setAuthor("글쓴이");
		
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
	}
}
