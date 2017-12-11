package com.ben.day05;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		// Json是一种固定格式的字符串。
		// 1,JSONObject。类似HashMap，取数据使用key
		// {key:value,key:value,key:value}
		String json01 = "{'name':'小明','age':'27','sex':'true','work':'student'}";
		// 遇到{}就是JsonObject
		JSONObject obj = new JSONObject(json01);// 字符串转化成jsonobject对象
		String name = obj.getString("name");
		System.out.println(name);
		int age = obj.getInt("age");
		System.out.println(age);
		System.out.println(obj);//JSON无序数据的集合

		/**
		 * 遇到{}就是JsonObject，取数据使用key.调用与数据类型相关的方法。例如：数据是int类型。那么就使用getInt()
		 * 
		 */
		String json02 = "{'book':{'page':'350','price':'28'}}";
		JSONObject obj01 = new JSONObject(json02);
		JSONObject book = obj01.getJSONObject("book");
		int page = book.getInt("page");
		System.out.println(page);

		// 遇到[]就是JSONArray.取数据用索引。调用与数据类型相关的方法。
		String json03 = "['book','pen','apple','banana','15']";
		JSONArray arr = new JSONArray(json03);
		Object num = arr.get(1);
		Object num02 = arr.get(2);
		Object num03 = arr.get(3);
		Object num04 = arr.get(4);
		System.out.println(num04);
		System.out.println("遍历=====================================");
		for (Object object : arr) {
			System.out.println(object);
		}
		System.out.println("=====================================");

		String json04 = "['book','pen','apple',{'name':'小明'}]";
		JSONArray arr01 = new JSONArray(json04);
		JSONObject name01 = arr01.getJSONObject(3);
		String xm = name01.getString("name");
		System.out.println(xm);

		/**
		 * 遇到{}就是JsonObject，取数据使用key.调用与数据类型相关的方法。例如：数据是int类型。那么就使用getInt()
		 * 遇到[]就是JSONArray.取数据用索引。调用与数据类型相关的方法。
		 */
		String json05 = "{'name':'小明','book':['算法','Java入门到放弃',{'store':'新华'}]}";
		// 取新华
		JSONObject obj02 = new JSONObject(json05);
		JSONArray book01 = obj02.getJSONArray("book");
		JSONObject store01 = book01.getJSONObject(2);
		String xh = store01.getString("store");
		System.out.println(xh);
	}

}
