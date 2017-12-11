package com.ben.day05;

import org.json.JSONArray;
import org.json.JSONObject;

public class TestJson {

	public static void main(String[] args) {
		// Json��һ�̶ֹ���ʽ���ַ�����
		// 1,JSONObject������HashMap��ȡ����ʹ��key
		// {key:value,key:value,key:value}
		String json01 = "{'name':'С��','age':'27','sex':'true','work':'student'}";
		// ����{}����JsonObject
		JSONObject obj = new JSONObject(json01);// �ַ���ת����jsonobject����
		String name = obj.getString("name");
		System.out.println(name);
		int age = obj.getInt("age");
		System.out.println(age);
		System.out.println(obj);//JSON�������ݵļ���

		/**
		 * ����{}����JsonObject��ȡ����ʹ��key.����������������صķ��������磺������int���͡���ô��ʹ��getInt()
		 * 
		 */
		String json02 = "{'book':{'page':'350','price':'28'}}";
		JSONObject obj01 = new JSONObject(json02);
		JSONObject book = obj01.getJSONObject("book");
		int page = book.getInt("page");
		System.out.println(page);

		// ����[]����JSONArray.ȡ����������������������������صķ�����
		String json03 = "['book','pen','apple','banana','15']";
		JSONArray arr = new JSONArray(json03);
		Object num = arr.get(1);
		Object num02 = arr.get(2);
		Object num03 = arr.get(3);
		Object num04 = arr.get(4);
		System.out.println(num04);
		System.out.println("����=====================================");
		for (Object object : arr) {
			System.out.println(object);
		}
		System.out.println("=====================================");

		String json04 = "['book','pen','apple',{'name':'С��'}]";
		JSONArray arr01 = new JSONArray(json04);
		JSONObject name01 = arr01.getJSONObject(3);
		String xm = name01.getString("name");
		System.out.println(xm);

		/**
		 * ����{}����JsonObject��ȡ����ʹ��key.����������������صķ��������磺������int���͡���ô��ʹ��getInt()
		 * ����[]����JSONArray.ȡ����������������������������صķ�����
		 */
		String json05 = "{'name':'С��','book':['�㷨','Java���ŵ�����',{'store':'�»�'}]}";
		// ȡ�»�
		JSONObject obj02 = new JSONObject(json05);
		JSONArray book01 = obj02.getJSONArray("book");
		JSONObject store01 = book01.getJSONObject(2);
		String xh = store01.getString("store");
		System.out.println(xh);
	}

}
