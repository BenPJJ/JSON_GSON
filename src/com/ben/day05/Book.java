package com.ben.day05;

public class Book {
	/**
	 * 'book':{'page':'350','price':'38'}
	 */
	private int page;
	private int price;
	
	public Book() {}

	public Book(int page, int price) {
		this.page = page;
		this.price = price;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [page=" + page + ", price=" + price + "]";
	}
	
	
	
	
	
	
	
}
