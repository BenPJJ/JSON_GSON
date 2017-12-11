package com.ben.day05;

import java.util.ArrayList;

import com.google.gson.Gson;

public class TestGson {

	public static void main(String[] args) {
		
		// ����{}�ͽ���һ���࣬������Ծ���key�������Ե����;���value�����͡��������ޣ����������������
		String gson01 = "{'name':'kingswim','age':27,'sex':'��','book':{'page':'350','price':'38'}}";
		Gson gson= new Gson();
		Person person01 = gson.fromJson(gson01,Person.class);
		int age = person01.getAge();
		String name = person01.getName();
		int page = person01.getBook().getPage();
		System.out.println(age);
		System.out.println(name);
		System.out.println(page);
		
		// ����[]����һ��ArrayList,Ȼ������ÿһ��Ԫ�ص����͡�
		String gson02 = "{'name':'kingswim','age':27,'sex':'��','books':[{'page':'350','price':'38'},{'page':'250','price':'28'}]}";
		People people = gson.fromJson(gson02,People.class);
		int price = people.getBook().get(0).getPrice();
		System.out.println(price);
		
		// ������json
		People people01 = new People();
		people01.setName("Ben");
		people01.setAge(22);
		people01.setSex("��");
		String p = gson.toJson(people01);
		System.out.println(p);
	}

}
