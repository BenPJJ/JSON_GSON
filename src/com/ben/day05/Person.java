package com.ben.day05;

public class Person {
	/**
	 * String gson01 = "{'name':'kingswim','age':27,'sex':'ÄÐ','book':{'page':'350','price':'38'}}";
	 */
	private String name;
	private int age;
	private String sex;
	private Book book;
	
	
	public Person() {}

	public Person(String name, int age, String sex, Book book) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.book = book;
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + ", book=" + book + "]";
	}
	
}
