package com.ben.day05;

import java.util.ArrayList;

import com.google.gson.Gson;

public class TestGson {

	public static void main(String[] args) {
		
		// 遇到{}就建立一个类，类的属性就是key名，属性的类型就是value的类型。类名不限，但是最好是有意义
		String gson01 = "{'name':'kingswim','age':27,'sex':'男','book':{'page':'350','price':'38'}}";
		Gson gson= new Gson();
		Person person01 = gson.fromJson(gson01,Person.class);
		int age = person01.getAge();
		String name = person01.getName();
		int page = person01.getBook().getPage();
		System.out.println(age);
		System.out.println(name);
		System.out.println(page);
		
		// 遇到[]定义一个ArrayList,然后泛型是每一个元素的类型。
		String gson02 = "{'name':'kingswim','age':27,'sex':'男','books':[{'page':'350','price':'38'},{'page':'250','price':'28'}]}";
		People people = gson.fromJson(gson02,People.class);
		int price = people.getBook().get(0).getPrice();
		System.out.println(price);
		
		// 对象变成json
		People people01 = new People();
		people01.setName("Ben");
		people01.setAge(22);
		people01.setSex("男");
		String p = gson.toJson(people01);
		System.out.println(p);
	}

}
