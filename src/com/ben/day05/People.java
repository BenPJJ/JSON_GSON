package com.ben.day05;

import java.util.ArrayList;

public class People {
	/**
	 * 
	 */
	private String name;
	private int age;
	private String sex;
	private ArrayList<Book> books;
	
	
	public People() {}

	public People(String name, int age, String sex, ArrayList<Book> book) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public ArrayList<Book> getBook() {
		return books;
	}

	public void setBook(ArrayList<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", books=" + books + "]";
	}
	
}
