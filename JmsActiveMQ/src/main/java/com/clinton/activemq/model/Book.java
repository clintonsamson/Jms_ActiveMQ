package com.clinton.activemq.model;

import java.io.Serializable;

public class Book implements Serializable{

	private int bookID;
	private String bookName;

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [BookID=" + bookID + ",BookName =" + bookName + "]";
	}

}
