package com.ftrue.day09;

/**
 * @ClassName Customer
 * @Description 此类用于演示功能
 * @Author Shark
 * @DateTime 2021年07月07日 09时35分
 * @Version 1.0
 *
 * Customer类的设计
 */
public class Customer {
	//封装客户的编号
	private int id;
	//封装客户的姓名
	private String name;
	//封装客户的性别
	private char gender;
	//封装客户的年龄
	private int age;
	//封装客户的手机
	private String phone;
	//封装客户的邮箱
	private String email;
	//封装自动分配编号变量
	private static int num = 1;

	{
		this.id = num++;
	}

	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getNum() {
		return num;
	}

	public static void setNum(int num) {
		Customer.num = num;
	}
}
