package com.project.basics;

public class book {
	
	long id;
	String book;
	String authorName;
	
	public book(long id, String book, String authorName) {
		super();
		this.id = id;
		this.book = book;
		this.authorName = authorName;
	}

	public long getId() {
		return id;
	}

	public String getBook() {
		return book;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", book=" + book + ", authorName=" + authorName + "]";
	}
	

}
