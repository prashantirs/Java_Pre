package com.dev;

import java.util.Arrays;

public class Book {
	private int bookId;
	private String bookName;
	private String[] bookAuthor;
	private int bookCost;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String[] getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String[] bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public int getBookCost() {
		return bookCost;
	}
	public void setBookCost(int bookCost) {
		this.bookCost = bookCost;
	}
	
	//source + to_string() to print
	// System.out.println(book1)
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + Arrays.toString(bookAuthor)
				+ ", bookCost=" + bookCost + "]";
	}

	
	
	
}
